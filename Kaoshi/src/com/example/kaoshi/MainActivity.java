package com.example.kaoshi;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.example.adpter.MyAdpter;
import com.example.bean.Data;
import com.example.bean.MyData;
import com.google.gson.Gson;
import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView lv;
	private Context context;
	private View view;
	private ArrayList<View> mlist;
	private ViewPager viewpager;
	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			if (msg.what == 0x123) {
				MyAdpter myAdpter = (MyAdpter) msg.obj;
				lv.setAdapter(myAdpter);
			}
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		lv = (ListView) findViewById(R.id.lv);
		view = LayoutInflater.from(context).inflate(R.layout.myviewpager, null);
		viewpager = (ViewPager) view.findViewById(R.id.viewpager);
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intetn = new Intent(context, MessageActivity.class);
				startActivity(intetn);
			}
		});

		new Thread() {
			public void run() {
				http();
			}

		}.start();

	}

	private void http() {
		// TODO Auto-generated method stub
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(
				"http://169.254.133.152:8080/AndroidText/comment.json");
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		try {
			HttpResponse response = httpClient.execute(httpPost);
			if (response.getStatusLine().getStatusCode() == 200) {
				httpPost.setEntity(new UrlEncodedFormEntity(list, HTTP.UTF_8));
				InputStream inputStream = response.getEntity().getContent();
				InputStreamReader reader = new InputStreamReader(inputStream,
						"utf-8");
				Gson gson = new Gson();
				MyData myData = gson.fromJson(reader, MyData.class);
				ArrayList<Data> data = myData.getComments().getData();
				Log.i("TAG", data.toString());
				ArrayList<HashMap<String, String>> arraylist = new ArrayList<HashMap<String, String>>();
				for (Data data2 : data) {
					
					HashMap<String, String> map = new HashMap<String, String>();
					map.put("name", data2.getUser().getUsername());
					map.put("data", data2.getCreated_at());
					map.put("title", data2.getContent());
					arraylist.add(map);
				}
				MyAdpter myAdpter = new MyAdpter(arraylist, context, data);
				handler.sendMessage(handler.obtainMessage(0x123, myAdpter));
			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}

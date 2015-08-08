package com.example.adpter;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.bean.Data;
import com.example.kaoshi.R;
import com.lidroid.xutils.BitmapUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdpter extends BaseAdapter {
	private ArrayList<HashMap<String, String>> list;
	private Context mContext;
	private ArrayList<Data> MyList;

	public MyAdpter(ArrayList<HashMap<String, String>> list, Context mContext,
			ArrayList<Data> MyList) {
		super();
		this.list = list;
		this.mContext = mContext;
		this.MyList = MyList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.show,
					null);
			holder.image = (ImageView) convertView.findViewById(R.id.image);
			holder.title = (TextView) convertView.findViewById(R.id.title);
			holder.time = (TextView) convertView.findViewById(R.id.time);
			holder.content = (TextView) convertView.findViewById(R.id.content);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		BitmapUtils utils = new BitmapUtils(mContext);
		utils.display(holder.image, MyList.get(position).getUser().getAvatar());
		holder.title.setText(list.get(position).get("name"));
		holder.time.setText(list.get(position).get("data"));
		holder.content.setText(list.get(position).get("title"));
		return convertView;
	}

	class ViewHolder {
		TextView title, time, content;
		ImageView image;
	}
}

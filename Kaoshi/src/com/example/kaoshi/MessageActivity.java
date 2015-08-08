package com.example.kaoshi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.webkit.WebView;

public class MessageActivity extends Activity {
	private WebView webview;
	private Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		context = this;
		webview = (WebView) findViewById(R.id.webview);
		webview = new WebView(context);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("http://169.254.60.35:8080/MyTestActivity/article.html");
		setContentView(webview);
	}
}

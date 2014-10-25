package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Storemain extends Activity {
	public WebView web;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mccwleaderboard);
		setup();
	}
	public void setup()
	{
		web = (WebView)findViewById(R.id.wbmccw);
	
	web.loadUrl("http://www.multicu.be/store/");
	web.getSettings().setJavaScriptEnabled(true);   
	web.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this 
		//if ROM supports Multi-Touch      
	web.getSettings().setBuiltInZoomControls(true);

		
	}

	}



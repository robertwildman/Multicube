package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Networks extends Activity {
	public TextView twitter , twitch , facebook , youtube;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.networks);
		setup();
	}
	public void setup()
	{
		
		twitter = (TextView)findViewById(R.id.tvnetb1);
		twitch = (TextView)findViewById(R.id.tvnetb2);
		facebook = (TextView)findViewById(R.id.tvnetb3);
		youtube = (TextView)findViewById(R.id.tvnetb1);
	}

	}




package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Spinner;

public class Mccwleaderboard extends Fragment {
	
	
	public Spinner builds;
	public Integer mappos;
	public WebView web;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwleaderboard, container, false);
		 setupweb();
		 return InputFragmentView;
	

	}
	public void setupweb()
	{
		web = (WebView)InputFragmentView.findViewById(R.id.wbmccw);
		
		web.loadUrl("http://www.multicu.be/colonywars/leaderboard");
		web.getSettings().setJavaScriptEnabled(true);   
		web.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this 
			//if ROM supports Multi-Touch      
		web.getSettings().setBuiltInZoomControls(true);
	
	}

}

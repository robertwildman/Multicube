/**
 * 
 */
package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author Robert
 *
 */
public class Syndmain extends Fragment {

	public TextView maps , leaderboard;
	public View InputFragmentView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccw, container, false);
		 setup();
		 return InputFragmentView;
	

	}
	public void setup()
	{
		//CLass to set up the textview 
		
		TextView arenas , leaderboard;
		arenas = (TextView)InputFragmentView.findViewById(R.id.tvsyndmainb2);
		arenas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Fragment fragment = new Syndarena();
				FragmentManager fragmentManager = getFragmentManager();
	            fragmentManager.beginTransaction()
	                    .replace(R.id.content_frame, fragment).commit();
	            getActivity().setTitle("The Syndicate Games Arenas");
				
			}
		});
		leaderboard = (TextView)InputFragmentView.findViewById(R.id.tvsyndmainb1);
		leaderboard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Fragment fragment = new Syndweb();
				FragmentManager fragmentManager = getFragmentManager();
	            fragmentManager.beginTransaction()
	                    .replace(R.id.content_frame, fragment).commit();
	            getActivity().setTitle("The Syndicate Games Leaderboard");
			}
		});
	}

}

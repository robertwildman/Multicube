package com.wildapps.multicube;


import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Mccw extends Fragment {
	public Button Maps,gp , leaderboard,Classes;
	public View InputFragmentView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccw, container, false);
		 setuptextview();
		 return InputFragmentView;
	

	}
public void toast(String Msg)
{
	Toast.makeText(getActivity(), Msg, Toast.LENGTH_SHORT).show();
}
public void setuptextview()
{
	//The Buttons for the MCCW Class and will change the Fragment to the new view. 
	Maps = (Button)InputFragmentView.findViewById(R.id.mccwb4);
	Maps.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Fragment fragment = new Mccwmap();
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
            getActivity().setTitle("MCCW Map");
		}
	});
	gp = (Button)InputFragmentView.findViewById(R.id.mccwb1);
	gp.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Fragment fragment = new Mccwgp();
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
            getActivity().setTitle("MCCW Gameplay");
		}
	});
	
	leaderboard = (Button)InputFragmentView.findViewById(R.id.mccwb2);
	leaderboard.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Fragment fragment = new Mccwleaderboard();
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
            getActivity().setTitle("MCCW Leaderboard");
		}
	});
	
	Classes = (Button)InputFragmentView.findViewById(R.id.mccwb3);
	Classes.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// Starts the Class Acitivty
			Fragment fragment = new Mccwclass();
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
            getActivity().setTitle("MCCW CLass");
		}
	});
}
}

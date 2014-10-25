package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Antipvpmain extends Fragment {
	
	public View InputFragmentView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccw, container, false);
		 setup();
		 return InputFragmentView;
	

	}
	public void setup()
	{
		TextView leaderboard;
		leaderboard = (TextView)InputFragmentView.findViewById(R.id.tvantib1);
		leaderboard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		    startActivity(new Intent(getActivity().getBaseContext(), Antipvpleader.class));
			}
		});
	}

}

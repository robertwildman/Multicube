package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Mccwgp extends Fragment{
	public TextView buildings;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwgameplay, container, false);
		 settextview();
		 return InputFragmentView;
	

	}
	public void settextview()
	{
		
		buildings = (TextView)InputFragmentView.findViewById(R.id.tvmccwgpb1);
		buildings.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Fragment fragment = new Mccwbuild();
				FragmentManager fragmentManager = getFragmentManager();
	            fragmentManager.beginTransaction()
	                    .replace(R.id.content_frame, fragment).commit();
	            getActivity().setTitle("MCCW Buildings");
			}
		});
	}
}

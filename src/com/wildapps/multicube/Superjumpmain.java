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

public class Superjumpmain extends Fragment {
public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.superjumpmain, container, false);
		 
		 return InputFragmentView;
	

	}
	public void setup()
	{
		TextView arenas;
		
		arenas = (TextView)InputFragmentView.findViewById(R.id.tvsuperb1);
		arenas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Fragment fragment = new Superjumparenas();
				FragmentManager fragmentManager = getFragmentManager();
	            fragmentManager.beginTransaction()
	                    .replace(R.id.content_frame, fragment).commit();
	            getActivity().setTitle("Superjump Arenas");
				
			}
		});
	}

	}




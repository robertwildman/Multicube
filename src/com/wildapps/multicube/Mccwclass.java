package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Mccwclass  extends Fragment{
	public TextView buildings;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwclass, container, false);
		 
		 return InputFragmentView;
	

	}
}

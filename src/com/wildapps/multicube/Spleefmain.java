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

public class Spleefmain extends Fragment {
	
public View InputFragmentView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.spleefarena, container, false);
		 setup();
		 return InputFragmentView;
	

	}
public void setup()
{
	TextView arenas;
	arenas = (TextView)InputFragmentView.findViewById(R.id.tvnetb1);
	arenas.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Fragment fragment = new Spleefarena();
			FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, fragment).commit();
            getActivity().setTitle("Spleef Arena");
		}
	});
}

}

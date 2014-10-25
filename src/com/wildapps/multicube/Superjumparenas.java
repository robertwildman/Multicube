package com.wildapps.multicube;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Superjumparenas extends Fragment {
	
	
	public Spinner builds;
	public Integer mappos;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwleaderboard, container, false);
		 setupspinner();
		 return InputFragmentView;
	

	}
	public void setupspinner()
	{
		builds = (Spinner)InputFragmentView.findViewById(R.id.spsynd);
		
		builds.setOnItemSelectedListener(new OnItemSelectedListener() {
 
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                    int position, long id) {
                // On selecing a spinner item
                
                findmapinfo(position , adapter.getItemAtPosition(position).toString());
 
                // Showing selected spinner item
              
            }
 
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
 
            }
        });
	}
	public void findmapinfo(int pos, String title)
	{
	
		TextView mapinfo , maptitle,mapowner;
		ImageView image;
		mapinfo = (TextView)InputFragmentView.findViewById(R.id.tvsyndmaininfo);
		maptitle = (TextView)InputFragmentView.findViewById(R.id.tvsyndmaintitle);
		mapowner = (TextView)InputFragmentView.findViewById(R.id.tvsyndmainowner);
		image = (ImageView)InputFragmentView.findViewById(R.id.ivsyndimage);
		switch (pos) 
		{
            case 0:  
            	maptitle.setText(title);
            	mapinfo.setText("In ages gone by, the air nomads of the east forged great citadels in the sky. Since the extinction of this great and powerful race, all but few of their the mighty constructions have fallen from the sky and noone dared travel there, until now." );
            	mapowner.setText("Built by Hyperion");
            	image.setImageResource(R.drawable.syndfloat);
                     break;
                     
            case 1:  
            	maptitle.setText(title);
            	mapinfo.setText("An arid town, abandoned long ago and left to slowly fall into ruin. Any unfortunate soul to find themselves stuck there is surely lost. The only hope of escape is to beat your opponent into submission.");
            	mapowner.setText("Built by Hyperion");
            	image.setImageResource(R.drawable.synddesert);
            	break;
            
            case 2:   maptitle.setText(title);
            	mapinfo.setText("After being exposed to chemical weapons during WW3, this lonely warehouse has become host to many thriving species, and in recent times is more well know for the savagery which takes place within.");
            	mapowner.setText("Built by Mithrintia");	
            	image.setImageResource(R.drawable.syndover);
            	break;
            case 3:  maptitle.setText(title);
            	mapinfo.setText("A baron wasteland, you must be quick to reach them. Should you fail, there will be no hope for you as trying to avoid your enemy on a map such as this is impossible. With deadly lava pool and fierce fires littering the arena, only one will survive.");
            	mapowner.setText("Built by Mithrintia");
            	image.setImageResource(R.drawable.synddeath);
            	break;
           
            default: ;
                     break;
        }
	}


}

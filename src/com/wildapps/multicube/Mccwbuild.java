package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Mccwbuild extends Fragment {
	
	
	public Spinner builds;
	public Integer mappos;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwbuildings, container, false);
		 setupspinner();
		 return InputFragmentView;
	

	}
	public void setupspinner()
	{
		builds = (Spinner)InputFragmentView.findViewById(R.id.spbuild);
		builds.setOnItemSelectedListener(new OnItemSelectedListener() {
 
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                    int position, long id) {
                // On selecting a spinner item
                
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
	
		TextView mapinfo , maptitle;
		mapinfo = (TextView)InputFragmentView.findViewById(R.id.tvmccwbuilddesc);
		maptitle = (TextView)InputFragmentView.findViewById(R.id.tvmccwbuildtitle);
		switch (pos) 
		{
		 
            case 0:  maptitle.setText(title);
            	mapinfo.setText("The spawnpoint of your team. Blacksmith - The general and the warrior will get their weapons when this has been built." );
            		
                     break;
                     
            case 1:  
            	maptitle.setText(title);
            	mapinfo.setText("The archer, the peasant and the flying archer will get their weapons when this has been built.");
                     break;
            
            case 2:   maptitle.setText(title);
            	mapinfo.setText("The mage, the cloaker, the inferno and the dark knight will get their weapons when this has been built. The flying archers will also get their flying abilities when this building has been built.");
                     break;
            case 3:  maptitle.setText(title);
            	mapinfo.setText("In this building you will be able to buy food. You might die of hunger, so you should probably build this. Wall - a 3x3 brick wall. Build this around your colony to protect it.");
                     break;
            case 4:  maptitle.setText(title);
            	mapinfo.setText("In this building you will be able to buy health potions, and a compass, which will show you the way to the other colonies. Right click it, and it will change direction. You'll also get a 33% chance of reviving when you die.k");
                     break;
            case 5:  maptitle.setText(title);
            	mapinfo.setText("This building has the same properties as the Church apart from the fact that revivals have a 50% chance and the priest will get their items. Cathedral is an upgrade to the Church.");
                     break;
            case 6:  maptitle.setText(title);
            	mapinfo.setText("Build this, and upgrade it to either a guard or cannon tower. Upgrading the scout tower to a cannon tower, will make it shoot fire charges at enemies. Upgrading the scout tower to a guard tower, will make it shoot arrows at enemies.");
                     break;
            case 7:  maptitle.setText(title);
        	mapinfo.setText("In this building you will be able to buy gardening tools and saplings if you're ever short on them.");
                 break;
            
            default: ;
                     break;
        }
	}

}

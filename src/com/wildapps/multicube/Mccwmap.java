package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.*;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.TextView;

public class Mccwmap extends Fragment {
	
	
	public Spinner maps;
	public Integer mappos;
	public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwmap, container, false);
		 setupspinner();
		 return InputFragmentView;
	

	}
	public void setupspinner()
	{
		maps = (Spinner)InputFragmentView.findViewById(R.id.spmaps);
		maps.setOnItemSelectedListener(new OnItemSelectedListener() {
 
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                    int position, long id) {
                // On selecting a spinner item
                mappos = position;
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
		String monthString;
		TextView mapinfo , maptitle , mapowner;
		mapinfo = (TextView)InputFragmentView.findViewById(R.id.tvmccwmap);
		maptitle = (TextView)InputFragmentView.findViewById(R.id.tvmccwmaptitle);
		mapowner = (TextView)InputFragmentView.findViewById(R.id.tvmccwmapmaker);
		switch (pos) 
		{
		 
            case 0:  maptitle.setText(title);
            	mapinfo.setText("Canyon, A land ravaged by years against fierce natural forces is now separated into 4 almost identical sides."
            		+ " These sides will be home to the groups of adventurers who are sworn to fight to the death until their entire colony is "
            		+ "eliminated or they remain the sole victors." );
            		mapowner.setText( "Built by Watson610");
                     break;
                     
            case 1:  
            	maptitle.setText(title);
            	mapinfo.setText("A dense woodland"
            		+ " spanning the entire map, you must navigate these obstacles to find your opponents and eliminate them. Failure to do so will end with your inevitable "
            		+ "demise as you become the hunted." );
        		mapowner.setText(
            		"Built by Pivotcrafter");
                     break;
            case 2:   maptitle.setText(title);
            	mapinfo.setText("Forest Hills - The thick canopy of trees covering the"
            		+ " entire map provides lots of cover with mountainous peaks protruding from the forest, you and your team to go undercover and"
            		+ " assassinate the enemies." );
        		mapowner.setText(
            		 "Built by Pivotcrafter");
                     break;
            case 3:  maptitle.setText(title);
            	mapinfo.setText("An arena of natural beauty but home to scenes of fierce combat. This expansive plain holds"
            		+ " the key essentials to unchallenged victory but can also provide "
            		+ "difficulties when trying to track down the last few evasive enemies!");
        		mapowner.setText( "Built by Pivotcrafter");
                     break;
            case 4:  maptitle.setText(title);
            	mapinfo.setText("In the humid atmosphere of the jungle you must combat the harsh elements in order to succeed. The towering jungle trees provide "
            		+ "ample funds for every team, leading to fast paced matches!");
        		mapowner.setText("Built by TheObsidianHawk");
                     break;
            case 5:  maptitle.setText(title);
            	mapinfo.setText("A seemingly peaceful landscape is turned hostile when 4 teams take to the stage in the ultimate battle of strength and integrity, only one will prevail and in this"
            		+ " environment you cannot afford to be complacent with resources!");
        		mapowner.setText( "Built by Hyperion");
                     break;
            case 6:  maptitle.setText(title);
            	mapinfo.setText("No Info");
        		mapowner.setText( "Built by Meian");
                     break;

            
            default: 

            	
                     break;
        }
	}
}

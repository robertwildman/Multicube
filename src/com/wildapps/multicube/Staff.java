package com.wildapps.multicube;

import com.wildapps.multicube.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Staff extends Fragment {
public View InputFragmentView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		InputFragmentView = inflater.inflate(R.layout.mccwleaderboard, container, false);
		 setup();
		 return InputFragmentView;
	

	}
	public void setup()
	{
		String[] mTestArray;
		Spinner stafflist;
		stafflist = (Spinner)InputFragmentView.findViewById(R.id.spstaff);
		
		stafflist.setOnItemSelectedListener(new OnItemSelectedListener() {
 
            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                    int position, long id) {
                // On selecting a spinner item
                
                // Showing selected spinner item

            	GridView gridView = (GridView) InputFragmentView.findViewById(R.id.gv_demo); 
                gridView.setAdapter(new GridViewContent(getActivity().getBaseContext()));
            	  //findmapinfo(position , adapter.getItemAtPosition(position).toString());
            	
              
            }
 
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
 
            }
        });
	}
	public void findmapinfo(int pos, String title)
	{

		ListView staffout;

		staffout = (ListView)InputFragmentView.findViewById(R.id.lvstaff);
		switch (pos) 
		{
		 
            case 0:  
                     break;
                     
            case 1:  
            	ArrayAdapter<String> modeAdapter1 = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.Admins));
            	staffout.setAdapter(modeAdapter1);
            	break;
            
            case 2:   
            	ArrayAdapter<String> modeAdapter2 = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.Developers));
            	staffout.setAdapter(modeAdapter2);
            	break;
            case 3:  
            	ArrayAdapter<String> modeAdapter3 = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.Senior_Mods));
            	staffout.setAdapter(modeAdapter3);
            	break;
            case 4:  
            	ArrayAdapter<String> modeAdapter4 = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.Mods));
            	staffout.setAdapter(modeAdapter4);
            	break;
            case 5:  
            	ArrayAdapter<String> modeAdapter5 = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, android.R.id.text1, getResources().getStringArray(R.array.Helpers));
            	staffout.setAdapter(modeAdapter5);
        	break;
        	
           
            
            default: ;
                     break;
        }
	}
	}

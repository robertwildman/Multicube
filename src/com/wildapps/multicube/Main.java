package com.wildapps.multicube;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Fragment {
	public TextView Maps,gp , leaderboard,Classes;
	public ListView news,Twitter,Forum;
	public String[] stnews,sttweets,stforum;
	public View InputFragmentView;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		//Give the user a dialog so they knwo it is loading
		
		 InputFragmentView = inflater.inflate(R.layout.frontpage, container, false);
		 //setuptextview();
		 return InputFragmentView;
	

	}

public void setuptextview()
{
	//Will Display how many people on server
}


}

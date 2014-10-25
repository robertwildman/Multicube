package com.wildapps.multicube;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
 
public class GridViewContent extends BaseAdapter {
 
	private Context context;
 
	public int [] gv_fill = {
		R.drawable.staff1,
		R.drawable.staff2,
		R.drawable.staff3,
		R.drawable.staff4,
		R.drawable.staff5,
		R.drawable.staff6,
		R.drawable.staff7,
		
 
	};
 
		public GridViewContent(Context c){
	        context = c;
	    }
 
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return (gv_fill.length);
	}
 
	@Override
	public Object getItem(int position) {
		return gv_fill[position];
 
	}
 
	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
 
	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
 
		ImageView imageView = new ImageView(context);
        imageView.setImageResource(gv_fill[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 200));
        TextView text = new TextView(context);
        text.setText("this");
        LinearLayout view = new LinearLayout(context);
        view.addView(imageView);
        
        view.addView(text);
        return view;
        
    }
 
}
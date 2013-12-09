package com.example.app_indicator_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.LinePageIndicator;

public class SampleCirclesDefault extends BaseSampleActivity{
	
    String[] NameFotoSerieProjekte = {"Kapellen und ihre Altäre","Teenagemama","Der Liebesbrief","In Erinnerung an morgen","Heimat","Leipziger Künstler","Spinnerei","In nomine Patris","Parents","Vaterzeit","Schwedenfamilie"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("design","SampleCirclesDefault Activity started");
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_circles);
        
        


        Bundle b = getIntent().getExtras();
        int value = b.getInt("key");
                
        TextView textview =  (TextView) findViewById(R.id.textView1); 
        textview.setText(NameFotoSerieProjekte[value-1]);
        
        mAdapter = new TestFragmentAdapter(getSupportFragmentManager(),value);
//        mAdapter = (ImageAdapter) new ImageAdapter(getSupportFragmentManager());
 

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
//		item.getIcon().get
		Log.d("design",String.valueOf(item.getItemId()));
		// TODO Auto-generated method stub
		
	    switch (item.getItemId()) {
        case android.R.id.home:
            // go to previous screen when app icon in action bar is clicked
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
    }
			
		
		
		
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		Log.d("design"," onKeyDown()");
		
	    switch(keyCode){
	    case KeyEvent.KEYCODE_BACK:
	        // do something here 
	    	
            // go to previous screen when app icon in action bar is clicked
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}
	
	
	
	public void onBackPressed(){
	     // do something here and don't write super.onBackPressed()
		
		Log.d("design"," onBackPressed()");
		
		
		
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}
    
   
}

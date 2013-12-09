package com.example.app_indicator_1;


import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaPlayerActivity  extends BaseSampleActivity {
	MediaPlayer mp;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.audio);
        
        
        
        Button mybutton = (Button) findViewById(R.id.button1);
        mybutton.setOnClickListener(new Button.OnClickListener() {

        	
            public void onClick(View v) {
            	mp = MediaPlayer.create(MediaPlayerActivity.this, R.raw.b_erguen);
                mp.start();
                mp.setOnCompletionListener(new OnCompletionListener() {

                    public void onCompletion(MediaPlayer arg0) {

                    }
                });
            }
        });
        
        Button mybutton2 = (Button) findViewById(R.id.button2);
        mybutton2.setOnClickListener(new Button.OnClickListener() {
        	
        	public void onClick(View v) {
        		
        		mp.stop();
        		mp.setOnCompletionListener(new OnCompletionListener() {
        			
        			public void onCompletion(MediaPlayer arg0) {
        				
        			}
        		});
        	}
        });
    }
}

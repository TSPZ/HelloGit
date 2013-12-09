package com.example.app_indicator_1;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {

	 private static String TAG = SplashActivity.class.getName();
	 private static long SLEEP_TIME = 5;    // Sleep for some time

	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);

	  this.requestWindowFeature(Window.FEATURE_NO_TITLE);    // Removes title bar
	  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,     WindowManager.LayoutParams.FLAG_FULLSCREEN);    // Removes notification bar

	  setContentView(R.layout.splash);
	  
	  // Start timer and launch main activity
	  IntentLauncher launcher = new IntentLauncher();
	  launcher.start();
	  
	}

	 private class IntentLauncher extends Thread { 	 
 	 
	  
	  public void run() {
	     try {
 
	    	 
	    	 
	    	 ConnectivityManager cMgr = (ConnectivityManager)
	    			 getSystemService(Context.CONNECTIVITY_SERVICE);
	    			 NetworkInfo netInfo = cMgr.getActiveNetworkInfo();
	    			 Log.d("net net net",netInfo.toString());
	    	 
	        // Sleeping
	        Thread.sleep(SLEEP_TIME*100);
	     } catch (Exception e) {
	        Log.e(TAG, e.getMessage());
	     }

	     // Start main activity
	     
	     Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//	     Intent intent2 = new Intent(SplashActivity.this, MainActivity.class);
	     
//	     SplashActivity.this.startActivity(intent2);
	     SplashActivity.this.startActivity(intent);
	     SplashActivity.this.finish();
	  }
	}
	}

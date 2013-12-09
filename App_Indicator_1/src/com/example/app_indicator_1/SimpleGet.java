package com.example.app_indicator_1;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class SimpleGet extends BaseSampleActivity {

    private static final String CLASSTAG = SimpleGet.class.getSimpleName();

    private EditText getInput;
    private TextView getOutput;
    private Button getButton;
	private ImageView getImage;
	
	

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.simple_get);

        
        this.getImage = (ImageView) findViewById(R.id.imageView1);
        this.getInput = (EditText) findViewById(R.id.get_input);
        this.getOutput = (TextView) findViewById(R.id.get_output);
        this.getButton = (Button) findViewById(R.id.get_button);
        
        
        this.getImage.setImageResource(R.drawable.desert);;

        this.getButton.setOnClickListener(new OnClickListener() {

        	
        	
        	
            public void onClick(View v) {                
                DownloadWebPageTask task = new DownloadWebPageTask();
                task.execute(new String[] { "http://h2219284.stratoserver.net:1337" });             
            }
        });
    };

    /**
     * Perform an HTTP GET with HttpUrlConnection.
     * 
     * @param location
     * @return
     */
    
    private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
          String response = "";
          for (String url : urls) {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(url);
            try {
              HttpResponse execute = client.execute(httpGet);
              InputStream content = execute.getEntity().getContent();

              BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
              String s = "";
              while ((s = buffer.readLine()) != null) {
                response += s;
              }

            } catch (Exception e) {
              e.printStackTrace();
            }
          }
          return response;
        }

        @Override
        protected void onPostExecute(String result) {
        	
        	getOutput.setText(result);
        }
    
    
    
    
    
    
    
    
    
    
    
//    private String getHttpResponse(String location) {
//        String result = null;
//        URL url = null;
//        Log.d(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " location = " + location);
//
//        try {
//            url = new URL("http://h2219284.stratoserver.net:1337");
////            url = new URL(location);
//            Log.d(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " url = " + url);
//        } catch (MalformedURLException e) {
//            Log.e(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " " + e.getMessage());
//        }
//
//        if (url != null) {
//            try {
//                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
//                BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
//                String inputLine;
//
//                int lineCount = 0; // limit the lines for the example
//                while ((lineCount < 10) && ((inputLine = in.readLine()) != null)) {
//                    lineCount++;
//                    Log.v(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " inputLine = " + inputLine);
//                    result += "\n" + inputLine;
//                }
//
//                in.close();
//                urlConn.disconnect();
//
//            } catch (IOException e) {
//                Log.e(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " " + e.getMessage());
//            }
//        } else {
//            Log.e(Constants.LOGTAG, " " + SimpleGet.CLASSTAG + " url NULL");
//        }
//        return result;
//    }
    }
}

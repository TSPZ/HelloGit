package com.example.app_indicator_1;

import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

public final class TestFragment extends Fragment {
	
    private static final String KEY_CONTENT = "TestFragment:Content";
	private static final String KEY_PICTURE = "TestFragment:Picture";
    
//    private static final String KEY_CONTENT = "TestFragment:Content";

    public static TestFragment newInstance(String content, Integer mThumbIds) {
        TestFragment fragment = new TestFragment();

//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 2; i++) {
//            builder.append(content).append(" ");
//        }
//        builder.deleteCharAt(builder.length() - 1);
//        fragment.mContent = builder.toString();
        fragment.mContent = content;
        fragment.mpicture = mThumbIds;

        return fragment;
    }

    private String mContent = "???";
//    private int mpicture = -1 ;
    private int mpicture = R.drawable.nomine_19birke;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
            mContent = savedInstanceState.getString(KEY_CONTENT);
            mpicture = savedInstanceState.getInt(KEY_PICTURE);
        }      
        
        // dynamic loading: photo series and audio if attached
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


//    	ScrollView scrollview = new ScrollView(getActivity());
        
    	
    	TextView text = new TextView(getActivity());
        text.setGravity(Gravity.CENTER);
        text.setText(mContent);
//        text.setTextSize(20 * getResources().getDisplayMetrics().density);
//        text.setPadding(20, 20, 20, 20);
        
//        TextView text2 = new TextView(getActivity());
//        text2.setGravity(Gravity.BOTTOM);
//        text2.setText("Dynamic Text from onCreateView:  "+mContent);
//        text2.setTextSize(20 * getResources().getDisplayMetrics().density);
//        text2.setPadding(20, 60, 20, 20);
        
        ImageView imageview = new ImageView(getActivity());
        if(mpicture == 0 ) {
        	
        	
        	mpicture = 2130837584;
        }
        imageview.setImageResource(mpicture);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
//        layout.addView(text2);
        layout.addView(imageview);
        layout.addView(text);
        
//        scrollview.addView(layout);        
//        return scrollview;
        
        return layout;
        
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_CONTENT, mContent);
        outState.putInt(KEY_PICTURE, mpicture);
    }  


}

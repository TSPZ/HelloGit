//package com.example.app_indicator_1;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import android.app.ActionBar;
//import android.app.ActionBar.Tab;
//import android.app.FragmentTransaction;
//import android.app.ListActivity;
//import android.app.ListFragment;
//import android.content.Context;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.KeyEvent;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemSelectedListener;
//import android.widget.ArrayAdapter;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.Spinner;
//import android.widget.TextView;
//
//
//import android.support.v4.app.FragmentPagerAdapter;
//
//
//public class StartListenFragment extends ListFragment implements
//ActionBar.TabListener{
//	
////	new code 15:41
//	
//    String[] text = { "Kapellen", "Teenagemamas", "Liebesbrief", "In Erinnerung an Morgen", "Heimat",  "Leipziger Künstler",  "MitOst, Space-Lab Spinnerei", "In nomine patris", "Parents", "Vaterzeit","Schwedenfamilie"};
//	 int[] image = { R.drawable.kapellen_logo,  R.drawable.teenagemama_logo, R.drawable.liebesbrief_logo, R.drawable.erinnerung_logo, R.drawable.heimat_logo,  R.drawable.kuenstler_logo,  R.drawable.mitost_logo, R.drawable.nomine_logo, R.drawable.parents_logo, R.drawable.vaterzeit_logo,R.drawable.schwedenfamilie_logo};
//	 
//	 int textlength = 0;
//	 
//	 ArrayList<String> text_sort = new ArrayList<String>();
//	 ArrayList<Integer> image_sort = new ArrayList<Integer>();	   
//			 
//	    @Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//	    	return inflater.inflate(R.layout.simple_list_view,container,false);
//		}
//					 
//			 
//	@Override
//	public void onStart() {
//		// TODO Auto-generated method stub
//		super.onCreate(getArguments());
//		
//		
////        ActionBar bar = getActionBar();
////        bar.setDisplayShowTitleEnabled(false);
//		
//
//		 
//		 for (int i = 0; i < text.length; ++i) {
//	        	text_sort.add(text[i]);
//		        }
//	        
//	     for (int j = 0; j < image.length; ++j) {
//	        	image_sort.add(image[j]);
//		        }
//	     
//	        final MyCustomAdapter adapter = new MyCustomAdapter(text, image);			
//		
//		setListAdapter(adapter);
//				
//		ListView listview = (ListView)getView().findViewById(android.R.id.list);
////		listView.set
//		
//		
//		listview.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//					long arg3) {
//				// TODO Auto-generated method stub
////				switch (arg2) {
////	
////				case 0:
////					
////					Intent intent1 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b1 = new Bundle();
////					b1.putInt("key", 1); //Your id
////					intent1.putExtras(b1); //Put your id to your next Intent					
////					startActivity(intent1);
////					finish();
////					break;
////					
////				case 1:
////					
////					Intent intent2 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b2 = new Bundle();
////					b2.putInt("key", 2); //Your id
////					intent2.putExtras(b2); //Put your id to your next Intent					
////					startActivity(intent2);
////					finish();
////
////					break;
////					
////				case 2:
////					
////					Intent intent3 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b3 = new Bundle();
////					b3.putInt("key", 3); //Your id
////					intent3.putExtras(b3); //Put your id to your next Intent					
////					startActivity(intent3);
////					finish();
////
////					
////					break;
////					
////				case 3:
////					
////					Intent intent4 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b4 = new Bundle();
////					b4.putInt("key", 4); //Your id
////					intent4.putExtras(b4); //Put your id to your next Intent					
////					startActivity(intent4);
////					finish();
////					
////					
////					break;
////				case 4:
////					
////					Intent intent5 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b5 = new Bundle();
////					b5.putInt("key", 5); //Your id
////					intent5.putExtras(b5); //Put your id to your next Intent					
////					startActivity(intent5);
////					finish();
////					break;
////					
//////				case 5:
//////					
//////					Intent intent6 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
//////					Bundle b6 = new Bundle();
//////					b6.putInt("key", 6); //Your id
//////					intent6.putExtras(b6); //Put your id to your next Intent					
//////					startActivity(intent6);
//////					finish();
//////					
//////					break;
////					
////				case 5:
////					
////					Intent intent7 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b7 = new Bundle();
////					b7.putInt("key", 6); //Your id
////					intent7.putExtras(b7); //Put your id to your next Intent					
////					startActivity(intent7);
////					finish();
////					
////					
////					break;
//////				case 7:
//////					
//////					Intent intent8 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
//////					Bundle b8 = new Bundle();
//////					b8.putInt("key", 8); //Your id
//////					intent8.putExtras(b8); //Put your id to your next Intent					
//////					startActivity(intent8);
//////					finish();
//////					break;
////					
////				case 6:
////					
////					Intent intent9 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b9 = new Bundle();
////					b9.putInt("key", 7); //Your id
////					intent9.putExtras(b9); //Put your id to your next Intent					
////					startActivity(intent9);
////					finish();
////					
////					break;
////					
////				case 7:
////					
////					Intent intent10 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b10 = new Bundle();
////					b10.putInt("key", 8); //Your id
////					intent10.putExtras(b10); //Put your id to your next Intent					
////					startActivity(intent10);
////					finish();
////					
////					
////					break;
////				case 8:
////					
////					Intent intent11 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b11 = new Bundle();
////					b11.putInt("key", 9); //Your id
////					intent11.putExtras(b11); //Put your id to your next Intent					
////					startActivity(intent11);
////					finish();
////					break;
////					
////				case 9:
////					
////					Intent intent12 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b12 = new Bundle();
////					b12.putInt("key", 10); //Your id
////					intent12.putExtras(b12); //Put your id to your next Intent					
////					startActivity(intent12);
////					finish();
////					
////					break;
////					
////				case 10:
////					
////					Intent intent13 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b13 = new Bundle();
////					b13.putInt("key", 11); //Your id
////					intent13.putExtras(b13); //Put your id to your next Intent					
////					startActivity(intent13);
////					finish();
////					
////					
////					break;	
////				case 11:
////					
////					Intent intent14 = new Intent(getApplicationContext(),SampleCirclesDefault.class);
////					Bundle b14 = new Bundle();
////					b14.putInt("key", 14); //Your id
////					intent14.putExtras(b14); //Put your id to your next Intent					
////					startActivity(intent14);
////					finish();
////					
////					
////					break;	
////
////
////
////					
//////				case 7:
//////					
//////					Intent intent7 = new Intent(getApplicationContext(),CustomListViewSearch.class);
//////					startActivity(intent7);
//////					break;
//////					
//////				case 8:
//////					Intent intent8 = new Intent(getApplicationContext(),SimpleGet.class);
//////					startActivity(intent8);
//////					
//////					break;
//////				case 9:
//////					Intent intent9 = new Intent(getApplicationContext(),MediaPlayerActivity.class);
//////					startActivity(intent9);	
//////					
//////					break;
////
////				default:
////					break;
////				}
////				
//				
//			}
//		});		
//	}
//	
//
//
////		@Override
////		public boolean onKeyDown(int keyCode, KeyEvent event)
////		{
////		    if ((keyCode == KeyEvent.KEYCODE_BACK))
////		    {	
////		        // do something here 
////		    	
////	            // go to previous screen when app icon in action bar is clicked
////	            Intent intent = new Intent(this, MainActivity.class);
////	            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
////	            startActivity(intent);
////	            
////		        return true;
////		    	
//////				android.os.Process.killProcess(android.os.Process.myPid());
//////		        finish();
////		    }
////		    return super.onKeyDown(keyCode, event);
////		}
//	
////
////	  private class StableArrayAdapter extends ArrayAdapter<String> {
////
////	    HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();
////
////	    public StableArrayAdapter(Context context, int textViewResourceId,
////	        List<String> objects) {
////	      super(context, textViewResourceId, objects);
////	      for (int i = 0; i < objects.size(); ++i) {
////	        mIdMap.put(objects.get(i), i);
////	      }
////	    }
////
////	    @Override
////	    public long getItemId(int position) {
////	      String item = getItem(position);
////	      return mIdMap.get(item);
////	    }
////
////	    @Override
////	    public boolean hasStableIds() {
////	      return true;
////	    }
////
////	    
////	    public View getView(int position, View convertView, ViewGroup parent)
////	    {
////
////	     LayoutInflater inflater = getLayoutInflater();
////	     View row;
////
////	     row = inflater.inflate(R.layout.listview, parent, false);
////
////	     TextView textview = (TextView) row.findViewById(R.id.TextView01);
////	     ImageView imageview = (ImageView) row.findViewById(R.id.ImageView01);
////
//////	     textview.setText("Its from the StartActivity");
////	     imageview.setImageResource(R.drawable.desert);
////
////	     return (row);
////
////	    }
////	    
////	    
////	  }
////
//
//	@Override
//	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void onTabSelected(Tab tab, FragmentTransaction ft) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
//		// TODO Auto-generated method stub
//		
//	}
//	
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        MenuInflater inflater = getMenuInflater();
////        inflater.inflate(R.menu.menu, menu);
////        // If the device doesn't support camera, remove the camera menu item
//////        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
//////            menu.removeItem(R.id.menu_camera);
//////        }
////        return true;
////    }
//
//}
//
//
//
//class MyCustomAdapter extends BaseAdapter
//{
//
// String[] data_text;
// int[] data_image;
//
// MyCustomAdapter()
// {
//
// }
//
// MyCustomAdapter(String[] text, int[] image)
// {
//  data_text = text;
//  data_image = image;
// }
// 
// MyCustomAdapter(ArrayList<String> text, ArrayList<Integer> image)
// { 
// 
//  data_text = new String[text.size()];
//  data_image = new int[image.size()];
//
//  for(int i=0;i<text.size();i++)
//  {
//   data_text[i] = text.get(i);
//   data_image[i] = image.get(i);
//  }
//
// }
//
// public int getCount()
// {
//  return data_text.length;
// }
//
// public String getItem(int position)
// {
//  return null;
// }
//
// public long getItemId(int position)
// {
//  return position;
// }
//
// public View getView(int position, View convertView, ViewGroup parent)
// {
//
//  LayoutInflater inflater = getLayoutInflater();
//  View row;
//
//  row = inflater.inflate(R.layout.listview, parent, false);
//
//  TextView textview = (TextView) row.findViewById(R.id.TextView01);
//  ImageView imageview = (ImageView) row
//    .findViewById(R.id.ImageView01);
//
//  textview.setText(data_text[position]);
//  imageview.setImageResource(data_image[position]);
//
//  return (row);
//
// }
// 
//} 

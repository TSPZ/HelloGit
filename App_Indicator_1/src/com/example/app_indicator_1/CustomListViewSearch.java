package com.example.app_indicator_1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
			
public class CustomListViewSearch extends BaseSampleActivity
{
 
 EditText edittext;
 ListView listview;

 String[] text = { "One", "Two", "Three", "Four", "Five", "Six", "Seven",
   "Eight", "Nine", "Ten" };

 int[] image = { R.drawable.desert,  R.drawable.logo2, R.drawable.desert, R.drawable.logo4, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2, R.drawable.logo2 };
 
 int textlength = 0;
 
 ArrayList<String> text_sort = new ArrayList<String>();
 ArrayList<Integer> image_sort = new ArrayList<Integer>();

 public void onCreate(Bundle savedInstanceState)
 {

  super.onCreate(savedInstanceState);
  setContentView(R.layout.main);

  edittext = (EditText) findViewById(R.id.EditText01);
  listview = (ListView) findViewById(R.id.ListView01);
  listview.setAdapter(new MyCustomAdapter(text, image));
  
  edittext.addTextChangedListener(new TextWatcher()
  {

   public void afterTextChanged(Editable s)
   {

   }

   public void beforeTextChanged(CharSequence s, int start,
    int count, int after)
   {

   }

   public void onTextChanged(CharSequence s, int start,
    int before, int count)
   {

    textlength = edittext.getText().length();
    text_sort.clear();
    image_sort.clear();

    for (int i = 0; i < text.length; i++)
    {
     if (textlength <= text[i].length())
     {
      if (edittext.getText().toString().
   equalsIgnoreCase((String) text[i].subSequence(0, textlength)))
      {
       text_sort.add(text[i]);
       image_sort.add(image[i]);
      }
     }
    }

    listview.setAdapter(new MyCustomAdapter
     (text_sort, image_sort));

   }
  });
 }

 class MyCustomAdapter extends BaseAdapter
 {

  String[] data_text;
  int[] data_image;

  MyCustomAdapter()
  {

  }

  MyCustomAdapter(String[] text, int[] image)
  {
   data_text = text;
   data_image = image;
  }
  
  MyCustomAdapter(ArrayList<String> text, ArrayList<Integer> image)
  { 
  
   data_text = new String[text.size()];
   data_image = new int[image.size()];

   for(int i=0;i<text.size();i++)
   {
    data_text[i] = text.get(i);
    data_image[i] = image.get(i);
   }

  }

  public int getCount()
  {
   return data_text.length;
  }

  public String getItem(int position)
  {
   return null;
  }

  public long getItemId(int position)
  {
   return position;
  }

  public View getView(int position, View convertView, ViewGroup parent)
  {

   LayoutInflater inflater = getLayoutInflater();
   View row;

   row = inflater.inflate(R.layout.listview, parent, false);

   TextView textview = (TextView) row.findViewById(R.id.TextView01);
   ImageView imageview = (ImageView) row
     .findViewById(R.id.ImageView01);

   textview.setText(data_text[position]);
   imageview.setImageResource(data_image[position]);

   return (row);

  }
 }

}
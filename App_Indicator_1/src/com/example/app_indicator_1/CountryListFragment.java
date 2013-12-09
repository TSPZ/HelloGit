package com.example.app_indicator_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class CountryListFragment extends ListFragment {

	// Array of strings storing country names
	String[] countries = new String[] { "Kapellen", "Teenagemama",
			"Liebesbrief", "In Erinnerung an morgen", "Heimat",
			"Leipziger Künstler", "Mitost Festival, Spinnerei, Space Lab",
			"Parents", "Vaterzeit", "Schwedenfamilie" };

	// Array of integers points to images stored in /res/drawable/
	int[] logos = new int[] { R.drawable.kapellen_logo,
			R.drawable.teenagemama_logo, R.drawable.liebesbrief_logo,
			R.drawable.erinnerung_logo, R.drawable.heimat_logo,
			R.drawable.kuenstler_logo, R.drawable.mitost_logo,
			R.drawable.parents_logo, R.drawable.vaterzeit_logo,
			R.drawable.schwedenfamilie_logo };

	String[] text = { "Kapellen", "Teenagemamas", "Liebesbrief",
			"In Erinnerung an Morgen", "Heimat", "Leipziger Künstler",
			"MitOst, Space-Lab Spinnerei", "In nomine patris", "Parents",
			"Vaterzeit", "Schwedenfamilie" };
	// Array of strings to store currencies
	String[] currency = new String[] { "Indian Rupee", "Pakistani Rupee",
			"Sri Lankan Rupee", "Renminbi", "Bangladeshi Taka",
			"Nepalese Rupee", "Afghani", "North Korean Won",
			"South Korean Won", "Japanese Yen" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Each row in the list stores country name, currency and flag
		List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

		for (int i = 0; i < 10; i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("txt", "Country : " + countries[i]);
			hm.put("cur", "Currency : " + currency[i]);
			hm.put("flag", Integer.toString(logos[i]));
			aList.add(hm);
		}

		// Keys used in Hashmap
		String[] from = { "flag", "txt", "cur" };

		// Ids of views in listview_layout
		int[] to = { R.id.logo, R.id.txt, R.id.cur };

		// Instantiating an adapter to store each items
		// R.layout.listview_layout defines the layout of each item
		SimpleAdapter adapter = new SimpleAdapter(getActivity()
				.getBaseContext(), aList, R.layout.listview_layout, from, to);

		setListAdapter(adapter);

		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public int getSelectedItemPosition() {

		// TODO Auto-generated method stub
		return super.getSelectedItemPosition();
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub

		switch (position) {

		case 0:

			Intent intent1 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b1 = new Bundle();
			b1.putInt("key", 1); // Your id
			intent1.putExtras(b1); // Put your id to your next Intent
			startActivity(intent1);

			break;

		case 1:

			Intent intent2 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b2 = new Bundle();
			b2.putInt("key", 2); // Your id
			intent2.putExtras(b2); // Put your id to your next Intent
			startActivity(intent2);

			break;

		case 2:

			Intent intent3 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b3 = new Bundle();
			b3.putInt("key", 3); // Your id
			intent3.putExtras(b3); // Put your id to your next Intent
			startActivity(intent3);

			break;

		case 3:

			Intent intent4 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b4 = new Bundle();
			b4.putInt("key", 4); // Your id
			intent4.putExtras(b4); // Put your id to your next Intent
			startActivity(intent4);

			break;
		case 4:

			Intent intent5 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b5 = new Bundle();
			b5.putInt("key", 5); // Your id
			intent5.putExtras(b5); // Put your id to your next Intent
			startActivity(intent5);

			break;

		// case 5:
		//
		// Intent intent6 = new
		// Intent(getActivity(),SampleCirclesDefault.class);
		// Bundle b6 = new Bundle();
		// b6.putInt("key", 6); //Your id
		// intent6.putExtras(b6); //Put your id to your next Intent
		// startActivity(intent6);
		//
		//
		// break;

		case 5:

			Intent intent7 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b7 = new Bundle();
			b7.putInt("key", 6); // Your id
			intent7.putExtras(b7); // Put your id to your next Intent
			startActivity(intent7);

			break;
		// case 7:
		//
		// Intent intent8 = new
		// Intent(getActivity(),SampleCirclesDefault.class);
		// Bundle b8 = new Bundle();
		// b8.putInt("key", 8); //Your id
		// intent8.putExtras(b8); //Put your id to your next Intent
		// startActivity(intent8);
		//
		// break;

		case 6:

			Intent intent9 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b9 = new Bundle();
			b9.putInt("key", 7); // Your id
			intent9.putExtras(b9); // Put your id to your next Intent
			startActivity(intent9);

			break;

		case 7:

			Intent intent10 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b10 = new Bundle();
			b10.putInt("key", 8); // Your id
			intent10.putExtras(b10); // Put your id to your next Intent
			startActivity(intent10);

			break;
		case 8:

			Intent intent11 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b11 = new Bundle();
			b11.putInt("key", 9); // Your id
			intent11.putExtras(b11); // Put your id to your next Intent
			startActivity(intent11);

			break;

		case 9:

			Intent intent12 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b12 = new Bundle();
			b12.putInt("key", 10); // Your id
			intent12.putExtras(b12); // Put your id to your next Intent
			startActivity(intent12);

			break;

		case 10:

			Intent intent13 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b13 = new Bundle();
			b13.putInt("key", 11); // Your id
			intent13.putExtras(b13); // Put your id to your next Intent
			startActivity(intent13);

			break;
		case 11:

			Intent intent14 = new Intent(getActivity(),
					SampleCirclesDefault.class);
			Bundle b14 = new Bundle();
			b14.putInt("key", 14); // Your id
			intent14.putExtras(b14); // Put your id to your next Intent
			startActivity(intent14);

			break;

		}

	}
}

package com.example.app_indicator_1;

import java.util.Locale;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.app_indicator_1.Ipsum;


public class MainActivity extends BaseSampleActivity implements
		ActionBar.TabListener {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	private Object mCurrentTab;

	private int mtabIndex;

	public static final String[] CONTENT_KUENSTLER = new String[] {
			"Leipziger Kuenstler 1", "Leipziger Kuenstler 2",
			"Leipziger Kuenstler 3", "Leipziger Kuenstler 4",
			"Leipziger Kuenstler 5", "Alex", "Anna Haifisch",
			"Enno Seifried 01", "Ennoseifried 02", "Franziska Anna Faust 01",
			"Franzsika Anna Faust02", "Jay Gard 01", "Jay Gard 02",
			"Luise Bartels 01", "Ole Toense 01", "Ole Toense 02", "Reymund 01",
			"Reymund 02" };

	private static final String STATE_TAB = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	    // Check whether we're recreating a previously destroyed instance
	    if (savedInstanceState != null) {
	        // Restore value of members from saved state
	        mtabIndex = savedInstanceState.getInt(STATE_TAB);
	    } else {
	        // Probably initialize members with default values for a new instance
	    }

		
		
		
		setContentView(R.layout.activity_main);

		// Set up the action bar.
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
//		actionBar.setSelectedNavigationItem(mtabIndex);
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager_tabs);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});

		// For each of the sections in the app, add a tab to the action bar.
		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.
			actionBar.addTab(actionBar.newTab()
					.setText(mSectionsPagerAdapter.getPageTitle(i))
					.setTabListener(this));
		}

	}

	
	
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub

		Intent intent13 = new Intent(getApplicationContext(),
				SampleCirclesDefault.class);
		Bundle b13 = new Bundle();
		b13.putInt("key", 11); // Your id
		intent13.putExtras(b13); // Put your id to your next Intent
		startActivity(intent13);
		finish();

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mtabIndex = tab.getPosition();
		
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			if (position == 1) {

				// intent_startactivitylisten = new
				// Intent(getApplicationContext(),StartActivityListen.class);
				// startActivity(intent_startactivitylisten);
				// finish();
				Fragment fragment = new ArticleFragment();
				new Bundle();
				// args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position
				// + 1);
				return fragment;

			} else if (position == 2) {

				// Fragment fragment = new DummySectionFragment();
				// Bundle args = new Bundle();
				// args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position
				// + 46566);
				// fragment.setArguments(args);
				// return fragment;

				Fragment listfragment = new CountryListFragment();
				return listfragment;

			} else if (position == 3) {

				new TestFragment();
				Fragment fragment_test = TestFragment.newInstance(
						"Beliebige Bildunterschrift für dieses Bild",
						R.drawable.heimat__04olga);

				new Bundle();
				return fragment_test;
			} else if (position == 4) {
				int gallery_nr = 5;
				TestFragmentAdapter fragment_test_adapter = new TestFragmentAdapter(
						getSupportFragmentManager(), gallery_nr);
				fragment_test_adapter.getItem(4);
				int photo_nr = 1;

				return fragment_test_adapter.getItem(photo_nr);

				// Fragment fragment = new SampleCirclesFragment();
				// return fragment;
				//

			} else {
				Fragment fragment = new DummySectionFragment();
				Bundle args = new Bundle();
				args.putInt(DummySectionFragment.ARG_SECTION_NUMBER,
						position + 46);
				fragment.setArguments(args);
				return fragment;

			}

		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 5;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.app_name).toUpperCase(l);
			case 1:
				return getString(R.string.app_name).toUpperCase(l);
			case 2:
				return getString(R.string.app_name).toUpperCase(l);
			case 3:
				return getString(R.string.hello_world).toUpperCase(l);
			case 4:
				return getString(R.string.hello_world).toUpperCase(l);
			case 5:
				return getString(R.string.hello_world).toUpperCase(l);
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main_dummy,
					container, false);
			TextView dummyTextView = (TextView) rootView
					.findViewById(R.id.section_label);
			dummyTextView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

	public static class ArticleFragment extends Fragment {
		final static String ARG_POSITION = "position";
		int mCurrentPosition = -1;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			// If activity recreated (such as from screen rotate), restore
			// the previous article selection set by onSaveInstanceState().
			// This is primarily necessary when in the two-pane layout.
			if (savedInstanceState != null) {
				mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
			}

			// Inflate the layout for this fragment
			return inflater.inflate(R.layout.article_view, container, false);
		}

		@Override
		public void onStart() {
			super.onStart();

			// During startup, check if there are arguments passed to the
			// fragment.
			// onStart is a good place to do this because the layout has already
			// been
			// applied to the fragment at this point so we can safely call the
			// method
			// below that sets the article text.
			Bundle args = getArguments();
			if (args != null) {
				// Set article based on argument passed in
				updateArticleView(args.getInt(ARG_POSITION));
			} else if (mCurrentPosition != -1) {
				// Set article based on saved instance state defined during
				// onCreateView
				updateArticleView(mCurrentPosition);
			}
		}

		public void updateArticleView(int position) {
			TextView article = (TextView) getActivity().findViewById(
					R.id.article);
			article.setText(Ipsum.Articles[position]);
			mCurrentPosition = position;
		}

		@Override
		public void onSaveInstanceState(Bundle outState) {
			super.onSaveInstanceState(outState);

			// Save the current article selection in case we need to recreate
			// the fragment
			outState.putInt(ARG_POSITION, mCurrentPosition);
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		// Save the user's current tab state
	    savedInstanceState.putInt(STATE_TAB, mtabIndex);

		super.onSaveInstanceState(savedInstanceState);
	}




	@Override
	public void recreate() {
		// TODO Auto-generated method stub
		super.recreate();
	}
	
	

}

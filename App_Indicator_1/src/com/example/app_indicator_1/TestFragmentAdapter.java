package com.example.app_indicator_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.viewpagerindicator.IconPagerAdapter;

class TestFragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
	
	// 9 Bilder
    protected static final String[] CONTENT_KAPELLEN = new String[] { "Kapelle im Schnee zu Weihnachtszeit",  "Kapelle im Frühling mit Fensteraltar", "Marienkapelle, blumengeschmückter Altar mit Marienstatue und Kind","Feldkapelle, Altar mit Maria, Jesus, Joseph Holzstatuetten","Dorfkapelle mit Holzkastenaltar","Kapelle mit Glockenturm und Tischaltar","Kapelle mit spitzem Giebel und Glocke","barocke Dorfkapelle","Feldkapelle in Holzbauweise" };
    // 20 Bilder
    protected static final String[] CONTENT_TEENAGEMAMA = new String[] { "Teenagemama 1",  "Teenagemama 2", "Teenagemama 3","Teenagemama 4","Teenagemama 5","Teenagemama 6","Teenagemama 7","Teenagemama 8","Teenagemama 9","Teenagemama 10","Teenagemama 11","Teenagemama 12","Teenagemama 13","Teenagemama 14","Teenagemama 15","Teenagemama 16","Teenagemama 17","Teenagemama 18","Teenagemama 19","Teenagemama 20"};
    // 7 Bilder
    protected static final String[] CONTENT_LIEBESBRIEF = new String[] { "Liebesbrief 1",  "Liebesbrief 2", "Liebesbrief 3","Liebesbrief 4","Liebesbrief 5","Liebesbrief 6","Liebesbrief 7"};
    // 9 Bilder    
	protected static final String[] CONTENT_ERINNERUNG  = new String[] {"Vogeltapete","Tisch","Garten","Bett","Uhr","Gardiene","Buecherei","Wintergarten","Galerie"};
	// 11 Bilder
	protected static final String[] CONTENT_HEIMAT  = new String[] {"Tuschi","Dujic","Chirila","Olga","Tenorio","Anna","Emmafilter","Erguen","Kolb","Nyara","Thabita"};
	// 18 Bilder
	protected static final String[] CONTENT_KUENSTLER  = new String[] { "Leipziger Kuenstler 1","Leipziger Kuenstler 2","Leipziger Kuenstler 3","Leipziger Kuenstler 4","Leipziger Kuenstler 5","Alex","Anna Haifisch","Enno Seifried 01","Ennoseifried 02","Franziska Anna Faust 01","Franzsika Anna Faust02","Jay Gard 01","Jay Gard 02","Luise Bartels 01","Ole Toense 01","Ole Toense 02","Reymund 01","Reymund 02"};
	// 14 Bilder
	protected static final String[] CONTENT_SPINNEREI  = new String[] {"Mitost Festival,Space-lab, Spinnerei 1 ","Mitost Festival,Space-lab, Spinnerei 2 ","Mitost Festival,Space-lab, Spinnerei 3 ","Mitost Festival,Space-lab, Spinnerei 4 ","Mitost Festival,Space-lab, Spinnerei 5 ","Mitost Festival,Space-lab, Spinnerei 6 ","Mitost Festival,Space-lab, Spinnerei 7 ","Mitost Festival,Space-lab, Spinnerei 8 ","Mitost Festival,Space-lab, Spinnerei 9 ","Mitost Festival,Space-lab, Spinnerei 10","Mitost Festival,Space-lab, Spinnerei 11","Mitost Festival,Space-lab, Spinnerei 12","Mitost Festival,Space-lab, Spinnerei 13","Mitost Festival,Space-lab, Spinnerei 14"};
	// 32 Bilder
	protected static final String[] CONTENT_NOMINE  = new String[] {"Abt Benedikt","Laacher See","Pater Nikolaus","Bruder Christoph","Bruder Christoph Hand","Feld Sonne","Bruder Hilarius Verbeugung","Bruder Antonius","Bruder Antonius Hand","Bruder Antoniuskreuz","Schwarze Baeume","Pater Viktor","Pater Timotheus","Gestruepp vor See","Bruder Lukas","Wurzel Erde","Pater Andreas","Pater Andreas Hand","Birke","Bruder Severin","Wurzel schwarz","In nomine Patris 22","In nomine Patris 23 ","In nomine Patris 24 ","In nomine Patris 25 ","In nomine Patris 26 ","In nomine Patris 27 ","In nomine Patris 28 ","In nomine Patris 29 ","In nomine Patris 30","In nomine Patris 31","In nomine Patris 32"};
	// 8 Bilder
	protected static final String[] CONTENT_PARENTS  = new String[] { "Mama","Papa","Kristall","Kueche","Bank","Flur","Waschkeller","Wald"};
	// 31 Bilder
	protected static final String[] CONTENT_VATERZEIT = new String[] { "Vaterzeit 1","Vaterzeit 2"," Vaterzeit 3","Vaterzeit 4","Vaterzeit 5","Vaterzeit 6","Vaterzeit 7","Vaterzeit 8","Vaterzeit 9","Vaterzeit 10","Vaterzeit 11","Vaterzeit 12","Vaterzeit 13","Vaterzeit 14","Vaterzeit 15","Vaterzeit 16","Vaterzeit 17","Vaterzeit 18","Vaterzeit 19","Vaterzeit 20","Vaterzeit 21","Vaterzeit 22","Vaterzeit 23","Vaterzeit 24","Vaterzeit 25","Vaterzeit 26","Vaterzeit 27","Vaterzeit 28","Vaterzeit 29","Vaterzeit 30","Vaterzeit 31"};
	// 10 Bilder
	protected static final String[] CONTENT_SCHWEDEN = new String[] { "Schwedenfamilie 1","Schwedenfamilie 2","Schwedenfamilie 3","Schwedenfamilie 4","Schwedenfamilie 5","Schwedenfamilie 6","Schwedenfamilie 7","Schwedenfamilie 8","Schwedenfamilie 9","Schwedenfamilie 10"};
    
    protected static final int[] ICONS = new int[] {
            R.drawable.perm_group_calendar,
            R.drawable.perm_group_camera,
            R.drawable.perm_group_device_alarms,
            R.drawable.perm_group_location
    };
    
    public int valueKey; 

    private int mCount1  = CONTENT_KAPELLEN.length;
    private int mCount2  = CONTENT_TEENAGEMAMA.length;
    private int mCount3  = CONTENT_LIEBESBRIEF.length;
    private int mCount4  = CONTENT_ERINNERUNG.length;
    private int mCount5  = CONTENT_HEIMAT.length;
    private int mCount6  = CONTENT_KUENSTLER.length;
    private int mCount7  = CONTENT_SPINNEREI.length;
    private int mCount8  = CONTENT_NOMINE.length;
    private int mCount9  = CONTENT_PARENTS.length;
    private int mCount10 = CONTENT_VATERZEIT.length;    
    private int mCount11 = CONTENT_SCHWEDEN.length;
    
    
	private Integer[] mThumbIdsVar;
	private static String[] CONTENT = {"1","2","3","4","5","6","7","8","9","10"};
	private int mCount = 9;

    public TestFragmentAdapter(FragmentManager fm, int value) {
        super(fm);
        valueKey = value;
    }

    @Override
    public Fragment getItem(int position) {
    	
    	switch (valueKey) {
		case 1:
			mThumbIdsVar = mThumbIds.clone();
			CONTENT = CONTENT_KAPELLEN.clone();
			break;
		case 2:
			mThumbIdsVar = mThumbIds2.clone();
			CONTENT = CONTENT_TEENAGEMAMA.clone();
			break;
		case 3:
			mThumbIdsVar = mThumbIds3.clone();
			CONTENT = CONTENT_LIEBESBRIEF.clone();
			break;
		case 4:
			mThumbIdsVar = mThumbIds4.clone();
			CONTENT = CONTENT_ERINNERUNG.clone();
			break;
		case 5:
			mThumbIdsVar = mThumbIds5.clone();
			CONTENT = CONTENT_HEIMAT.clone();
			break;
		case 6:
			mThumbIdsVar = mThumbIds7.clone();
			CONTENT = CONTENT_KUENSTLER.clone();
			break;
		case 7:
			mThumbIdsVar = mThumbIds9.clone();
			CONTENT = CONTENT_SPINNEREI.clone();
			break;
		case 8:
			mThumbIdsVar = mThumbIds10.clone();
			CONTENT = CONTENT_NOMINE.clone();
			break;
		case 9:
			mThumbIdsVar = mThumbIds11.clone();
			CONTENT = CONTENT_PARENTS.clone();
			break;
		case 10:
			mThumbIdsVar = mThumbIds12.clone();
			CONTENT = CONTENT_VATERZEIT.clone();
			break;
		case 11:
			mThumbIdsVar = mThumbIds13.clone();
			CONTENT = CONTENT_SCHWEDEN.clone();
			break;
//		case 14:
//			mThumbIdsVar = mThumbIds13.clone();
//			CONTENT = CONTENT_SCHWEDEN.clone();
//			break;

		default:
			break;
		}
    	  
    	
        return TestFragment.newInstance(CONTENT[position % CONTENT.length],mThumbIdsVar[position]);
    }

    @Override
    public int getCount() {
    	switch (valueKey) {
		case 1:
			mCount = mCount1;
			break;
		case 2:
			mCount = mCount2;
			break;
		case 3:
			mCount = mCount3;
			break;
		case 4:
			mCount = mCount4;
			break;
		case 5:
			mCount = mCount5;
			break;
		case 6:
			mCount = mCount6;
			break;
		case 7:
			mCount = mCount7;
			break;
		case 8:
			mCount = mCount8;
			break;
		case 9:
			mCount = mCount9;
			break;
		case 10:
			mCount = mCount10;
			break;
		case 11:
			mCount = mCount11;
			break;

		default:
			break;
		}
    	return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return TestFragmentAdapter.CONTENT[position % CONTENT.length];
    }

    @Override
    public int getIconResId(int index) {
      return ICONS[index % ICONS.length];
    }

    public void setCount(int count) {
    	Log.d("FAILURE","setCount shouldn't be called due to wrong return value !!!");
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }
    
    
    // references to our images
    private Integer[] mThumbIds = {
    		R.drawable.kapellen__01img59kapellen_bpaar,
    		R.drawable.kapellen__02img1734bpaar,
    		R.drawable.kapellen__03img1716bpaar,
    		R.drawable.kapellen__04img1707bpaar,
    		R.drawable.kapellen__05img1708bpaar,
    		R.drawable.kapellen__06img1718bpaar,
    		R.drawable.kapellen__07img1721bpaar,
    		R.drawable.kapellen__08img5917bpaar,
    		R.drawable.kapellen__09img1733bpaar
    };
    
    private Integer[] mThumbIds2 = {
    		R.drawable.teenagemama_01img8213b,
    		R.drawable.teenagemama_02img1531b,
    		R.drawable.teenagemama_03img1649b,
    		R.drawable.teenagemama_04img1520b,
    		R.drawable.teenagemama_05img1552b,
    		R.drawable.teenagemama_06img1579b,
    		R.drawable.teenagemama_07img1572b,
    		R.drawable.teenagemama_08img1616b,
    		R.drawable.teenagemama_09img2213b,
    		R.drawable.teenagemama_10img2244b,
    		R.drawable.teenagemama_11img1707b,
    		R.drawable.teenagemama_12img9683b,
    		R.drawable.teenagemama_13img9687b,
    		R.drawable.teenagemama_14img9696b,
    		R.drawable.teenagemama_15img9732b,
    		R.drawable.teenagemama_16img9719b,
    		R.drawable.teenagemama_17img9800b,
    		R.drawable.teenagemama_18img9835b,
    		R.drawable.teenagemama_19img9819b,
    		R.drawable.teenagemama_20img9831b
    };
    
    private Integer[] mThumbIds3 = {
    		R.drawable.liebesbrief_01img1631b,
    		R.drawable.liebesbrief_02img1546b,
    		R.drawable.liebesbrief_03img1651b,
    		R.drawable.liebesbrief_04img1684b,
    		R.drawable.liebesbrief_05img1700b,
    		R.drawable.liebesbrief_08img1940b,
    		R.drawable.liebesbrief_09img1942b
    };
    
    private Integer[] mThumbIds4 = {
    		R.drawable.erinnerung_01vogeltapete2,
    		R.drawable.erinnerung_02tisch,
    		R.drawable.erinnerung_03garten2,
    		R.drawable.erinnerung_04bett,
    		R.drawable.erinnerung_05uhr,
    		R.drawable.erinnerung_06gardiene,
    		R.drawable.erinnerung_07buecherei,
    		R.drawable.erinnerung_08wintergarten2,
    		R.drawable.erinnerung_09zimg2054};

    		 private Integer[] mThumbIds5 = {
    		R.drawable.heimat__01tuschi,
    		R.drawable.heimat__02dujic,
    		R.drawable.heimat__03chirila,
    		R.drawable.heimat__04olga,
    		R.drawable.heimat__05tenorio,
    		R.drawable.heimat__06anna,
    		R.drawable.heimat__07emmafilter,
    		R.drawable.heimat__08erguen,
    		R.drawable.heimat__09kolb,
    		R.drawable.heimat__10nyara,
    		R.drawable.heimat__11thabita};

//    		 private Integer[] mThumbIds6 = {
//    		R.drawable.kapellen__01img59kapellen_bpaar,
//    		R.drawable.kapellen__02img1734bpaar,
//    		R.drawable.kapellen__03img1716bpaar,
//    		R.drawable.kapellen__04img1707bpaar,
//    		R.drawable.kapellen__05img1708bpaar,
//    		R.drawable.kapellen__06img1718bpaar,
//    		R.drawable.kapellen__07img1721bpaar,
//    		R.drawable.kapellen__08img5917bpaar,
//    		R.drawable.kapellen__09img1733bpaar
//    		};

    		 private Integer[] mThumbIds7 = {
    		R.drawable.kuenstler_01img1766b,
    		R.drawable.kuenstler_02img1757b,
    		R.drawable.kuenstler_04img1822b,
    		R.drawable.kuenstler_06img1779b,
    		R.drawable.kuenstler_07img1745b,
    		R.drawable.kuenstler_alex,
    		R.drawable.kuenstler_annahaifisch,
    		R.drawable.kuenstler_ennoseifried01,
    		R.drawable.kuenstler_ennoseifried02,
    		R.drawable.kuenstler_franziskaannafaust01_v2,
    		R.drawable.kuenstler_franzsikaannafaust02,
    		R.drawable.kuenstler_jaygard01,
    		R.drawable.kuenstler_jaygard02,
    		R.drawable.kuenstler_luisebartels01,
    		R.drawable.kuenstler_oletoense01,
    		R.drawable.kuenstler_oletoense02,
    		R.drawable.kuenstler_reymund01,
    		R.drawable.kuenstler_reymund02
    		};

//    		 private Integer[] mThumbIds8 = {
//    		R.drawable.liebesbrief_01img1631b,
//    		R.drawable.liebesbrief_02img1546b,
//    		R.drawable.liebesbrief_03img1651b,
//    		R.drawable.liebesbrief_04img1684b,
//    		R.drawable.liebesbrief_05img1700b,
//    		R.drawable.liebesbrief_08img1940b,
//    		R.drawable.liebesbrief_09img1942b,
//    		R.drawable.liebesbrief_logo
//    		};

    		 private Integer[] mThumbIds9 = {
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_1,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_10,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_11,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_12,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_13,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_14,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_2,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_3,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_4,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_5,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_6,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_7,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_8,
    		R.drawable.mitost_mitost_space_lab_spinnerei_jasmin_zwick_9
    		};

    		 private Integer[] mThumbIds10 = {
    		R.drawable.nomine_01_abtbenedikt,
    		R.drawable.nomine_02laachersee,
    		R.drawable.nomine_03paternikolaus,
    		R.drawable.nomine_04bruderchristoph,
    		R.drawable.nomine_05bruderchristophhand,
    		R.drawable.nomine_06feldsonne,
    		R.drawable.nomine_07bruderhilariusverbeugung,
    		R.drawable.nomine_08bruderantonius,
    		R.drawable.nomine_09bruderantoniushand,
    		R.drawable.nomine_10bruderantoniuskreuz,
    		R.drawable.nomine_11schwarzebaeume,
    		R.drawable.nomine_12paterviktor,
    		R.drawable.nomine_13patertimotheus,
    		R.drawable.nomine_14gestrueppvorsee,
    		R.drawable.nomine_15bruderlukas,
    		R.drawable.nomine_nominewurzelerde,
    		R.drawable.nomine_17paterandreas,
    		R.drawable.nomine_18paterandreashand,
    		R.drawable.nomine_19birke,
    		R.drawable.nomine_20bruderseverin,
    		R.drawable.nomine_21wurzelschwarz,
    		R.drawable.nomine_22img3144b,
    		R.drawable.nomine_23img3146,
    		R.drawable.nomine_24img3nomine1,
    		R.drawable.nomine_25img3nomine0,
    		R.drawable.nomine_26img3157,
    		R.drawable.nomine_27img3148,
    		R.drawable.nomine_28img3159,
    		R.drawable.nomine_29img3156,
    		R.drawable.nomine_30img5183,
    		R.drawable.nomine_31img5201,
    		R.drawable.nomine_32img5193,
    		};

    		 private Integer[] mThumbIds11 = {
    		R.drawable.parents_01mama,
    		R.drawable.parents_02papa,
    		R.drawable.parents_03kristall,
    		R.drawable.parents_04kueche1,
    		R.drawable.parents_05bank,
    		R.drawable.parents_06flur,
    		R.drawable.parents_08waschkeller,
    		R.drawable.parents_09wald};

    		 private Integer[] mThumbIds12 = {
    		R.drawable.vaterzeit_img6414b,
    		R.drawable.vaterzeit_img6490b,
    		R.drawable.vaterzeit_img64vaterzeitb,
    		R.drawable.vaterzeit_img6540b,
    		R.drawable.vaterzeit_img6546b,
    		R.drawable.vaterzeit_img6569b,
    		R.drawable.vaterzeit_img6597b,
    		R.drawable.vaterzeit_img6599b,
    		R.drawable.vaterzeit_img6610b,
    		R.drawable.vaterzeit_img6631b,
    		R.drawable.vaterzeit_img6643b,
    		R.drawable.vaterzeit_img6661b,
    		R.drawable.vaterzeit_img6664b,
    		R.drawable.vaterzeit_img6666b,
    		R.drawable.vaterzeit_img6672b,
    		R.drawable.vaterzeit_img6676b,
    		R.drawable.vaterzeit_img6678b,
    		R.drawable.vaterzeit_img6686b,
    		R.drawable.vaterzeit_img6729b,
    		R.drawable.vaterzeit_img6734b,
    		R.drawable.vaterzeit_img6739b,
    		R.drawable.vaterzeit_img6740b,
    		R.drawable.vaterzeit_img6783b,
    		R.drawable.vaterzeit_img6815b,
    		R.drawable.vaterzeit_img7602b,
    		R.drawable.vaterzeit_img7623b,
    		R.drawable.vaterzeit_img7633b,
    		R.drawable.vaterzeit_img7641b,
    		R.drawable.vaterzeit_img7678b,
    		R.drawable.vaterzeit_img9402b,
    		R.drawable.vaterzeit_img9753b
    		};
    		 
    		 private Integer[] mThumbIds13 = {
				R.drawable.schwedenfamilie_1_jasmin_zwick,
				R.drawable.schwedenfamilie_2_jasmin_zwick,
				R.drawable.schwedenfamilie_3_jasmin_zwick,
				R.drawable.schwedenfamilie_4_jasmin_zwick,
				R.drawable.schwedenfamilie_5_jasmin_zwick,
				R.drawable.schwedenfamilie_6_jasmin_zwick,
				R.drawable.schwedenfamilie_7_jasmin_zwick,
				R.drawable.schwedenfamilie_8_jasmin_zwick,
				R.drawable.schwedenfamilie_9_jasmin_zwick,
				R.drawable.schwedenfamilie_10_jasmin_zwick
				};

    		 
    		 
    
    
}
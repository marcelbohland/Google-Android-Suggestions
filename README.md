# Google-Android-Suggestions
Disclaimer: It is not an Official Google API

1. Create a Listview called suggestions

2. Create a Edittext called editText4

3. Implement this to onCreate

        setContentView(R.layout.activity_searchwidgetopen);
        SharedPreferences pref77 = getSharedPreferences("wertee", 0);
        SharedPreferences.Editor ed77 = pref77.edit();
        ed77.putString("vale", "1");
        ed77.commit();



        File notizdatei2 = new File(Environment.getExternalStorageDirectory(), "open_serach_data/cache/" + "suggest.txt");
        notizdatei2.delete();
        
4.         

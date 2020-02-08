# Google-Android-Suggestions
Disclaimer: It is not an Official Google API

version: 1.1

!!!! This API is free to use! Please copy the licence into your project !!!!

1. Create a Listview called suggestions

2. Create a Edittext called editText4

3. Implement this to your activity into onCreate

        SharedPreferences pref77 = getSharedPreferences("wertee", 0);
        SharedPreferences.Editor ed77 = pref77.edit();
        ed77.putString("vale", "1");
        ed77.commit();
        File notizdatei2 = new File(Environment.getExternalStorageDirectory(), "open_serach_data/cache/" + "suggest.txt");
        notizdatei2.delete();
        
4. Implement The API to your activity into onCreate (Version 1.0 or 1.1)

5. Implement the project licence into your app (Lizenz-angeben)

6. Implement uses-permissons to your Manifest.xml
    
7. Implement this to your activity into onCreate

    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

If you find any problems of this project then please contact us at opensearchapp@gmail.com
If you have any legal claims of this project then please contact us at opensearchapp@gmail.com,

your OpenSearch Webbrowser Team.

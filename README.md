# Google-Android-Suggestions

[![current version](https://img.shields.io/badge/current%20version-2.0.0-blue.svg)](https://github.com/marcelbohland/Google-Android-Suggestions/releases/tag/2.0.0)

Disclaimer: It is not an Official Google API


Current version: 2.0

!!!! This API is free to use! Please copy the licence into your project !!!!

# Version 2.0

1. Create a Listview called suggestions

2. Create a Edittext called editText4

3. Implement the HttpHandler.java to your project
        
4. Implement The API to your activity into onCreate (Version 2.0)

5. Implement the project licence into your app (Lizenz-angeben)

6. Implement uses-permissons to your Manifest.xml    

# Version 1.0 - 1-1 (outdated)

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

# License
Copyright 2021 Marcel Bohland

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

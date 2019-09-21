# Google-Android-Suggestions
Disclaimer: It is not an Official Google API



!The API will be available soon!




!!!! This API is free to use! Please copy the licence into your project !!!!

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
        
4. Implement The API to your activity into onCreate

5. Implement the project licence into your app

 Copyright OpenSearch Webbrowser by Marcel Bohland 2019

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

If you find any problems of this project then please contact us at opensearchapp@gmail.com
If you have any legal claims of this project then please contact us at opensearchapp@gmail.com,

your OpenSearch Webbrowser Team.

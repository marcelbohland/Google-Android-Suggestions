EditText editText = (EditText) findViewById(R.id.editText4);
    editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL) {
                    SharedPreferences pref77 = getSharedPreferences("wertee", 0);
                    SharedPreferences.Editor ed77 = pref77.edit();
                    ed77.putString("vale", "0");
                    ed77.commit();
                }
                return false;
            }
        });

        EditText searchTo = findViewById(R.id.editText4);
        searchTo.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

             SharedPreferences sharedPrefse = getSharedPreferences("suggests", 0);
                String punkte257 = (String) sharedPrefse.getString("vale", "");
                if(punkte257.equals("on")){
                SharedPreferences pref25 = getSharedPreferences("wertee", 0);
                String punkte25 = (String) pref25.getString("vale", "");
                if (punkte25.equals("1")) {
                    final EditText searchTo = findViewById(R.id.editText4);
                    if (searchTo.length() >= 0) {
                        SharedPreferences pref77 = getSharedPreferences("wertee", 0);
                        SharedPreferences.Editor ed77 = pref77.edit();
                        ed77.putString("vale", "0");
                        ed77.commit();


                        DownloadManager.Request request = new DownloadManager.Request(
                                Uri.parse("http://suggestqueries.google.com/complete/search?client=firefox&q=" + searchTo.getText().toString()));
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN);
                       // request.setTitle("File Download");//Notify client once download is completed!
                        request.setDestinationInExternalPublicDir( "open_serach_data/cache/","suggest.txt");
                        DownloadManager dm = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        dm.enqueue(request);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ordner = new File(Environment.getExternalStorageDirectory(), "open_serach_data/cache/suggest.txt");
                                BufferedReader bufferedReader = null;
                                int wert = 1;
                                if (ordner.exists()) {
                                    try {
                                        String inputLine;
                                        bufferedReader= new BufferedReader(new InputStreamReader(new FileInputStream(ordner), "ISO-8859-1"));
                                        String[] myArray = new String[10];
                                        myArray[1] ="";
                                        while ((inputLine = bufferedReader.readLine()) != null) {
                                            myArray[1] = inputLine;
                                        }
                                        ordner.delete();
                                        SharedPreferences pref77e = getSharedPreferences("wertee", 0);
                                        SharedPreferences.Editor ed77e = pref77e.edit();
                                        ed77e.putString("vale", "1");
                                        ed77e.commit();
                                        if (searchTo.getText().toString().contains("\"")) {
                                            Toast.makeText(getApplicationContext(), "A \" ia not allowed",     Toast.LENGTH_LONG).show();
                                        }else {
                                            if (myArray[1].isEmpty()) {

                                            }else {

                                                if (myArray[1].contains(",[]]")) { 
                                                    Toast.makeText(getApplicationContext(), "No Google suggestions exist", Toast.LENGTH_LONG).show();
                                                } else {
                                                    //ordner.delete();
                                                    String[] suggest2 = myArray[1].split("\",\"");
                                                    String str = Arrays.toString(suggest2);
                                                    String[] suggest = str.split("\"");
                                                    String[] sdd = suggest[3].split(",");
                                                    final String[] wdff = sdd;
                                                    ListView listView = (ListView) findViewById(R.id.suggestions);
                                                    final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Searchwidgetopen.this, R.layout.list_black_text,R.id.list_content, sdd);
                                                    listView.setAdapter(adapter);
                                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                        @Override
                                                        public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                                                            EditText editText2 = (EditText) findViewById(R.id.editText4);
                                                            editText2.setText(wdff[position]);
                                                            editText2.setSelection(editText2.getText().length());
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    } catch (FileNotFoundException e) {
                                        e.printStackTrace();
                                        Toast.makeText(getApplicationContext(), "fail 1", Toast.LENGTH_LONG).show();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        Toast.makeText(getApplicationContext(), "fail 2", Toast.LENGTH_LONG).show();
                                    }

                                }
                                else {
                                    while (wert > 1) {
                                        wert++;
                                    }
                                }
                            }
                        }, 700);

                    }
                }
                    SharedPreferences pref77e = getSharedPreferences("wertee", 0);
                    SharedPreferences.Editor ed77e = pref77e.edit();
                    ed77e.putString("vale", "1");
                    ed77e.commit();
            }
            }
        });

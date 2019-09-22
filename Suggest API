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

                EditText searchTo = findViewById(R.id.editText4);
                SharedPreferences pref25 = getSharedPreferences("wertee", 0);
                String punkte25 = (String) pref25.getString("vale", "");
                if (punkte25.equals("1")) {
                    if (searchTo.length() > 1) {
                        SharedPreferences pref77 = getSharedPreferences("wertee", 0);
                        SharedPreferences.Editor ed77 = pref77.edit();
                        ed77.putString("vale", "0");
                        ed77.commit();
                       DownloadManager.Request request = new DownloadManager.Request(Uri.parse("http://suggestqueries.google.com/complete/search?client=firefox&q=" + searchTo.getText().toString()));
                        request.setDestinationInExternalPublicDir("/open_serach_data/cache",  "suggest.txt");
                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        downloadManager.enqueue(request);
                        ordner = new File(Environment.getExternalStorageDirectory(), "open_serach_data/cache/suggest.txt");
                        BufferedReader bufferedReader = null;
                        int wert = 1;
                            if (ordner.exists()) {
                                try {
                                    String inputLine;
                                    bufferedReader = new BufferedReader(new FileReader(ordner));
                                    String[] myArray = new String[10];
                                    myArray[1] ="";
                                    while ((inputLine = bufferedReader.readLine()) != null) {
                                        URLEncoder.encode(inputLine, "UTF-8");
                                        myArray[1] = inputLine;
                                    }
                                    if (searchTo.getText().toString().contains("\"")) {
                                        Toast.makeText(getApplicationContext(), "A \" ia not allowed",     Toast.LENGTH_LONG).show();
                                        ordner.delete();
                                    }else {
                                        if (ordner.exists()) {
                                        if (myArray[1].isEmpty()) {

                                        }else {

                                            if (myArray[1].contains(",[]]")) { //absturz quelle????
                                                ordner.delete();
                                                ListView listView = (ListView) findViewById(R.id.suggestions);

                                                Toast.makeText(getApplicationContext(), "No Google suggestions exist", Toast.LENGTH_LONG).show();
                                            } else {
                                                ordner.delete();
                                                String[] suggest2 = myArray[1].split("\",\"");
                                                String str = Arrays.toString(suggest2);
                                                String[] suggest = str.split("\"");//\",\"
                                                String[] sdd = suggest[3].split(",");//\",\"
                                                final String[] wdff = sdd;
                                                ListView listView = (ListView) findViewById(R.id.suggestions);
//                                            String[] ddd = URLEncoder.encode(string, "UTF-8");

                                                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Searchwidgetopen.this, android.R.layout.simple_list_item_1, sdd);
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
                }
                    SharedPreferences pref77e = getSharedPreferences("wertee", 0);
                    SharedPreferences.Editor ed77e = pref77e.edit();
                    ed77e.putString("vale", "1");
                    ed77e.commit();
            
            }
        });

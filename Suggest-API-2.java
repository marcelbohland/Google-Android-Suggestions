
//Parameter before onCreate
ArrayList<String> list;
int length = 0;
int currentLength = 0;
       
       
       //v.2.0
       
       /*
       * Copyright 2021 Marcel Bohland
       *
       * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. 
       * You may obtain a copy of the License at
       *
       * http://www.apache.org/licenses/LICENSE-2.0
       * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
       * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations 
       * under the License.
       */
       
       
       StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        
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



               if (searchTo.getText().toString().length() >= length) {
                    try {
                        String[] myArray = new String[10];

                        length = searchTo.getText().toString().length();

                        HttpHandler sh = new HttpHandler();
                        String url = "http://suggestqueries.google.com/complete/search?output=firefox&q=" + searchTo.getText().toString();
                        String jsonStr = sh.makeServiceCall(url);
                        myArray[1] = jsonStr;

                        if (searchTo.getText().toString().contains("\"")) {
                            Toast.makeText(getApplicationContext(), "A \" ia not allowed", Toast.LENGTH_LONG).show();
                        } else {
                            if (myArray[1].isEmpty()) {

                            } else {
                                String[] suggest2 = myArray[1].split("\",\"");
                                String str = Arrays.toString(suggest2);
                                String[] suggest = str.split("\"");
                                String[] sdd = suggest[3].split(",");
                                final String[] wdff = sdd;
                                ListView listView = (ListView) findViewById(R.id.suggestions);
                                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(Searchwidgetopen.this, R.layout.list_black_text, R.id.list_content, sdd);
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
                    } catch (Exception e) {

                    }
                } else {

                    if (searchTo.getText().toString().length() > currentLength) {
                        length = searchTo.getText().toString().length();
                    } else {
                        currentLength = searchTo.getText().toString().length();
                    }
                }



            }
        });

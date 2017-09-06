package com.example.alunos.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;



/**
 * Created by alunos on 06/09/17.
 */

public class Exemplo2 extends ListActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

            for (int i=0; i<10; i++) {
                HashMap<String, String> item = new HashMap<String, String>();
                item.put("nome","Nome"+i);
                item.put("fone","Fone"+i);
                list.add(item);
            }
            String[] from = new String[] {"nome","fone"};

            int[] to=new int[] { android.R.id.text1, android.R.id.text2 };
            int layoytNativo = android.R.layout.two_line_list_item;
            setListAdapter(new SimpleAdapter(this,list,layoytNativo,from,to));
            }
    }


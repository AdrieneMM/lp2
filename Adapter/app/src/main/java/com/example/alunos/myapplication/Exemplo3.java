package com.example.alunos.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;



/**
 * Created by alunos on 06/09/17.
 */

public class Exemplo3 extends ListActivity {

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

        int[] to=new int[] { R.id.nome, R.id.fone };

        setListAdapter(new SimpleAdapter(this,list,R.layout.layout_contatos_fone,from,to));
    }
}


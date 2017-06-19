package com.projetos.giovani.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Intent it2 = getIntent();
        Bundle b = it2.getExtras();
        String a = b.getString("p_nome");
        TextView txt1 = (TextView)findViewById(R.id.tel2);
        txt1.setText(a);
    }

}

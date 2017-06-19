package com.projetos.giovani.exercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirTela1(View i){
        Intent it = new Intent(this ,Tela1Activity.class);
        startActivity(it);
    }
    public void abrirTela2(View i){
        EditText input = (EditText)findViewById(R.id.inputNome);
        String nome = input.getText().toString();
        Intent it = new Intent(this ,Tela2Activity.class);
        Bundle b = new Bundle();
        b.putString("p_nome" ,nome);
        it.putExtras(b);
        startActivity(it);
    }

}

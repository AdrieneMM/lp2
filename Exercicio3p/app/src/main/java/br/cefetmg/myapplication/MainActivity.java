package br.cefetmg.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCalc(View i) {
        Intent it = new Intent(this,calc.class);
        startActivity(it);
    }

    public void abrirFib(View i) {
        Intent it = new Intent(this,Fibonacci.class);
        startActivity(it);
    }

    public void abrirFat(View i) {
        Intent it = new Intent(this,Fatorial.class);
        startActivity(it);
    }



}
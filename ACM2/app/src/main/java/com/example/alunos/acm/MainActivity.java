package com.example.alunos.acm;

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
        Intent it = new Intent(this,CalcActivity.class);
        startActivity(it);
    }

    public void abrirFib(View i) {
        Intent it = new Intent(this,FibonacciActivity.class);
        startActivity(it);
    }

    public void abrirFat(View i) {
        Intent it = new Intent(this,FatorialActivity.class);
        startActivity(it);
    }
    public void exit(View i) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

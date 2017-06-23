package com.example.alunos.acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class FatorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
    }
    public void calcFat(View u){
        EditText numero = (EditText)findViewById(R.id.Num);
        String a = numero.getText().toString();
        int num = Integer.parseInt(a);
        int fat = 1 ;
        if(num%1==0) {
            for (int i = 1; i <= num; i++) {
                fat *= i;
            }
            TextView mostra = (TextView) findViewById(R.id.Stack1);
            Stack k = new Stack();
            k.push(fat);
            String b = k.pop().toString();
            mostra.setText(a + "! = " + b);
        }
    }

    public void exit(View i) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

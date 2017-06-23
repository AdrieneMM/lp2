package com.example.alunos.acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class FibonacciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }
    Stack fib = new Stack();
    public void Fibo(View u){
        EditText b = (EditText)findViewById(R.id.imputNumero);
        int num = Integer.parseInt(b.getText().toString());
        fib.push(0);
        fib.push(1);
        if(num>1){
            for (int i = 0 ; i < num-2; i++){
                int num1 = Integer.parseInt(fib.pop().toString());
                int num2 = Integer.parseInt(fib.pop().toString());
                fib.push(num2);
                fib.push(num1);
                fib.push(num2+num1);
            }
        }else{
            fib.pop();
        }

        TextView elemento = (TextView)findViewById(R.id.txtElementos);
        String ultimoelemento = fib.pop().toString();
        int c = Integer.parseInt(ultimoelemento);
        fib.push(c);
        elemento.setText(ultimoelemento);

        String sequencia = fib.toString();
        TextView mostrasequencia = (TextView)findViewById(R.id.txtseque);
        mostrasequencia.setText(sequencia);

        int soma = 0;
        while(fib.size()>0){
            soma+=Integer.parseInt(fib.pop().toString());
        }
        fib.push(soma);
        String s = fib.pop().toString();
        TextView mostrasoma = (TextView)findViewById(R.id.txtSoma);
        mostrasoma.setText(s);

    }

    public void exit(View i) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}

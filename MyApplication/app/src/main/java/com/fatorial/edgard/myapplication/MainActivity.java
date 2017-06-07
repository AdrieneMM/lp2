package com.fatorial.edgard.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Stack pilha = new Stack();
    int tam = 0;

    public void Empilhar(View mostra){
        TextView txt1 = (TextView) findViewById(R.id.Num);
        TextView txt2 = (TextView) findViewById(R.id.Caixa);
        int number = Integer.parseInt(txt1.getText().toString());
        pilha.push(number);
        txt2.setText(pilha.toString());
        tam++;
    }

    public void Somar(View mostra) {
        if (tam > 1) {
            int v1 = (int) pilha.pop();
            int v2 = (int) pilha.pop();
            int v3 = v1 + v2;
            pilha.push(v3);
            TextView txt2 = (TextView) findViewById(R.id.Caixa);
            txt2.setText(pilha.toString());
            tam--;
        }
    }
    public void Subtrair(View mostra) {
        if (tam > 1) {
            int v1 = (int) pilha.pop();
            int v2 = (int) pilha.pop();
            int v3 = v1 - v2;
            pilha.push(v3);
            TextView txt2 = (TextView) findViewById(R.id.Caixa);
            txt2.setText(pilha.toString());
            tam--;
        }
    }
    public void Multiplicacao(View mostra) {
        if (tam > 1) {
            int v1 = (int) pilha.pop();
            int v2 = (int) pilha.pop();
            int v3 = v1 * v2;
            pilha.push(v3);
            TextView txt2 = (TextView) findViewById(R.id.Caixa);
            txt2.setText(pilha.toString());
            tam--;
        }
    } public void Divisao(View mostra) {
        if (tam > 1) {
            int v1 = (int) pilha.pop();
            int v2 = (int) pilha.pop();
            int v3 = v1 / v2;
            pilha.push(v3);
            TextView txt2 = (TextView) findViewById(R.id.Caixa);
            txt2.setText(pilha.toString());
            tam--;
        }
    }
    public void Desempilhar(View mostra){
        if(tam > 0) {
            pilha.pop();
            TextView txt2 = (TextView) findViewById(R.id.Caixa);
            txt2.setText(pilha.toString());
            tam--;
        }
    }
    public void Limpar(View mostra){
        if(tam > 0) {
            while (tam != 0) {
                pilha.pop();
                TextView txt2 = (TextView) findViewById(R.id.Caixa);
                txt2.setText(pilha.toString());
                tam--;
            }
        }

    }
}

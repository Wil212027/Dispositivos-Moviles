package com.example.calculadora_cientifcajava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;
    double n1, n2, res;
    String Operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void B_0(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "0");
    }

    public void B_1(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "1");
    }

    public void B_2(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "2");
    }

    public void B_3(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "3");
    }

    public void B_4(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "4");
    }

    public void B_5(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "5");
    }

    public void B_6(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "6");
    }

    public void B_7(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "7");
    }

    public void B_8(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "8");
    }

    public void B_9(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + "9");
    }

    public void B_Punto(View view) {
        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        tvdisplay.setText(tvdisplay.getText() + ".");
    }

    public void OnClickOperationCapturaNumero1(View view) {

        tvdisplay = (TextView) findViewById(R.id.TV_Display);
        n1 = Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");

    }

    public void B_Suma(View view) {
        Operador = "+";
        OnClickOperationCapturaNumero1(view);
    }

    public void B_Resta(View view) {
        Operador = "-";
        OnClickOperationCapturaNumero1(view);
    }

    public void B_Multiplica(View view) {
        Operador = "*";
        OnClickOperationCapturaNumero1(view);
    }

    public void B_Division(View view) {
        Operador = "/";
        OnClickOperationCapturaNumero1(view);
    }

    public void B_Exp(View view) {

        Operador = "˄";

        tvdisplay = (TextView) findViewById(R.id.TV_Display);

        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());

            tvdisplay.setText("");

        } catch (NumberFormatException nfe) {

        }
    }

    public void B_Igual(View view) {

        tvdisplay = (TextView) findViewById(R.id.TV_Display);

        n2 = Double.parseDouble(tvdisplay.getText().toString());

        if (Operador.equals(" + ")) {

            res = n1 + n2;

        } else if (Operador.equals(" - ")) {

            res = n1 - n2;

        }
        if (Operador.equals(" * ")) {

            res = n1 * n2;

        } else if (Operador.equals(" / ")) {

            res = n1 / n2;

        } else if (Operador.equals(" X² ")) {

            tvdisplay = (TextView) findViewById(R.id.TV_Display);

            n2 = Double.parseDouble(tvdisplay.getText().toString());

            tvdisplay.setText("");

            res = Math.pow(n1, n2);

        }

        tvdisplay.setText(" " + res);
    }

    public void B_Raiz(View view) {

        tvdisplay = (TextView) findViewById(R.id.TV_Display);

        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());

            res = Math.sqrt(n1);

            tvdisplay.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {
        }
    }

    public void B_Cuadrado(View view) {

        tvdisplay = (TextView) findViewById(R.id.TV_Display);

        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());

            res = Math.pow(n1, n2);

            tvdisplay.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {
        }

    }

    public void B_BorrarUltimo ( View view) {

        if (tvdisplay.getText().toString().equals(" ")) ;
        {

            tvdisplay.setText(tvdisplay.getText().subSequence(0, tvdisplay.getText().length() - 1) + " ");

        }
    }

    public void  B_BorrarTodo(View view){

        n1 = 0*0;

        n2 = 0*0;

        tvdisplay = (TextView) findViewById(R.id.TV_Display);

        tvdisplay.setText(" ");

    }

    public void  B_Boff(View view){

        finish();
    }

}







package com.holamundo.operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class principal extends AppCompatActivity {
    private EditText n1, n2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        n1 = findViewById(R.id.txtNumeroUno);
        n2 = findViewById(R.id.txtNumeroDos);
        res = findViewById(R.id.lblResultado);


    }

    public void calcular(View v){
        double num1, num2, resultado;
        num1 = Double.parseDouble(n1.getText().toString());
        num2 = Double.parseDouble(n2.getText().toString());
        resultado = Metodos.sumar(num1, num2);
        res.setText(""+resultado);
    }
}

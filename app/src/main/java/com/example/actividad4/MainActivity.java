package com.example.actividad4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etN1, etN2, etN3;
    private Button btnCalcular, btnLimpiar;
    private TextView tvMayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        tvMayor = findViewById(R.id.tvMayor);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularMayor();
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarCampos();
            }
        });
    }

    private void calcularMayor() {
        // Obtener los valores ingresados en los EditText
        String strN1 = etN1.getText().toString();
        String strN2 = etN2.getText().toString();
        String strN3 = etN3.getText().toString();

        // Realizar el cálculo y mostrar el resultado
        if (!strN1.isEmpty() && !strN2.isEmpty() && !strN3.isEmpty()) {
            int numero1 = Integer.parseInt(strN1);
            int numero2 = Integer.parseInt(strN2);
            int numero3 = Integer.parseInt(strN3);

            int mayor = Math.max(Math.max(numero1, numero2), numero3);

            tvMayor.setText("Número Mayor: " + mayor);
            tvMayor.setVisibility(View.VISIBLE);
        } else {
            tvMayor.setText("Ingresa tres números.");
            tvMayor.setVisibility(View.VISIBLE);
        }
    }

    private void limpiarCampos() {
        etN1.setText("");
        etN2.setText("");
        etN3.setText("");
        tvMayor.setText("");
    }
}


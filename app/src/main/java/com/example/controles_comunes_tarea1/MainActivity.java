package com.example.controles_comunes_tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Enviar (View view) {
        EditText cedula = findViewById(R.id.idcedula);
        EditText nombres = findViewById(R.id.idnombres);
        EditText fecha= findViewById(R.id.idfecha);
        EditText ciudad = findViewById(R.id.idciudad);
        RadioButton genero = findViewById(R.id.idfemenino);
        EditText correo = findViewById(R.id.idcorreo);
        EditText telefono = findViewById(R.id.idtelf);

        String Cedula;
        String Nombres;
        String Fecha;
        String Ciudad;
        String Genero;
        String Correo;
        String Telefono;

        Genero = genero.isChecked() ? "ESTIMADA" : "ESTIMADO";
        Cedula = cedula.getText().toString();
        Nombres = nombres.getText().toString();
        Fecha = fecha.getText().toString();
        Ciudad = ciudad.getText().toString();
        Correo = correo.getText().toString();
        Telefono = telefono.getText().toString();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("CEDULA", Cedula);
        b.putString("NOMBRES", Nombres);
        b.putString("FECHA", Fecha);
        b.putString("CIUDAD", Ciudad);
        b.putString("GENERO", Genero);
        b.putString("CORREO", Correo);
        b.putString("TELEFONO", Telefono);
        intent.putExtras(b);
        startActivity(intent);

    }

    public void Limpiar (View view) {

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
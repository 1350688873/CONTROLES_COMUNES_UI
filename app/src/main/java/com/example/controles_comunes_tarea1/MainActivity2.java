package com.example.controles_comunes_tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView MostrarInfo =(TextView) findViewById(R.id.idmostrarinfo);
        Bundle bundle =this.getIntent().getExtras();
        MostrarInfo.setText("HOLA "+bundle.getString("GENERO")+ "\n" + "SU NOMBRE ES :" + " "
        +bundle.getString("NOMBRES")+ "\n" + "SU FECHA DE NACIMIENTO ES :" + bundle.getString("FECHA")+ "\n"
        + "SU NUMERO DE CEDULA ES :" + bundle.getString("CEDULA") + "\n"
        + "LA CIUDAD DONDE VIVE ES :" + bundle.getString("CIUDAD") + "\n"
        + "SU CORREO ES :" + bundle.getString("CORREO") + "\n"
        + "SUN NUMERO DE TELEFONO ES :" + bundle.getString("TELEFONO"));


    }
}
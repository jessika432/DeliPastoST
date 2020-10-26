package com.example.delipasto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioDeliPasto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciodelipasto);
    }

    public void Inicio(View view){
        //Se define un Intent
        Intent i = new Intent(this, BienvenidosTodos.class);
        startActivity(i);
    }

    public void CrearCuenta(View view){

    }

}
package com.example.aplicacionbetafibra

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbrirUrl: Button=findViewById(R.id.boton)

        // ahora añadir a boton el click listener

        btnAbrirUrl.setOnClickListener{
            val openURL=Intent(android.content.Intent.ACTION_VIEW)
            //Aquí se le pasa la url para abrir
            openURL.data=Uri.parse("https://www.josecerdanunez.cl")

            startActivity(openURL)
        }
    }

}
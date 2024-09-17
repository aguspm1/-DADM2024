package com.tp1.consigna1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val etnombre = findViewById<EditText>(R.id.nombre)
        val tvresultado = findViewById<TextView>(R.id.resultado)
        val boton = findViewById<Button>(R.id.enviar)

        boton.setOnClickListener {

            val nombre = etnombre.text.toString()

            if (nombre.isNotEmpty()){
                tvresultado.text="Hola, $nombre"
            }else {
                Toast.makeText(this,"Por favor ingresa tu nombre",Toast.LENGTH_LONG).show()
                Log.w("BotonMsg", "Debe ingresar su nombre")
            }



        }
        }
    }

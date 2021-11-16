package com.murallaromana.dam.segundo.proyectoviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murallaromana.dam.segundo.proyectoviewejemplo.R
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

class DetallePersonajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_personaje)

        val personaje = intent.extras?.get("personaje") as Personaje?

        // TODO: Aquí enlazaría los datos con la interfaz de usuario


        //Esto también se puede cambiar en el activity del manifest
        // setTitle (if personaje != null) personaje.nombre else "Nuevo personaje")
        // setTitle(personaje?.nombre ?: "Nuevo personaje")

        if (personaje != null) setTitle(personaje.nombre)
        else setTitle("Nuevo personaje")

    }
}
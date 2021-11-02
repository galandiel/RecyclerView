package com.murallaromana.dam.segundo.proyectoviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.dam.segundo.proyectoviewejemplo.R
import com.murallaromana.dam.segundo.proyectoviewejemplo.adapters.ListaPersonajesAdapter
import com.murallaromana.dam.segundo.proyectoviewejemplo.databinding.ActivityMainBinding
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.dao.PersonajesDao
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.dao.PersonajesDaoMockImpl
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflo las vistas
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtengo los datos de los personajes
        val personajesDao = PersonajesDaoMockImpl()
        val listaPersonajes = personajesDao.getAll()

        // Creo los componentes que necesita el RecyclerView
        // LayoutManager layoutManager = new LinearLayoutManager(this)
        // En lugar de LinearLayoutManager también hay GridLayoutManager
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)

        // Asocio el RecyclerView con sus componentes
        binding.rvListaPersonajes.adapter = adapter
        binding.rvListaPersonajes.layoutManager = layoutManager

        // Si la lista no va a cambiar (para aumentar el rendimiento)
        binding.rvListaPersonajes.setHasFixedSize(true)
    }
}
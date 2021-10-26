package com.murallaromana.dam.segundo.proyectoviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murallaromana.dam.segundo.proyectoviewejemplo.R
import com.murallaromana.dam.segundo.proyectoviewejemplo.databinding.ActivityMainBinding
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // LayoutManager layoutManager = new LinearLayoutManager(this)
        // En lugar de LinearLayoutManaget también hay GridLayoutManager
        val layoutManager = LinearLayoutManager(this)

        //Prueba personaje
        val p = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        println(p.getNombreCompleto())
        println(p.getNombreCompleto2())
        println(p.getNombreCompleto3())
    }
}
package com.murallaromana.dam.segundo.proyectoviewejemplo.model.dao

import android.os.Bundle
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

interface PersonajesDao {
    //public List<Personaje> getAll();
    fun getAll(): List<Personaje>
}
package com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities

import java.io.Serializable

class Personaje(
    var id: Long,
    var nombre: String,
    var apellido: String,
    var titulo: String,
    var familia: String,
    var url: String
): Serializable {

    fun getNombreCompleto(): String {
        return nombre + " " + apellido
    }

    fun getNombreCompleto2(): String {
        return "El nombre es: ${this.nombre} y el apellido es: ${this.apellido}"
    }

    fun getNombreCompleto3() = "${this.nombre} ${this.apellido}"

}
package com.murallaromana.dam.segundo.proyectoviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detalle_personaje, menu)

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.accion_guardar) {
            // Hago algo
            Toast.makeText(this, "Personaje guardado", Toast.LENGTH_SHORT).show()
            return true
        } else if (item.itemId == R.id.accion_borrar) {
            // Hago otra cosa, lo normal sería primero poner un mensaje de confirmación, para que
            // elimine sin estar seguros.
            Toast.makeText(this, "Personaje borrado", Toast.LENGTH_SHORT).show()

            val builder = AlertDialog.Builder(this)
            val dialog = builder.setTitle("Borrar personaje")
                .setMessage("Estás a punto de borrar el personaje de: Daenerys Targaryen, ¿estás seguro?")
                .setPositiveButton("Aceptar", {dialog, id ->
                    finish()
                })
                .setNegativeButton("Cancelar", null)
                .create()


            dialog.show()

            //finish() // mata la acticity y vuelves para atrás

            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}
package com.murallaromana.dam.segundo.proyectoviewejemplo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromana.dam.segundo.proyectoviewejemplo.R
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    class PersonajesViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvApellido = itemView.findViewById<TextView>(R.id.tvApellido)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val tvFamilia = itemView.findViewById<TextView>(R.id.tvFamilia)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_personaje, parent, false)

        return PersonajesViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        //val personaje = personajes[position]
        val personaje = personajes.get(position)

        holder.tvNombre.setText(personaje.nombre)
        holder.tvApellido.setText(personaje.apellido)
        holder.tvTitulo.setText(personaje.titulo)
        holder.tvFamilia.setText(personaje.familia)
    }

    override fun getItemCount() = personajes.size

}
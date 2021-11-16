package com.murallaromana.dam.segundo.proyectoviewejemplo.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murallaromana.dam.segundo.proyectoviewejemplo.R
import com.murallaromana.dam.segundo.proyectoviewejemplo.activities.DetallePersonajeActivity
import com.murallaromana.dam.segundo.proyectoviewejemplo.databinding.ItemPersonajeBinding
import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje
import com.squareup.picasso.Picasso

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    class PersonajesViewHolder(val itemBinding: ItemPersonajeBinding) :RecyclerView.ViewHolder(itemBinding.root){
        fun enlazarDatos (personaje: Personaje) {
            itemBinding.tvNombre.setText(personaje.nombre)
            itemBinding.tvTitulo.setText(personaje.titulo)
            itemBinding.tvFamilia.setText(personaje.familia)

            Picasso.get().load(personaje.url).into(itemBinding.ivFoto)
            //"https://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg"
            // "https://thronesapi.com/assets/images/daenerys.jpg"

            itemBinding.layoutItemPersonaje.setOnClickListener {
                val intent = Intent(itemBinding.root.context, DetallePersonajeActivity::class.java)
                intent.putExtra("personaje", personaje)
                itemBinding.root.context.startActivity(intent)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonajesViewHolder(ItemPersonajeBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        //val personaje = personajes[position]
        val personaje = personajes.get(position)

        holder.enlazarDatos(personaje)

    }

    override fun getItemCount() = personajes.size

}
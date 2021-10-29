package com.murallaromana.dam.segundo.proyectoviewejemplo.model.dao

import com.murallaromana.dam.segundo.proyectoviewejemplo.model.entities.Personaje

//public class PersonajesMockImpl implements Personajes Dao
class PersonajesDaoMockImpl : PersonajesDao {

    //Todas estas opciones son válidas
    //Esta es la última sintaxis, las mejores son esta y la siguiente, la que está de última es
    //buena para aprender, pero mejor no utilizarla.
    override fun getAll() = listOf(
            Personaje(
                0,
                "Daenerys",
                "Targaryen",
                "Mother of Dragons",
                "House Targaryen",
                "https://thronesapi.com/assets/images/daenerys.jpg"
            ),
            Personaje(
                0,
                "Samwell",
                "Tarly",
                "Maester",
                "House Tarly",
                "https://thronesapi.com/assets/images/sam.jpg"
            ),
            Personaje(
                0,
                "Jon",
                "Snow",
                "King of the North",
                "House Stark",
                "https://thronesapi.com/assets/images/jon-snow.jpg"
            ),
            Personaje(
                0,
                "Arya",
                "Stark",
                "No One",
                "House Stark",
                "https://thronesapi.com/assets/images/arya-stark.jpg"
            ),
            Personaje(
                0,
                "Sansa",
                "Stark",
                "Lady of Winterfell",
                "House Stark",
                "https://thronesapi.com/assets/images/sansa-stark.jpg"
            )
        )

//    override fun getAll(): List<Personaje> {
//        return listOf(
//            Personaje(
//                0,
//                "Daenerys",
//                "Targaryen",
//                "Mother of Dragons",
//                "House Targaryen",
//                "https://thronesapi.com/assets/images/daenerys.jpg"
//            ),
//            Personaje(
//                0,
//                "Samwell",
//                "Tarly",
//                "Maester",
//                "House Tarly",
//                "https://thronesapi.com/assets/images/sam.jpg"
//            ),
//            Personaje(
//                0,
//                "Jon",
//                "Snow",
//                "King of the North",
//                "House Stark",
//                "https://thronesapi.com/assets/images/jon-snow.jpg"
//            ),
//            Personaje(
//                0,
//                "Arya",
//                "Stark",
//                "No One",
//                "House Stark",
//                "https://thronesapi.com/assets/images/arya-stark.jpg"
//            ),
//            Personaje(
//                0,
//                "Sansa",
//                "Stark",
//                "Lady of Winterfell",
//                "House Stark",
//                "https://thronesapi.com/assets/images/sansa-stark.jpg"
//            )
//        )
//    }

//    override fun getAll(): List<Personaje> {
//        val p1 = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
//        val p2 = Personaje(0, "Samwell", "Tarly", "Maester", "House Tarly", "https://thronesapi.com/assets/images/sam.jpg")
//        val p3 = Personaje(0, "Jon", "Snow", "King of the North", "House Stark", "https://thronesapi.com/assets/images/jon-snow.jpg")
//        val p4 = Personaje(0, "Arya", "Stark", "No One", "House Stark", "https://thronesapi.com/assets/images/arya-stark.jpg")
//        val p5 = Personaje(0, "Sansa", "Stark", "Lady of Winterfell", "House Stark", "https://thronesapi.com/assets/images/sansa-stark.jpg")
//
//        val listaPersonajes = listOf(p1, p2, p3, p4, p5)
//
//        return listaPersonajes
//    }
}
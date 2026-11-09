package com.seka.spring.ejercicio8;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class FiltroPeliculas {

	public FiltroPeliculas() {
		System.out.println("Se ha creado filtro de película");
	}
	
	public ArrayList<Pelicula> filtrarPorNota(ArrayList<Pelicula>peliculas, double notaMinima){
		ArrayList<Pelicula> peliculasConNota = new ArrayList<>();
		
		for(Pelicula pelicula : peliculas) {
			if(pelicula.getNota()>= notaMinima) {
				peliculasConNota.add(pelicula);
			}
		}
		return peliculasConNota;
	}
}

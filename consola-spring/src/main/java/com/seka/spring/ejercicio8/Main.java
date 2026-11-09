package com.seka.spring.ejercicio8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--Creando almacen--");
		
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio8");
		
		System.out.println("--Dame Videoteca Service--");
		
		VideotecaService videotecaService = spring.getBean(VideotecaService.class);
		
		System.out.println("--Comenzamos con el Array List");
		
		ArrayList<Pelicula> peliculas = new ArrayList<>();
		
		peliculas.add(new Pelicula("El padrino", "Drama", 175, 9.5));
		peliculas.add(new Pelicula("Interstellar", "Ciencia ficción", 169, 9));
		peliculas.add(new Pelicula("Toy Story", "Animación", 81, 8));
		peliculas.add(new Pelicula("Origen", "Ciencia ficción", 148, 8.5));
		peliculas.add(new Pelicula("Torrente", "Comedia", 97, 5));
		peliculas.add(new Pelicula("Up", "Animación", 96, 8.5));
		
		try {
			peliculas.add(new Pelicula("Película fantasma", "Terror", 0, 7));
		}catch(DuracionInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}
		videotecaService.mostrarResumen(peliculas);
	}
	
}

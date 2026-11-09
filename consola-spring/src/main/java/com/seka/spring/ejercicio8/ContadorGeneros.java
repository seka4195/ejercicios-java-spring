package com.seka.spring.ejercicio8;

import java.util.Map;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashMap;

@Component
public class ContadorGeneros {

	public ContadorGeneros() {
		System.out.println("Se ha creado contador de géneros");
	}

	public Map<String, Integer> contarPorGenero(ArrayList<Pelicula> peliculas) {
		Map<String, Integer> generos = new HashMap<>();
		for (Pelicula pelicula : peliculas) {
			if (generos.containsKey(pelicula.getGenero())) {
				generos.put(pelicula.getGenero(), generos.get(pelicula.getGenero()) + 1);
			} else {
				generos.put(pelicula.getGenero(), 1);
			}
		}
		return generos;
	}
}

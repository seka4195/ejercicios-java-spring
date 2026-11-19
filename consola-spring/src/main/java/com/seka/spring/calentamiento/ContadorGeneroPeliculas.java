package com.seka.spring.calentamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorGeneroPeliculas {

	public static Map<String, Integer> contadorGenero(List<String>peliculas){
		Map<String, Integer> contador = new HashMap<>();
		for(String pelicula : peliculas) {
			if(contador.containsKey(pelicula)) {
				contador.put(pelicula, contador.get(pelicula)+1);
			}else {
				contador.put(pelicula, 1);
			}
		}
		return contador;
	}
	public static void main(String[] args) {
	List<String> peliculas = new ArrayList<>();
	peliculas.add("Terror");
	peliculas.add("Comedia");
	peliculas.add("Terror");
	peliculas.add("Drama");
	peliculas.add("Comedia");
	peliculas.add("Terror");
	
	Map<String, Integer> contadorPeliculas = ContadorGeneroPeliculas.contadorGenero(peliculas);
	
	for(String resultadoString : contadorPeliculas.keySet()) {
		System.out.println(resultadoString + ": " + contadorPeliculas.get(resultadoString));
	}
	}
}

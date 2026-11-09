package com.seka.spring.ejercicio8;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class CalculadoraDuracion {

	public CalculadoraDuracion() {
		System.out.println("Se ha creado calculadora duración.");
	}
	public int calcularTotal(ArrayList<Pelicula>peliculas) {
		int totalDuracion = 0;
		
		for(Pelicula pelicula : peliculas) {
			totalDuracion = totalDuracion + pelicula.getDuracion();
		}
		return totalDuracion;
	}
}

package com.seka.spring.ejercicio8;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class VideotecaService {

	private CalculadoraDuracion calculadoraDuracion;
	private FiltroPeliculas filtroPeliculas;
	private ContadorGeneros contadorGeneros;
	
	public VideotecaService(CalculadoraDuracion calculadoraDuracion, FiltroPeliculas filtroPeliculas, ContadorGeneros contadorGeneros) {
		this.calculadoraDuracion = calculadoraDuracion;
		this.filtroPeliculas = filtroPeliculas;
		this.contadorGeneros = contadorGeneros;
	}
	
	public void mostrarResumen(ArrayList<Pelicula>peliculas) {
		System.out.println("Total de peículas: " + peliculas.size());
		
		int total = calculadoraDuracion.calcularTotal(peliculas);
		int horas = total/60;
		int minutos = total%60;
		
		System.out.println("Horas totales de películas es de: " + horas + " h y " + minutos + " min.");
		
		ArrayList<Pelicula> mejores = filtroPeliculas.filtrarPorNota(peliculas, 8);
		System.out.println("Las películas con 8 o más son: ");
		for(Pelicula mejor : mejores) {
			System.out.println(mejor.getTitulo());
		}
		
		Map<String, Integer> listaGeneros = contadorGeneros.contarPorGenero(peliculas);
		for(String listaGenero : listaGeneros.keySet()){
			System.out.println(listaGenero + ": " + listaGeneros.get(listaGenero));
		}
		Pelicula mejorPelicula = peliculas.get(0);
		for(Pelicula pelicula : peliculas) {
			if(pelicula.getDuracion()>mejorPelicula.getDuracion()) {
				mejorPelicula = pelicula;
			}
		}
		System.out.println("La película más larga es: " + mejorPelicula.getTitulo());
	}
}

package com.seka.spring.ejercicio7;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Map;


@Component
public class BibliotecaService {
CalculadoraMedia calculadoraMedia;
ContadorGeneros contadorGeneros;

 public BibliotecaService(CalculadoraMedia calculadoraMedia, ContadorGeneros contadorGeneros) {
	 this.calculadoraMedia = calculadoraMedia;
	 this.contadorGeneros = contadorGeneros;
	 System.out.println("Se ha creado biblioteca service");
 }
 	
 public void mostrarResumen(ArrayList<Juego>juegos) {
	 System.out.println(juegos.size());
	 System.out.println(calculadoraMedia.calcularMedia(juegos));
	 Map<String, Integer>generos = contadorGeneros.contarPorGenero(juegos);
	 for (String genero : generos.keySet()) {
		    System.out.println(genero + ": " + generos.get(genero));
		}
	 Juego mejorJuego = juegos.get(0);
	 for(Juego juego : juegos) {
		if(juego.getNota() > mejorJuego.getNota()) {
			mejorJuego = juego;
		}
	 }
	 System.out.println(mejorJuego.getTitulo());
 }
 
}

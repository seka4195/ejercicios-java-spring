package com.seka.spring.ejercicio7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("--Creando Almacén--");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio7");
		System.out.println("--Dame bibliotecaService--");
		BibliotecaService bibliotecaService = spring.getBean(BibliotecaService.class);
		ArrayList<Juego> juegos = new ArrayList<>();
		juegos.add(new Juego("Zelda: Breath of the Wild", "Aventura", 9.5));
		juegos.add(new Juego("Elden Ring", "RPG", 9));
		juegos.add(new Juego("FIFA 24", "Deportes", 6.5));
		juegos.add(new Juego("Hollow Knight", "Aventura", 8.5));
		juegos.add(new Juego("The Witcher 3", "RPG", 10));

		try {
			juegos.add(new Juego("CyberPunk 2077", "RPG", 11));
		} catch (NotaInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}
		bibliotecaService.mostrarResumen(juegos);
	}

}

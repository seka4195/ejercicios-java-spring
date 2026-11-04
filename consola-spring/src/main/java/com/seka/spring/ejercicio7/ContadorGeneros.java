package com.seka.spring.ejercicio7;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@Component
public class ContadorGeneros {

	public ContadorGeneros() {
		System.out.println("Se ha creado contador de géneros");
	}

	public Map contarPorGenero(ArrayList<Juego> juegos) {
		Map<String, Integer> contadorGenero = new HashMap<>();
		for (Juego juego : juegos) {
			String genero = juego.getGenero();
			if (contadorGenero.containsKey(juego.getGenero())) {
				contadorGenero.put(genero, contadorGenero.get(genero) + 1);
			} else {
				contadorGenero.put(genero, 1);
			}
		}
		return contadorGenero;
	}
}

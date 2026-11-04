package com.seka.spring.ejercicio7;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraMedia {

	public CalculadoraMedia() {
		System.out.println("Se ha creado calculadoraMedia");
	}
	
	
	public double calcularMedia(ArrayList<Juego> juegos) {
		if(juegos.size()==0) {
			return 0;
		}else {
		double suma=0;	
	for(Juego juego : juegos) {
		suma = suma + juego.getNota();
			}
		return suma / juegos.size();
		}
	}
}

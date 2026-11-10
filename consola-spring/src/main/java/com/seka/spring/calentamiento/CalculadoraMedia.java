package com.seka.spring.calentamiento;

import java.util.ArrayList;

public class CalculadoraMedia {
	public static double calcularMedia(ArrayList<Double> lista) {
		if (lista.size() == 0) {
			return 0.0;
		}

		double suma = 0;
		for (Double nota : lista) {
			suma = suma + nota;
		}
		return suma / lista.size();
	}

	public static void main(String[] args) {
		ArrayList<Double> misNotas = new ArrayList<>();
		misNotas.add(9.5);
		misNotas.add(9.0);
		misNotas.add(6.5);
		misNotas.add(8.5);
		misNotas.add(10.0);
		ArrayList<Double> sinNotas = new ArrayList<>();
		System.out.println(calcularMedia(misNotas));
		System.out.println(calcularMedia(sinNotas));
	}
}

package com.seka.spring.calentamiento;

import java.util.ArrayList;
import java.util.List;

public class BuscadorNombres {

	public static int nombres(List<String> lista, String nombre) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(nombre)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Zelda");
		listaNombres.add("Elden Ring");
		listaNombres.add("Hades");

		System.out.println(BuscadorNombres.nombres(listaNombres, "Hades"));

	}

}

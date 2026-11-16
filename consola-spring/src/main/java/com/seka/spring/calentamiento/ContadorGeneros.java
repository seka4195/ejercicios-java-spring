package com.seka.spring.calentamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContadorGeneros {
	public static Map<String, Integer> contadorGeneros(ArrayList<String>lista){
		Map<String, Integer> recuento = new HashMap<>();
		for(String genero : lista ) {
			if(recuento.containsKey(genero)) {
				recuento.put(genero, recuento.get(genero)+1);
			}else {
				recuento.put(genero, 1);
			}
		}
		return recuento;
	}

}

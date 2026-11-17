package com.seka.spring.calentamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ContadorPlataformas {

	public static Map<String, Integer> contarPlataformas(List<String>lista){
		Map<String, Integer> recuento = new HashMap<>();
		
		for(String plataforma : lista) {
			if(recuento.containsKey(plataforma)) {
				recuento.put(plataforma, recuento.get(plataforma)+ 1);
			}else {
				recuento.put(plataforma, 1);
			}
		}
		return recuento;
	}
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("PC");
		lista.add("PS5");
		lista.add("Switch");
		lista.add("PC");
		lista.add("PC");
		lista.add("PS5");
		
		Map<String, Integer> resultado = ContadorPlataformas.contarPlataformas(lista);
		
		for(String resultadoString : resultado.keySet()) {
			System.out.println(resultadoString + ": " + resultado.get(resultadoString));
		}
		
	}

}

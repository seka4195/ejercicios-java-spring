package com.seka.spring.calentamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContadorEstados {
	public static Map<String, Integer> contadorEstados(ArrayList<String>estados){
		Map<String, Integer> contadorEst = new HashMap<>();
		for(String estado : estados) {
			if(contadorEst.containsKey(estado)) {
				contadorEst.put(estado, contadorEst.get(estado)+1);
			}else {
				contadorEst.put(estado, 1);
			}
		}
		return contadorEst;
	}
	public static void main(String[] args) {
		ArrayList<String> misEstados = new ArrayList<>();
		misEstados.add("terminado");
		misEstados.add("jugando");
		misEstados.add("terminado");
		misEstados.add("pendiente");
		misEstados.add("terminado");
		misEstados.add("jugando");
		
		Map<String, Integer> recuento = contadorEstados(misEstados);
		
		for(String recuent : recuento.keySet()) {
			System.out.println(recuent + ": " + recuento.get(recuent));
		}
	}
}

package com.seka.spring;

import org.springframework.stereotype.Component;

@Component
public class Mando {

	public Mando() {
		System.out.println("Se ha fabricado el mando");
	}
	
	public void pulsarBoton(String boton) {
		System.out.println("Pulsando el botón " + boton);
	}
}

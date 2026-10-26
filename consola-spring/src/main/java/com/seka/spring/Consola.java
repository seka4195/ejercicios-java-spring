package com.seka.spring;

import org.springframework.stereotype.Component;

@Component
public class Consola {
	private Mando mando;
	
	public Consola(Mando mando) {
		this.mando=mando;
		System.out.println("Se ha fabricado la consola");
	}
	
	public void jugar() {
		System.out.println("Jugando al Final Fantasy VII Revelations");
		mando.pulsarBoton("Cuadrado");
	}
	
}

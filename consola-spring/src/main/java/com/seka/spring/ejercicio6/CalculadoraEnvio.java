package com.seka.spring.ejercicio6;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraEnvio {
	public CalculadoraEnvio() {
		System.out.println("Se ha creado calculadora envío");
	}
	public double calcularEnvio(double importe) {
		if(importe >=50) {
			return 0;
		}
		return 4.95;
	}
}

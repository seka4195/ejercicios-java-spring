package com.seka.spring.ejercicio1;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraIva {
	public CalculadoraIva() {
		System.out.println("Se ha creado la calculadora de iva");
	}
	public double calcularPrecioConIva(double precio) {
		return precio * 1.21;
	}
}

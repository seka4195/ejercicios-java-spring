package com.seka.spring.ejercicio6;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraDescuento {
	public CalculadoraDescuento() {
		System.out.println("Se ha creado la calculadora descuento");
	}

	public double calcularDescuento(double importe) {
		if (importe >= 100) {
			return importe * 0.10;
		}
		return 0;
	}
}

package com.seka.spring.ejercicio5;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraSeguridadSocial {
	
	public CalculadoraSeguridadSocial() {
		System.out.println("Se ha creado calculadora seguridad social");
	}
	public double calcularSeguridadSocial(double salarioBruto) {
		return salarioBruto * 0.06;
	}
}

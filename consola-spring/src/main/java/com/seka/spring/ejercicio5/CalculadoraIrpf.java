package com.seka.spring.ejercicio5;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraIrpf {
	
	public CalculadoraIrpf() {
		System.out.println("Se ha creado calculadora IRPF");
	}
	public double calcularIrpf(double salarioBruto) {
		return salarioBruto * 0.15;
	}
}

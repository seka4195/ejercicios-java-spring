package com.seka.spring.ejercicio6;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraTotal {
	private CalculadoraDescuento calculadoraDescuento;
	private CalculadoraEnvio calculadoraEnvio;

	public CalculadoraTotal(CalculadoraDescuento calculadoraDescuento, CalculadoraEnvio calculadoraEnvio) {
		this.calculadoraDescuento = calculadoraDescuento;
		this.calculadoraEnvio = calculadoraEnvio;
		System.out.println("Se ha creado calculadora total");
	}

	public double calcularTotal(double importe) {
		double descuento = calculadoraDescuento.calcularDescuento(importe);
		double envio = calculadoraEnvio.calcularEnvio(importe);

		return importe - descuento + envio;
	}
}

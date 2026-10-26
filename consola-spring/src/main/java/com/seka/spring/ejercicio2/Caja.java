package com.seka.spring.ejercicio2;
import org.springframework.stereotype.Component;

@Component
public class Caja {
	private CalculadoraIva calculadoraIva;
	
	public Caja(CalculadoraIva calculadoraIva) {
		this.calculadoraIva = calculadoraIva;
		System.out.println("Se ha creado la caja");	
	}
	public void cobrar(String producto, double precio) {
		System.out.println("Cobrando " + producto + ": " + calculadoraIva.calcularPrecioConIva(precio) + "€");
		
	}
}

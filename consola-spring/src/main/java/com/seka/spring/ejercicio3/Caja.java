package com.seka.spring.ejercicio3;

import org.springframework.stereotype.Component;

@Component
public class Caja {
	private CalculadoraIva calculadoraIva;

	public Caja(CalculadoraIva calculadoraIva) {
		this.calculadoraIva = calculadoraIva;
		System.out.println("Se ha creado la caja");
	}

	public void cobrar(Producto producto) {
		System.out.println("Cobrando " + producto.getNombre() + ": "
				+ calculadoraIva.calcularPrecioConIva(producto.getPrecio()) + "€");

	}
}

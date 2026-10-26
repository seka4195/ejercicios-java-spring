package com.seka.spring.ejercicio4;

import org.springframework.stereotype.Component;

@Component
public class Contabilidad {
	private CalculadoraIva calculadoraIva;
	
	public Contabilidad(CalculadoraIva calculadoraIva) {
		this.calculadoraIva = calculadoraIva;
		System.out.println("Se ha creado contabilidad");
	}
	
	public void registrarVenta(Producto producto) {
		System.out.println("Contabilidad: " + producto.getNombre() + " registrado por " + calculadoraIva.calcularPrecioConIva(producto.getPrecio()) + "€");
	}
	public CalculadoraIva getCalculadoraIva() {
		return calculadoraIva;
	}
}

package com.seka.spring.ejercicio3;

import org.springframework.stereotype.Component;

@Component
public class Tienda {
	private Caja caja;

	public Tienda(Caja caja) {
		this.caja = caja;
		System.out.println("Se ha creado la tienda.");
	}

	public void vender(Producto producto) {
		System.out.println("Vendiendo " + producto.getNombre() + "...");
		caja.cobrar(producto);
	}
}

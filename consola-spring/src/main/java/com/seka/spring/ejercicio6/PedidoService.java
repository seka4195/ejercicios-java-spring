package com.seka.spring.ejercicio6;

import org.springframework.stereotype.Component;

@Component
public class PedidoService {
	private CalculadoraTotal calculadoraTotal;
	
	public PedidoService(CalculadoraTotal calculadoraTotal) {
		this.calculadoraTotal = calculadoraTotal;
		System.out.println("Se ha creado pedido service");
	}
	public void procesar(Pedido pedido) {
		System.out.println("Pedido de " + pedido.getCliente() + ": importe " + pedido.getImporte()
		+ " €, total " + calculadoraTotal.calcularTotal(pedido.getImporte()) + " €");
	}
}

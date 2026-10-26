package com.seka.spring.ejercicio6;

public class Pedido {
	private String cliente;
	private double importe;
	
	public Pedido(String cliente, double importe) {
		this.cliente = cliente;
		setImporte(importe);
	}
	public void setImporte(double importe) {
		if(importe<=0) {
			throw new ImporteInvalidoException("El importe debe ser mayor que 0");
		}
		this.importe = importe;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getImporte() {
		return importe;
	}
}

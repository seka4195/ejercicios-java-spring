package com.seka.spring.ejercicio5;

public class Empleado {
	private String nombre;
	private double salarioBruto;
	
	public Empleado(String nombre, double salarioBruto) {
		this.nombre = nombre;
		setSalarioBruto(salarioBruto);
	}
	
	public void setSalarioBruto(double salarioBruto) {
		if(salarioBruto < 0) {
			throw new IllegalArgumentException("El salario no puede ser negativo");
		}
		this.salarioBruto = salarioBruto;
	}
	public String getNombre() {
		return nombre;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
}

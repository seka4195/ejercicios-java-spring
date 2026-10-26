package com.seka.spring.ejercicio1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio1");
		
		System.out.println("--- 2. Pido la calculadora ---");
		CalculadoraIva calculadoraIva = spring.getBean(CalculadoraIva.class);
		
		System.out.println("--- 3. Calcular ---");
		System.out.println(calculadoraIva.calcularPrecioConIva(100));
		System.out.println(calculadoraIva.calcularPrecioConIva(50));
	}

}

package com.seka.spring.ejercicio3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio3");

		System.out.println("--- 2. Pido la tienda ---");
		Tienda tienda = spring.getBean(Tienda.class);

		Producto teclado = new Producto("Teclado", 100);
		Producto raton = new Producto("Ratón", 20);

		System.out.println("--- 3. Vendemos ---");
		tienda.vender(teclado);
		tienda.vender(raton);
	}

}

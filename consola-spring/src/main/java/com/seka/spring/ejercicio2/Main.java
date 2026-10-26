package com.seka.spring.ejercicio2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio2");
		
		System.out.println("--- 2. Pido la caja ---");
		Caja caja = spring.getBean(Caja.class);
		
		System.out.println("--- 3. Calcular ---");
		caja.cobrar("Teclado",100);
		caja.cobrar("Ratón",20);
	}
}

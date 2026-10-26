package com.seka.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring");

		System.out.println("--- 2. Pido la consola ---");
		Consola consola = spring.getBean(Consola.class);

		System.out.println("--- 3. Juego ---");
		consola.jugar();

	}

}

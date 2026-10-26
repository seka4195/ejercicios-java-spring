package com.seka.spring.ejercicio5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio5");
		
		System.out.println("--- 2. Pido Nomina service ---");
		NominaService nomina = spring.getBean(NominaService.class);
		
		Empleado ana = new Empleado ("Ana",2000);
		Empleado luis = new Empleado ("Luis",1500);

		nomina.generarNomina(ana);
		nomina.generarNomina(luis);		
		
		try {
			Empleado jose = new Empleado ("Jose",-300);
		}catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

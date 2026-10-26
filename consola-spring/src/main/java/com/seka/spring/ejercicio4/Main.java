package com.seka.spring.ejercicio4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio4");
		
		System.out.println("--- 2. Pido la caja y la contabilidad ---");
		Caja caja = spring.getBean(Caja.class);
		CalculadoraIva calculadoraConIva = spring.getBean(CalculadoraIva.class); 
		Contabilidad contabilidad = spring.getBean(Contabilidad.class);
		Caja caja2 = spring.getBean(Caja.class);
		
		Producto teclado = new Producto("Teclado",100);
		
		caja.cobrar(teclado);
		contabilidad.registrarVenta(teclado);
		
		System.out.println(caja.getCalculadoraIva()==contabilidad.getCalculadoraIva());
		System.out.println(calculadoraConIva == caja.getCalculadoraIva());
		System.out.println( caja == caja2);
	}
}

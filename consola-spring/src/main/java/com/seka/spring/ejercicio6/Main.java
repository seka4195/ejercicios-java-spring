package com.seka.spring.ejercicio6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seka.spring.ejercicio6.PedidoService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- 1. Abro el almacén de Spring ---");
		ApplicationContext spring = new AnnotationConfigApplicationContext("com.seka.spring.ejercicio6");
		
		System.out.println("--- 2. Pido Nomina service ---");
		PedidoService pedido = spring.getBean(PedidoService.class);
		
		Pedido ana = new Pedido ("Ana", 200);
		Pedido luis = new Pedido ("Luis", 30);
		Pedido marta = new Pedido ("Marta", 30);
		
		pedido.procesar(ana);
		pedido.procesar(luis);
		pedido.procesar(marta);
	}

}

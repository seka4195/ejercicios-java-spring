package com.seka.spring.ejercicio5;

import org.springframework.stereotype.Component;

@Component
public class NominaService {
	private CalculadoraIrpf calculadoraIrpf;
	private CalculadoraSeguridadSocial calculadoraSeguridadSocial;
	
	public NominaService(CalculadoraIrpf calculadoraIrpf, CalculadoraSeguridadSocial calculadoraSeguridadSocial) {
		this.calculadoraIrpf = calculadoraIrpf;
		this.calculadoraSeguridadSocial = calculadoraSeguridadSocial;
		System.out.println("Se ha creado nomina service");
	}
	

	public void generarNomina(Empleado empleado) {
			double irpf = calculadoraIrpf.calcularIrpf(empleado.getSalarioBruto());
			double seguridadSocial = calculadoraSeguridadSocial.calcularSeguridadSocial(empleado.getSalarioBruto());
			double neto = empleado.getSalarioBruto() - irpf - seguridadSocial;
			
	
			System.out.println("Nómina de " + empleado.getNombre() + ": bruto " + empleado.getSalarioBruto()
			+ "€, IRPF " + irpf + ", seguridad social " + seguridadSocial + ", neto " + neto + "€");
	}
}

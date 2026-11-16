package com.seka.holaspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@GetMapping("/hola/{nombre}")
	public String saludar(@PathVariable String nombre) {
		return "Hola " + nombre;
	}
	
	@GetMapping("/adios")
	public String despedir() {
		return "Hasta luego, Seka";
	}
	
	@GetMapping("/nota/{valor}")
	public String nota(@PathVariable int valor) {
		if(valor< 0 || valor > 10) {
			return "Nota no válida: tiene que estar entre 0 y 10";
		}else if(valor <= 10 && valor >= 9) {
			return "Obra maestra";
		}else if (valor < 9 && valor >= 7) {
			return "Muy bueno";
		}else if(valor < 7 && valor >= 5) {
			return "Aprobado";
		}else {
			return "Flojo";
		}
	}
}

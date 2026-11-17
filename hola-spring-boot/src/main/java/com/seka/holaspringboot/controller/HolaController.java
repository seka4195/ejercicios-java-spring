package com.seka.holaspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seka.holaspringboot.service.NotaService;

@RestController
public class HolaController {
	private final NotaService notaService;

	public HolaController(NotaService notaService) {
		this.notaService = notaService;
	}

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
		return notaService.valorar(valor);
	}
}

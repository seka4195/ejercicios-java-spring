package com.seka.holaspringboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seka.holaspringboot.model.Juego;
import com.seka.holaspringboot.service.JuegoService;

@RestController
public class JuegoController {

	private final JuegoService juegoService;
	
	public JuegoController(JuegoService juegoService) {
		this.juegoService = juegoService;
	}
	
	@GetMapping("/juegos")
	public List<Juego> obtenerJuegos(){
		return juegoService.listarTodos();
	}
	
	@GetMapping("/juegos/{id}")
	public Juego obtenerJuego(@PathVariable int id) {
		return juegoService.buscarPorId(id);
	}
	
	@GetMapping("/juegos/genero/{genero}")
	public List<Juego> obtenerJuegosPorGenero (@PathVariable String genero) {
		return juegoService.filtrarPorGenero(genero);
	}
}

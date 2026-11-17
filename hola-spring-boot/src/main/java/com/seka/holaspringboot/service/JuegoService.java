package com.seka.holaspringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seka.holaspringboot.model.Juego;

@Service
public class JuegoService {
	private final List<Juego> juegos = new ArrayList<>();

	public JuegoService() {
		juegos.add(new Juego(1, "Zelda", "Aventura", 9));
		juegos.add(new Juego(2, "Elden Ring", "RPG", 8));
		juegos.add(new Juego(3, "Hollow Knight", "Aventura", 4));
		juegos.add(new Juego(4, "FIFA 24", "Deportes", 5));
		juegos.add(new Juego(5, "The Witcher 3", "RPG", 10));
		juegos.add(new Juego(6, "Animal Crossing", "Simulación", 7));
	}

	public List<Juego> listarTodos() {
		return juegos;
	}
	
	public Juego buscarPorId(int id) {
		for(Juego juego : juegos) {
			if(id == juego.getId()) {
				return juego;
			}
		}
		return null;
	}
}

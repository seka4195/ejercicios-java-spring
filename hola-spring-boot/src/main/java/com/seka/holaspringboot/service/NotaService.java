package com.seka.holaspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class NotaService {
	
	public String valorar(int valor) {
		if (valor < 0 || valor > 10) {
			return "Nota no válida: tiene que estar entre 0 y 10";
		} else if (valor >= 9) {
			return "Obra maestra";
		} else if (valor >= 7) {
			return "Muy bueno";
		} else if (valor >= 5) {
			return "Aprobado";
		} else {
			return "Flojo";
		}
	}
}

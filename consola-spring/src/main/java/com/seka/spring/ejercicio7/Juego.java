package com.seka.spring.ejercicio7;

public class Juego {
	String titulo;
	String genero;
	double nota;
	
	public Juego(String titulo, String genero, double nota) {
		this.titulo = titulo;
		this.genero = genero;
		setNota(nota);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		if(nota<0 || nota>10) {
			throw new NotaInvalidaException("La nota debe estar entre 0 y 10");
		}else {
			this.nota = nota;
		}
	}
}

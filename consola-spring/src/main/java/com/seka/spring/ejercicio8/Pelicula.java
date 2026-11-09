package com.seka.spring.ejercicio8;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private double nota;

	public Pelicula(String titulo, String genero, int duracion, double nota) {
		this.titulo = titulo;
		this.genero = genero;
		setDuracion(duracion);
		this.nota = nota;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if (duracion <= 0) {
			throw new DuracionInvalidaException("La duración debe ser mayor que 0");
		} else {
			this.duracion = duracion;
		}
	}
}

package com.seka.holaspringboot.model;

public class Juego {

	private Integer id;
	private String nombre;
	private String genero;
	private int nota;

	public Juego() {

	}

	public Juego(Integer id, String nombre, String genero, int nota) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.nota = nota;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public int getNota() {
		return nota;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}

package com.seka.holaspringboot.model;

public class Juego {

	private int id;
	private String nombre;
	private String genero;
	private int nota;
	
	public Juego(int id, String nombre, String genero, int nota) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.nota = nota;
	}
	
	public int getId() {
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
}

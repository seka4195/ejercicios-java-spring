package diagnostico_java;

public abstract class Contenido {
	private String titulo;
	private int anio;
	public Contenido(String titulo, int anio) {
		this.titulo = Titulos.normalizarTitulos(titulo);
		this.anio = anio;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public int getAnio() {
		return anio;
	}
	public abstract String getDuracion();
	
}

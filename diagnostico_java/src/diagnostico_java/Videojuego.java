package diagnostico_java;

public class Videojuego extends Contenido implements Recomendable {
	private String plataforma;
	private double nota;
	private int horasEstimadas;

	public Videojuego(String titulo, int anio, String plataforma, double nota, int horasEstimadas) {
		super(titulo, anio);
		this.plataforma = plataforma;
		setNota(nota);
		this.horasEstimadas = horasEstimadas;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota < 0 || nota > 10) {
			System.out.println("Esta nota no es valida");
		} else {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return getTitulo() + " (" + plataforma + ") - Nota: " + nota;
	}

	@Override
	public String getDuracion() {
		return horasEstimadas + " horas";
	}

	@Override
	public boolean esRecomendable() {
		if (nota >= 8) {
			return true;
		} else {
			return false;
		}
	}

}

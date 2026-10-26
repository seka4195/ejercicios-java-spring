package diagnostico_java;

public class Pelicula extends Contenido implements Recomendable {
	private int minutos;

	public Pelicula(String titulo, int anio, int minutos) {
		super(titulo, anio);
		this.minutos = minutos;
	}

	@Override
	public String getDuracion() {
		return minutos + " minutos";
	}

	@Override

	public boolean esRecomendable() {
		if (minutos <= 150) {
			return true;
		} else {
			return false;
		}
	}
}

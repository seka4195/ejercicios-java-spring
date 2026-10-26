package diagnostico_java;

public class PruebaVideojuego {

	public static void main(String[] args) {
		Videojuego videojuego1 = new Videojuego(" the last of us", 2013, "PS5", 7.9, 25);
		Videojuego videojuego2 = new Videojuego(" kingdom hearTs   ", 2002, "Nintendo DS", 9.9, 30);
		Pelicula pelicula1 = new Pelicula("La bola negra", 2026, 240);
		Pelicula pelicula2 = new Pelicula("Troya", 2004, 125);

		System.out.println("Titulo: " + videojuego1.getTitulo() + " Año: " + videojuego1.getAnio() + " Duración: "
				+ videojuego1.getDuracion() + " Recomendable: " + videojuego1.esRecomendable());
		System.out.println("Titulo: " + videojuego2.getTitulo() + " Año: " + videojuego2.getAnio() + " Duración: "
				+ videojuego2.getDuracion() + " Recomendable: " + videojuego2.esRecomendable());
		System.out.println("Titulo: " + pelicula1.getTitulo() + " Año: " + pelicula1.getAnio() + " Duración: "
				+ pelicula1.getDuracion() + " Recomendable: " + pelicula1.esRecomendable());
		System.out.println("Titulo: " + pelicula2.getTitulo() + " Año: " + pelicula2.getAnio() + " Duración: "
				+ pelicula2.getDuracion() + " Recomendable: " +pelicula2.esRecomendable());
		
		Contenido[] contenidos = {videojuego1, videojuego2, pelicula1, pelicula2};
		
		
		for(Contenido contenido : contenidos) {
			System.out.println("Título: " + contenido.getTitulo() + " |Duración: " + contenido.getDuracion());
		}
		
		Recomendable[] recomendables = {videojuego1, videojuego2, pelicula1, pelicula2};
		
		int numeroRecomendables= 0;
		
		for(Recomendable recomendable : recomendables) {
			if(recomendable.esRecomendable()) {
				numeroRecomendables++;
			}
		}
		System.out.println("Recomendables: " + numeroRecomendables);
	}

}

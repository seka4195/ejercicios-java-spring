package diagnostico_java;

public class Main {

	public static void main(String[] args) {
		
		Calificaciones calificaciones = new Calificaciones();
		for(int nota=-1; nota<=11; nota++) {
			System.out.println( "NOTA: " + nota + ": "+ calificaciones.calificar(nota));
		}
	}

}

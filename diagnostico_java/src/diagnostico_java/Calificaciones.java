package diagnostico_java;

public class Calificaciones {
	
	public String calificar(int nota) {
		if(nota>=0 && nota<5) {
			return "Suspenso";
		}else if(nota>=5 && nota<7) {
			return "Aprobado";
		}else if(nota>=7 && nota<9) {
			return "Notable";
		}else if(nota>=9 && nota<=10) {
			return "Sobresaliente";
		}else {
			return "Nota inválida";
		}
	}
}

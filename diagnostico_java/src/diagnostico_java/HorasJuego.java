package diagnostico_java;

public class HorasJuego {

	public static void main(String[] args) {
		int[] horas = { 5, 12, 3, 9, 12, 0, 7, 4 };

		int totalHoras = 0;

		for (int hora : horas) {
			totalHoras = totalHoras + hora;
		}
		double media = totalHoras / (double) horas.length;
		System.out.println("Total de horas: " + totalHoras);
		System.out.println("Media: " + media);

		int horasMax = 0;
		int semana = 1;
		int semanasSobreMedia = 0;

		for (int i = 0; i < horas.length; i++) {
			if (horas[i] > horasMax) {
				semana = i + 1;
				horasMax = horas[i];
			}
		}
		System.out.println("Máximo: " + horasMax + " Semana: " + semana);

		for (int hora : horas) {
			if (hora > media) {
				semanasSobreMedia++;
			}
		}
		System.out.println("Semanas por encima de la media: " + semanasSobreMedia);
	}
}

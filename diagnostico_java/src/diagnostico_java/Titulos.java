package diagnostico_java;

public class Titulos {
	public static String normalizarTitulos(String titulo) {
		String tituloDefinitivo = "";

		String[] palabras = titulo.trim().split("\\s+");

		for (String palabra : palabras) {
			String mayusculas = palabra.substring(0, 1).toUpperCase();
			String minusculas = palabra.substring(1).toLowerCase();
			String todoJunto = mayusculas + minusculas;
			tituloDefinitivo += todoJunto + " ";

		}
		return tituloDefinitivo.trim();
	}

	public static void main(String[] args) {

		System.out.println(normalizarTitulos("   the LAST   of us  "));
		System.out.println(normalizarTitulos("   gOD oF   WAR  "));
		System.out.println(normalizarTitulos("   RESIDENT eVIL  "));
	}
}

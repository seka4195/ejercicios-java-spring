package diagnostico_java;

public class ValidadorNotas {
	public static void validarNota(double nota) throws NotaInvalidaException {
		if(nota < 0 || nota > 10) {
			throw new NotaInvalidaException ("La nota " + nota + " no es válida");
		}
	}
}

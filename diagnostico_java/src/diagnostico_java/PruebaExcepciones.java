package diagnostico_java;

public class PruebaExcepciones {

	public static void main(String[] args) {
		try {
			ValidadorNotas.validarNota(15);
			System.out.println("Nota guardada");
		} catch (NotaInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			System.out.println("Validación terminada.");
		}
		
		try {
			ValidadorNotas.validarNota(7);
			System.out.println("Nota guardada");
		}catch(NotaInvalidaException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			System.out.println("Validación terminada.");
		}
		
		try	{
		Integer.parseInt("abc");
		System.out.println("Letras transformadas.");
		}catch(NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			System.out.println("Validación terminada.");
		}
	}
}

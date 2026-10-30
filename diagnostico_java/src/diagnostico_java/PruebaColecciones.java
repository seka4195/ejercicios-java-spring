package diagnostico_java;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class PruebaColecciones {

	public static void main(String[] args) {
		List<Videojuego> videojuegos = new ArrayList<>();
		Videojuego videojuego1 = new Videojuego("The Last Of Us", 2020, "PS5", 7.8, 40);
		Videojuego videojuego2 = new Videojuego("Marvels Spiderman", 2023, "PS5", 9.2, 35);
		Videojuego videojuego3 = new Videojuego("Kingdom Hearts", 2002, "PS2", 9.9, 45);
		Videojuego videojuego4 = new Videojuego("Assassins creed II", 2009, "PS3", 9.1, 50);
		videojuegos.add(videojuego1);
		videojuegos.add(videojuego2);
		videojuegos.add(videojuego3);
		videojuegos.add(videojuego4);

		System.out.println(videojuegos.size());

		for (Videojuego videojuego : videojuegos) {
			System.out.println(videojuego.toString());
		}

		videojuegos.remove(videojuego3);

		System.out.println(videojuegos.size());

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.getNota() >= 8) {
				System.out.println(videojuego);
			}
		}
		
		
		Map<String,Integer> juegosPorPlataforma = new HashMap<>();
		
		for(Videojuego videojuego : videojuegos) {
			String plataforma = videojuego.getPlataforma();
			
			if(juegosPorPlataforma.containsKey(plataforma)) {
				int cantidad = juegosPorPlataforma.get(plataforma);
				juegosPorPlataforma.put(plataforma, cantidad + 1);
			}else {
				juegosPorPlataforma.put(plataforma, 1);
			}
		}
		
		for(String plataforma : juegosPorPlataforma.keySet()) {
			System.out.println(plataforma + ": " + juegosPorPlataforma.get(plataforma));
			
		Map<String,Double> nota = new HashMap<>();
		nota.put("God Of War", 8.45);
		nota.put("kingdom Hearts", 6.40);
		nota.put("Mafia Old Country", 8.15);
		
		System.out.println(nota.get("God Of War"));
		
		System.out.println(nota.containsKey("GTA"));
		
		nota.put("God Of War", 9.15);
		
		System.out.println(nota);
		}
	}
}

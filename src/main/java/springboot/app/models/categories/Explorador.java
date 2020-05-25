package springboot.app.models.categories;

import java.util.Map;

public class Explorador extends Categoria {
	
	private final String costoReducido = "Tramperia: 1, Herbolaria: 2, Animales: 1, Medicina: 2";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "Advertir", 10, "Buscar", 10, "Rastear", 10, "Tramperia", 5, "Animales", 5, "Herbolaria", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
	

}

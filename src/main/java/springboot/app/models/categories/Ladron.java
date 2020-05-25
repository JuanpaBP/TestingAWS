package springboot.app.models.categories;

import java.util.Map;

public class Ladron extends Categoria {
	
	private final String costoReducido = "Tasacion: 1";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HEsquiva", 5, "Advertir", 5, "Buscar", 5, "Ocultarse", 5, "Sigilo", 5, "Tramperia", 5, "Trucos de Manos", 5, "Robo", 10);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
}

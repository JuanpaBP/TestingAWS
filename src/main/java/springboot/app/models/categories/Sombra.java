package springboot.app.models.categories;

import java.util.Map;

public class Sombra extends Categoria {
	
	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "HEsquiva", 5, "Advertir", 10, "Buscar", 10, "Ocultarse", 10, "Sigilo", 10);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
}

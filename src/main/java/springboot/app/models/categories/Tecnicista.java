package springboot.app.models.categories;

import java.util.Map;

public class Tecnicista extends Categoria {

	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
	
}

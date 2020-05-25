package springboot.app.models.categories;

import java.util.Map;

public class Novel extends Categoria {

	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("Zeon", 10);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
}

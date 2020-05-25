package springboot.app.models.categories;

import java.util.Map;

public class Tao extends Categoria {

	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("Estilo", 5);
	
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
}

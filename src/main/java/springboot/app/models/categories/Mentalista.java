package springboot.app.models.categories;

import java.util.Map;

public class Mentalista extends Categoria {

	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = null;
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
}

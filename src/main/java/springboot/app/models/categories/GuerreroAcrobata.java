package springboot.app.models.categories;

import java.util.Map;

public class GuerreroAcrobata extends Categoria {
	
	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "HEsquiva", 5, "Acrobacias", 10, "Saltar", 10, "Atletismo", 10, "Trucos de Manos", 10, "Estilo", 10);
	
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
}

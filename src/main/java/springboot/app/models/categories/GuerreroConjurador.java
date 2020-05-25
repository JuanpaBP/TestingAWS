package springboot.app.models.categories;

import java.util.Map;

public class GuerreroConjurador extends Categoria{
	
	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "HParada", 5, "HEsquiva", 5, "Zeon", 20, "Convocar", 5, "Controlar", 5, "Desconvocar", 5, "Atar", 5, "Ocultismo", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	

}

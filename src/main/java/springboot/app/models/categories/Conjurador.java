package springboot.app.models.categories;

import java.util.Map;

public class Conjurador extends Categoria {
	private final String costoReducido = "Ocultismo: 1";
	private final Map<String , Integer> bonificadoresInnatos = Map.of("Zeon", 50, "Convocar", 10, "Controlar", 10, "Atar", 10, "Desconvocar", 10, "Valoracion Magica", 5, "Ocultismo", 10);
	
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}}

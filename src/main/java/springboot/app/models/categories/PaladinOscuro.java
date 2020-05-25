package springboot.app.models.categories;

import java.util.Map;

public class PaladinOscuro extends Categoria {
	
	private final String costoReducido = "Frialdad: 1";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "llevarArmadura", 5, "Controlar", 10, "Zeon", 20, "Intimidar", 10, "Frialdad", 10, "Estilo", 5, "Persuasión", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
	
}

package springboot.app.models.categories;

import java.util.Map;

public class Guerrero extends Categoria {
	
	private final String costoReducido = "Proezas de Fuerza: 1";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "HParada", 5, "llevarArmadura", 5, "Proezas de Fuerza", 5);
	
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	public String getCostoReducido() {
		return costoReducido;
	}
	
	
}

package springboot.app.models.categories;

import java.util.Map;

public class Paladin extends Categoria {

	private final String costoReducido = "Resistir el Dolor: 1";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HParada", 5, "llevarArmadura", 10, "Desconvocar", 10, "Zeon", 20, "Liderazgo", 10, "Resistir el Dolor", 10, "Estilo", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
}

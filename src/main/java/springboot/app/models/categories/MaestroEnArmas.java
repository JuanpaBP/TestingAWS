package springboot.app.models.categories;

import java.util.Map;

public class MaestroEnArmas extends Categoria {
	
	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "HParada", 5, "llevarArmadura", 10, "Proezas de Fuerza", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	

}

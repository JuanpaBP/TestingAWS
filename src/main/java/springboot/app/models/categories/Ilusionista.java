package springboot.app.models.categories;

import java.util.Map;

public class Ilusionista extends Categoria {

	private final String costoReducido = "Trucos de Manos: 1, Persuasion: 1";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("Zeon", 75, "Valoracion Magica", 5, "Sigilo", 5, "Ocultarse", 5, "Trucos de Manos", 5, "Disfraz", 5, "Robo", 5, "Persuasion", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
	
}

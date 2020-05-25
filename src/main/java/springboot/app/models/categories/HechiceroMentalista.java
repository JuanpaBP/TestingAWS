package springboot.app.models.categories;

import java.util.Map;

public class HechiceroMentalista extends Categoria {
	private final String costoReducido = "";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("Zeon", 100, "Valoracion Magica", 10, "Ocultismo", 5);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	

}

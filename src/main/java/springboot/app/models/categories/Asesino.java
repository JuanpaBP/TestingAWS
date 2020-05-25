package springboot.app.models.categories;

import java.util.Map;

public class Asesino extends Categoria {
	
	private final String costoReducido = "Sigilo: 1, Frialdad: 2, Memorizar: 2";
	private final Map<String, Integer> bonificadoresInnatos = Map.of("HAtaque", 5, "Advertir", 10, "Buscar", 10, "Ocultarse", 10, "Sigilo", 10, "Venenos", 10, "Frialdad", 10, "Tramperia", 10);
	public String getCostoReducido() {
		return costoReducido;
	}
	public Map<String, Integer> getBonificadoresInnatos() {
		return bonificadoresInnatos;
	}
	
	

}

package springboot.app.models.rules;

import java.util.List;

import springboot.app.models.categories.Categoria;

public class HabilidadCombate {
	
	private int limite;
	private int costoAtaque;
	private int costoParada;
	private int costoEsquiva;
	private int costoLlevarArmadura;
	private int costoKi;
	private int costoMultiploAcumulacion;
	private int ataque;
	private int parada;
	private int esquiva;
	private int llevarArmadura;
	private int ki;
	private int multiploAcumulacion;
	
	public HabilidadCombate(Categoria C, List<Object> puntos)
	{
		limite = C.getLimiteHA();
		costoAtaque = C.getHAtaque();
		costoParada = C.getHParada();
		costoEsquiva = C.getHEsquiva();
		costoLlevarArmadura = C.getLlevarArmadura();
		costoKi = C.getKi();
		costoMultiploAcumulacion = C.getMultiploAcumulacion();
		
	}
	
	
}

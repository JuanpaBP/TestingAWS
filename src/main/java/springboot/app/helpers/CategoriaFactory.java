package springboot.app.helpers;

import springboot.app.models.*;
import springboot.app.models.categories.Asesino;
import springboot.app.models.categories.Categoria;
import springboot.app.models.categories.Conjurador;
import springboot.app.models.categories.Explorador;
import springboot.app.models.categories.Guerrero;
import springboot.app.models.categories.GuerreroAcrobata;
import springboot.app.models.categories.GuerreroConjurador;
import springboot.app.models.categories.GuerreroMentalista;
import springboot.app.models.categories.Hechicero;
import springboot.app.models.categories.HechiceroMentalista;
import springboot.app.models.categories.Ilusionista;
import springboot.app.models.categories.Ladron;
import springboot.app.models.categories.MaestroEnArmas;
import springboot.app.models.categories.Mentalista;
import springboot.app.models.categories.Novel;
import springboot.app.models.categories.Paladin;
import springboot.app.models.categories.PaladinOscuro;
import springboot.app.models.categories.Sombra;
import springboot.app.models.categories.Tao;
import springboot.app.models.categories.Tecnicista;
import springboot.app.models.categories.Warlock;

public class CategoriaFactory {
	
	public static Categoria factory(int id)
	{
		switch(id)
		{
			case 1: return new Guerrero();
			case 2: return new GuerreroAcrobata();
			case 3: return new Paladin();
			case 4: return new PaladinOscuro();
			case 5: return new MaestroEnArmas();
			case 6: return new Tecnicista();
			case 7: return new Tao();
			case 8: return new Explorador();
			case 9: return new Sombra();
			case 10: return new Ladron();
			case 11: return new Asesino();
			case 12: return new Hechicero();
			case 13: return new Warlock();
			case 14: return new Ilusionista();
			case 15: return new HechiceroMentalista();
			case 16: return new Conjurador();
			case 17: return new GuerreroConjurador();
			case 19: return new Mentalista();
			case 20: return new GuerreroMentalista();
			case 21: return new Novel();
			default: return null;
		}
	}

}

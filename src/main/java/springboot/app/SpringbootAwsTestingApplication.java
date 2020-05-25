package springboot.app;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springboot.app.models.categories.Categoria;
import springboot.app.services.SBuscar;



@SpringBootApplication
public class SpringbootAwsTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsTestingApplication.class, args);
		/*
		SBuscar sb = new SBuscar();
		//Categoria C = sb.getOne(8);
		//System.out.println(C.getArquetipo());
		//List<Categoria> lista = sb.getAll();
		//for(Categoria c : lista)
		//{
		//	System.out.println(c.getNombre());
		//}
		List<Categoria> lista = sb.getByArquetipo("Luchador");
		for(Categoria c : lista)
		{
			System.out.println(c.getNombre() + " - " + c.getArquetipo());
		}*/
	}

}

package springboot.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import springboot.app.models.categories.Categoria;
import springboot.app.services.SBuscar;


@Controller
public class SearchController {
	
	@Autowired
	private SBuscar sb;

	@GetMapping(value = "/Categorias", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Categoria> getAll()
	{
		return sb.getAll();
	}
	
	@GetMapping(value = "/Categorias/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Categoria getOne(@PathVariable int id)
	{
		return sb.getOne(id);
	}
}

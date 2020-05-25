package springboot.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.fasterxml.jackson.databind.ObjectMapper;

import springboot.app.helpers.CategoriaFactory;
import springboot.app.models.categories.Categoria;

@Service
public class SBuscar {
	
	
	Regions region = Regions.SA_EAST_1;
	AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
            .withRegion(region)
            .build();
	String tableName = "Categorias";
	
	
	public Categoria getOne(int id)
	{
		//We create an aws client
		
		
		//Create the instance of the DB
		DynamoDB dynamoDB = new DynamoDB(client);
		
		//We take the table out from the dynamoDB
		Table table = dynamoDB.getTable(tableName);
		
		//Generate an "specific" item with the id we receive
		GetItemSpec spec = new GetItemSpec().withPrimaryKey("id", id);
		
		//We try to get it
		try
		{
			System.out.println("Attempting to read the item with " + id + " ID");
			Item output = table.getItem(spec);
			System.out.println("Here's the item: " + output);
			Categoria C = CategoriaFactory.factory(output.getInt("id"));
			C.setId(String.valueOf(id));
			C.setArquetipo(output.getString("arquetipo"));
			C.setNombre(output.getString("nombre"));
			C.setAtar(output.getInt("atar"));
			C.setAtleticas(output.getInt("atleticas"));
			C.setCm(output.getInt("cm"));
			C.setConvocar(output.getInt("convocar"));
			C.setCreativas(output.getInt("creativas"));
			C.setCv(output.getInt("cv"));
			C.setCvInnatos(output.getString("cvinnatos"));
			C.setDesconvocar(output.getInt("desconvocar"));
			C.setDominar(output.getInt("dominar"));
			C.setHAtaque(output.getInt("hataque"));
			C.setHEsquiva(output.getInt("hesquiva"));
			C.setHParada(output.getInt("hparada"));
			C.setIntelectuales(output.getInt("intelectuales"));
			C.setKi(output.getInt("ki"));
			C.setLimitePsi(output.getInt("limiteP"));
			C.setLimiteHA(output.getInt("limiteha"));
			C.setLimiteSN(output.getInt("limitesn"));
			C.setLlevarArmadura(output.getInt("llevararmadura"));
			C.setMultiploACT(output.getInt("multiploact"));
			C.setMultiploAcumulacion(output.getInt("multiploacumulacion"));
			C.setMultiploDeVida(output.getInt("multiplovida"));
			C.setPerceptivas(output.getInt("perceptivas"));
			C.setProyeccionMagica(output.getInt("proyeccionmagica"));
			C.setProyeccionPsiquica(output.getInt("proyeccionpsiquica"));
			C.setPv(output.getInt("pv"));
			C.setSociales(output.getInt("sociales"));
			C.setTurno(output.getInt("turno"));
			C.setVigor(output.getInt("vigor"));
			C.setZeon(output.getInt("zeon"));
			C.setPicture(output.getString("picture"));
			return C;
		}
		catch(Exception e)
		{
			System.err.println("Unable to read the item: " + id + " ID");
			System.err.println(e.getMessage());
			return new Categoria();
		}
		
	}
	
	public List<Categoria> getAll()
	{
		
		ScanRequest scan = new ScanRequest().withTableName(tableName);
		
		ScanResult result = client.scan(scan);
		
		List<Categoria> list = new ArrayList<Categoria>();
		for(Map<String, AttributeValue> item : result.getItems())
		{
			Categoria c = new Categoria();
			c.setId(item.get("id").getN());
			c.setNombre(item.get("nombre").getS());
			c.setArquetipo(item.get("arquetipo").getS());
			list.add(c);
		}
		return list;
	}
	
	public List<Categoria> getByArquetipo(String query)
	{
		Map<String, AttributeValue> expressionAttributeValues =
				new HashMap<String, AttributeValue>();
		expressionAttributeValues.put(":val", new AttributeValue().withS(query));
		
		ScanRequest scanRequest = new ScanRequest()
				.withTableName(tableName)
				.withFilterExpression("contains (arquetipo, :val)")//ESTO ES INAMOVIBLE PORQUE ES UNA FUNCION DEL API DE AWS
				.withExpressionAttributeValues(expressionAttributeValues);//EL SCAN REQUEST SE REALIZA BUSCANDO EN UNA TABLA (TABLENAME)
		//CON EL FILTRO (contains(arquetipo, :val)" contains es una palabra clave, el primer valor (arquetipo) es el nombre de la columna, y el 2do el valor(:val) es el nombre 
		//De la key en el mapa de lo que estoy buscando
		//Y WithExpressionAttributeValues especifica de donde sacar el query (":val")
		
		ScanResult result = client.scan(scanRequest);
		List<Categoria> list = new ArrayList<Categoria>();
		for(Map<String, AttributeValue> item : result.getItems()) 
		{
			Categoria c = new Categoria();
			c.setArquetipo(item.get("arquetipo").getS());
			c.setId(item.get("id").getS());
			c.setNombre(item.get("nombre").getS());
			list.add(c);
		}
		return list;
	}

}

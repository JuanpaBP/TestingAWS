package springboot.app.models.sheets;

import java.util.Map;

import springboot.app.models.Raza;
import springboot.app.models.categories.Categoria;

public class CharacterSheet {
	private String nombre;
	private Categoria categoria;
	private int nivel;
	private int edad;
	private boolean sexo;
	private Raza raza;
	private String pelo;
	private String ojos;
	private int PDesarrollo;
	private String altura;
	private String peso;
	private int apariencia;
	private int tamaño;
	private int experienciaActual;
	private int expSiguienteNivel;
	private Map<String, Integer> habilidadesSecundarias;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public String getOjos() {
		return ojos;
	}
	public void setOjos(String ojos) {
		this.ojos = ojos;
	}
	public int getPDesarrollo() {
		return PDesarrollo;
	}
	public void setPDesarrollo(int pDesarrollo) {
		PDesarrollo = pDesarrollo;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public int getApariencia() {
		return apariencia;
	}
	public void setApariencia(int apariencia) {
		this.apariencia = apariencia;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public int getExperienciaActual() {
		return experienciaActual;
	}
	public void setExperienciaActual(int experienciaActual) {
		this.experienciaActual = experienciaActual;
	}
	public int getExpSiguienteNivel() {
		return expSiguienteNivel;
	}
	public void setExpSiguienteNivel(int expSiguienteNivel) {
		this.expSiguienteNivel = expSiguienteNivel;
	}
	
}

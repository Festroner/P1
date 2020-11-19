package org.dis.primer_parcial;

public class golfPlayer {
	private int Posicion;
	private String Nombre;
	private String Apellido;
	private String Pais;
	private int Edad;
	
	
	public golfPlayer(int posicion, String nombre, String apellido, String pais, int edad) {
		super();
		Posicion = posicion;
		Nombre = nombre;
		Apellido = apellido;
		Pais = pais;
		Edad = edad;
	}
	public int getPosicion() {
		return Posicion;
	}
	public void setPosicion(int posicion) {
		Posicion = posicion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
}
//Clase para crear el objeto plano (POJO) con anotaciones

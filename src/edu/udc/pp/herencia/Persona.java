package edu.udc.pp.herencia;

public class Persona { 

	private String nombre;
	private int edad;
	private String domicilio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void saludar(){
		System.out.println("Hola me llamo " +  this.getNombre());
	}
}

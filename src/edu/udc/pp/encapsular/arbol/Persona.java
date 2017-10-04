package edu.udc.pp.encapsular.arbol;

public class Persona {
	private int numeroDocumento;
	private String nombre;
	
	public Persona(int numeroDocumento, String nombre) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	
}

package edu.udc.pp.encapsular.arbol;

public class NodoArbol {
	
	private int clave;
	private Persona persona;
	
	private NodoArbol izquierdo;
	private NodoArbol derecho;
	
	public NodoArbol(int clave, Persona persona) {
		super();
		this.clave = clave;
		this.persona = persona;
	}
	
	//TODO ver visiblidad
	public void setIzquierdo(NodoArbol izquierdo) {
		this.izquierdo = izquierdo;
	}
	
	public NodoArbol getIzquierdo() {
		return izquierdo;
	}
	
	
	public void setDerecho(NodoArbol derecho) {
		this.derecho = derecho;
	}
	
	public NodoArbol getDerecho() {
		return derecho;
	}
	
	public int getClave() {
		return clave;
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	
}

package edu.udc.pp.herencia.abtractas;

public abstract class Vehiculo {
	
	private int velocidadMaxima;
	private int velocidad;
	private Persona propietario;
	
	
	public Persona getPropietario() {
		return propietario;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public abstract void avanzar();
	
}

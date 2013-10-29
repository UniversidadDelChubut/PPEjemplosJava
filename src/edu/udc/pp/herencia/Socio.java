package edu.udc.pp.herencia;

public class Socio extends Persona {
	
	private int numeroSocio;
	
	public int getNumeroSocio() {
		return numeroSocio;
	}
	
	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}
	
	
	@Override
	public void saludar() {
		System.out.println("Soy " + this.getNombre() +  " socio numero " +  this.getNumeroSocio() + " del club" );
	}
	
}

package edu.udc.pp.herencia;

public class Socio extends Persona {
	
	private int numeroSocio;
	private static double valorCuotaSocietaria = 1500;
	
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
	
	public double getValorCuotaMensual() {
		return Socio.valorCuotaSocietaria;
	}
	
	//Extender con Socio Menor y Socio Vitalicio
	
	
	
}

package edu.udc.pp.patrones.template;

public abstract class Vehiculo {
	
	private double valor;
	private Contribuyente propietario;
	
	
	public double getValor() {
		return valor;
	}
	
	public final double calcularImpuesto() {
		if(propietario.isExento())
			return 0;
		return calcularImpuestoVehiculo();
	}
	
	protected abstract double calcularImpuestoVehiculo();
	
}

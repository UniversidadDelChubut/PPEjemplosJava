package edu.udc.pp.patrones.template;

public class Auto extends Vehiculo {

	@Override
	protected double calcularImpuestoVehiculo() {
		//El auto paga el dos por mil
		return this.getValor() * 0.002;
	}
}

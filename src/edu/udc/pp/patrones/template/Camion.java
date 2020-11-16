package edu.udc.pp.patrones.template;

public class Camion extends Vehiculo {

	@Override
	protected double calcularImpuestoVehiculo() {
		// El camion paga el 3 por mil
		return this.getValor()  * 0.003;
	}
}

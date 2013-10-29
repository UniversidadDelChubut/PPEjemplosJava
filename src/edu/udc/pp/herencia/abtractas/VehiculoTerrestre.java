package edu.udc.pp.herencia.abtractas;

public abstract class VehiculoTerrestre extends Vehiculo {
	
	public abstract int getCantidadRuedas();
	
	public boolean isAptoAsfalto(){
		return true;
	}
	
}

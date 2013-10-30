package edu.udc.pp.herencia.abtractas;

public class Auto extends VehiculoTerrestre {

	private String modelo;
	private String tipo;
	//Completar ejemplo usando clases como discriminantes

	@Override
	public void avanzar() {
			
	}
	
	@Override
	public int getCantidadRuedas() {
		return 4;
	}
	
}

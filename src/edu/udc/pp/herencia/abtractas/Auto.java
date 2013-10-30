package edu.udc.pp.herencia.abtractas;

public class Auto extends VehiculoTerrestre implements Aerotransportable {

	
	private int peso;
	private int volumen;
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
	
	public String getTipo() {
		return tipo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	
	@Override
	public int getPeso() {
		return this.peso;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

}

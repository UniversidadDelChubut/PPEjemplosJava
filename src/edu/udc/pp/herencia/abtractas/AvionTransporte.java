package edu.udc.pp.herencia.abtractas;

public class AvionTransporte extends VehiculoAereo {
	private int cargaMaxima;
	private int volumenMaximo;
	private int cargaActual;
	private int volumenActual;
	
	@Override
	public void avanzar() {
	}
	
	public boolean cargar(Aerotransportable at){
		if (this.cargaMaxima < this.cargaActual + at.getPeso())
			return false;
		
		
		return true;
	}
}

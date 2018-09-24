package edu.udc.pp.agregacioncomposicion;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Camion {
	
	private String matricula;
	private Conductor conductor;
	private List<Viaje> viajes = new LinkedList<>();
		
	public String getMatricula() {
		return matricula;
	}
	
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public Conductor getConductor() {
		return conductor;
	}
	
	public List<Viaje> getViajes() {
		return new LinkedList<>(viajes);
	}
	
	public void agregarViaje(TerminalCarga origen, TerminalCarga destino, Date partida, Date arribo) {
		this.viajes.add( new Viaje(origen, destino, partida, arribo) );
	}
}

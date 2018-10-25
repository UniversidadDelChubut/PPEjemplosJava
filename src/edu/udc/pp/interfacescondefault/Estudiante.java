package edu.udc.pp.interfacescondefault;

public class Estudiante extends Persona implements Comparable<Estudiante> {
	
	private int numeroLegajo;
	
	public Estudiante(int dni, String nombre, int numeroLegajo) {
		super(dni, nombre);
		this.numeroLegajo = numeroLegajo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}
	
	//@Override
	public int compareTo(Estudiante o) {
		return this.getNombre().compareTo(o.getNombre());
	}
}

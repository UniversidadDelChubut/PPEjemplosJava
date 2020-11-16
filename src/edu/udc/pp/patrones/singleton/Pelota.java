package edu.udc.pp.patrones.singleton;

public class Pelota {
	
	private static Pelota instancia = new Pelota();
	
	public static Pelota getPelota() {
		return instancia;
	}
	
	private Pelota() {
		
	}

}

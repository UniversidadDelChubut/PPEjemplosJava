package edu.udc.pp.patrones.template;

import java.util.LinkedList;
import java.util.List;

public class Contribuyente {
	
	private static List<Contribuyente> contribuyentes =  new LinkedList<>();
	
	private int numero;
	private String nombre;
	private boolean exento;
	
	
	public int getNumero() {
		return numero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean isExento() {
		return exento;
	}

	static {
		Contribuyente c;
		c = new Contribuyente();
		c.numero = 1;
		c.nombre = "Rico Mc PAto";
		c.exento = false;
		contribuyentes.add(c);
		
		c = new Contribuyente();
		c.numero = 2;
		c.nombre = "Horfanato Los Carasucias";
		c.exento = true;
		contribuyentes.add(c);
	}
	
	public static Contribuyente getContribuyente(int numero) {
		for (Contribuyente c: Contribuyente.contribuyentes) {
			if (c.getNumero() == numero)
				return c;
		}
		return null;
	}
}

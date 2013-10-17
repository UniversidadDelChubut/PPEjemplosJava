package edu.udc.pp.metodosdeclase;

public class Hombre {
	
	private String nombre;
	private int altura;
	
	private static Hombre elMasAlto;
	
	public static Hombre getElMasAlto() {
		return elMasAlto;
	}

	public Hombre(String nombre, int altura) {
		this.nombre = nombre;
		this.altura = altura;
		if (Hombre.elMasAlto == null || Hombre.elMasAlto.getAltura() < this.altura){
			Hombre.elMasAlto = this;
		}
	}
	
	public int getAltura() {
		return altura;
	}
	
	public String getNombre() {
		return nombre;
	}
}

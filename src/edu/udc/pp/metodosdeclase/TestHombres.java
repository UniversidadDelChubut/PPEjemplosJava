package edu.udc.pp.metodosdeclase;

public class TestHombres {

	public static void main(String[] args) {
		
		new Hombre("Alberto", 172);
		new Hombre("Sebastian", 188);
		new Hombre("Carlos", 156);
		
		System.out.println(Hombre.getElMasAlto().getNombre() + " mide " + Hombre.getElMasAlto().getAltura());
		
	}
}

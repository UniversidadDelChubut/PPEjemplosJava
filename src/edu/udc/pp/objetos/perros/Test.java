package edu.udc.pp.objetos.perros;

public class Test {

	public static void main(String[] args) {
		
		Perro petete = new Perro("Petete");

		Perro chiflo = new Perro("Chiflo", 24);
		chiflo.setVelocidadMaxima(62);
		chiflo.comer(0.900f, "polenta");
		
		Perro zurdo = new Perro("Zurdo", 23);
		zurdo.setVelocidadMaxima(64);
		zurdo.comer(0.650f);
		
		
		System.out.println(chiflo.getNombre() + " tiene " + chiflo.getEnergia()
				+ " de energia");
		
		System.out.println(zurdo.getNombre() + " tiene " + zurdo.getEnergia()
				+ " de energia");
		
		
		
		Perro elMejor;
		
		
		
		chiflo.picar();
		zurdo.picar();
		
		if (chiflo.getVelocidad() > zurdo.getVelocidad()){
			elMejor = chiflo;
		} else {
			elMejor = zurdo;
		}
		
		
		System.out.println("El mejor es " + elMejor.getNombre());
		
		elMejor.comer(0.300f);
		
		
		

	}

}

package edu.udc.pp.objetos.perros;

import edu.udc.pp.encapsular.lista.Lista;

public class PruebaListaPerros {

	public static void main(String[] args) {
		
		Perro chiflo = new Perro("Chiflo", 24);
		chiflo.setVelocidadMaxima(62);
		chiflo.comer(0.900f);
		
		
		Perro chiflo2 = new Perro("Chiflo", 24);
		chiflo2.setVelocidadMaxima(62);
		chiflo2.comer(0.900f);
		
		
		 
		Perro zurdo = new Perro("Zurdo", 23);
		zurdo.setVelocidadMaxima(64);
		zurdo.comer(0.650f);
		
		Perro palmiro = new Perro("Palmiro", 21);
		zurdo.setVelocidadMaxima(55);

		Perro ramonAngel = new Perro("Ramon Angel", 35);
		zurdo.setVelocidadMaxima(52);

		Perro alberto = new Perro("Alberto", 37);
		zurdo.setVelocidadMaxima(51);

		Perro camila= new Perro("Camila", 39);
		zurdo.setVelocidadMaxima(50);
		
		
		Lista listaPerros = new Lista();
		listaPerros.add(zurdo);
		listaPerros.add(chiflo);
		listaPerros.add(palmiro);
		listaPerros.add(ramonAngel);
		listaPerros.add(alberto);
		listaPerros.add(alberto);
		
		
		System.out.println("El quinto perro de la lista se llama " + listaPerros.get(4).getNombre() );
		System.out.println("El sexto perro de la lista se llama " + listaPerros.get(5).getNombre() );
		
		
		
		
		Lista lista2 = new Lista();
		
		
		Perro p = listaPerros.get(2) ;
		lista2.add(  p );
		
		System.out.println( listaPerros.get(2) == lista2.get(0) );
		
		
		
		
		
		
		
		
	}
}

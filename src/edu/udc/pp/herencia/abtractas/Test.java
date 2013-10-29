package edu.udc.pp.herencia.abtractas;

import javax.xml.bind.ValidationEventHandler;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v = new Auto();
		
		v.avanzar();
		
		System.out.println( v.getVelocidad() );
		
	}

}

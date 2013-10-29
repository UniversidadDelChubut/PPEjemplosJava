package edu.udc.pp.herencia.abtractas;

import javax.xml.bind.ValidationEventHandler;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		VehiculoTerrestre vt = new Auto();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		vt = new Moto();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		vt = new MinningTruck();
		System.out.println( "APTO ASFALTO " + vt.isAptoAsfalto());
		
		
	}

}

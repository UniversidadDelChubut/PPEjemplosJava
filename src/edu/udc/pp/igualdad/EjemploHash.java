package edu.udc.pp.igualdad;

import java.util.HashMap;


public class EjemploHash {

	public static void main(String[] args) {
		HashMap<Integer, CuentaBancaria> cuentas = new HashMap<Integer, CuentaBancaria>();
		
		
		
		CuentaBancaria cb1 = new CuentaBancaria(1, 100);
		CuentaBancaria cb2 = new CuentaBancaria(2, 102);
		CuentaBancaria cb3 = new CuentaBancaria(3, 300);
		CuentaBancaria cb1bis = new CuentaBancaria(1, 100);
		

		/*
		cuentas.put(cb1.getNumero(), cb1);
		cuentas.put(cb2.getNumero(), cb2);
		cuentas.put(cb3.getNumero(), cb3);
		*/
		
		System.out.println(cb1.equals(cb1bis));
		
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		System.out.println("hc de i1 " +  i1.hashCode() );
		System.out.println("hc de i2 " +  i2.hashCode() );
		
		System.out.println("hc de cb1    " +  cb1.hashCode() );
		System.out.println("hc de cb1bis " +  cb1bis.hashCode() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

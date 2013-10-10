package edu.udc.pp.igualdad;

import java.util.Collection;
import java.util.LinkedList;

public class IgualdadyEquivalencia {

	
	public static void main(String[] args) {
		
		
		
		LinkedList <String> cadenas = new LinkedList <String> ()  ;
		
		String s1 = "pepe";
		String s2 = "pe";
		String s3 = s2 + s2;
		
		System.out.println( s1 + " " + s3);
		System.out.println( s1 == s3 );
		System.out.println( s1.equals( s3 ) );
		
		cadenas.add(s1);
		if (! cadenas.contains(s2)){
			cadenas.add(s2);
		}
		if (! cadenas.contains(s3)){
			cadenas.add(s3);
		}
		
		System.out.println("----");
		for(String s: cadenas){
			System.out.println(s);
		}
		System.out.println("----");
		
		
		
		
		CuentaBancaria cb1 = new CuentaBancaria(1, 100);
		CuentaBancaria cb2 = new CuentaBancaria(1, 100);
		
		
		System.out.println(cb1 == cb2);
		System.out.println(cb1.equals(cb2));
		
		
		
		
		
		
		
	}
	
	
}

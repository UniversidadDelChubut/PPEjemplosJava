package edu.udc.pp.elementosbasicos;

import java.util.LinkedList;

public class Tema03EstructurasDeControl04SentenciaFor {
	
	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<>();
		String[] arreglo = {"Rattin", "Mouzo", "Gatti", "El Diego", "Giunta", "Román"};
		
		for (int i=0; i < arreglo.length; i++) {
			lista.add(arreglo[i]);
		}
		
		for (int i=0; i < arreglo.length; i++) {
			System.out.printf( lista.get(i) + " ");
		}
		System.out.println(" - bucle for - ");
		
		for (String nombre: arreglo) {
			System.out.printf( nombre + " ");
		}
		System.out.println(" - bucle for each - ");
		
		for (String nombre: lista) {
			System.out.printf( nombre + " ");
		}
		System.out.println(" - bucle for each - ");
				
	}

}

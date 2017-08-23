package edu.udc.pp.elementosbasicos;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Tema05Colecciones {
	
	public static void main(String[] args) {
		
		LinkedList<String> cadenas = new LinkedList<>();
		LinkedList<Integer> enteros = new LinkedList<>();
				
		cadenas.add("Arbol");
		cadenas.add("Barco");
		cadenas.add("Camisa");
		cadenas.add("Dedo");
		cadenas.add("Elefante");
		cadenas.add("Fideo");
		cadenas.add("Gato");
		cadenas.add("Hiena");
		
		enteros.add(1);
		enteros.add(2);
		enteros.add(3);
		enteros.add(4);
		enteros.add(5);
		enteros.add(6);
		
		for (String s: cadenas) {
			System.out.printf("%s ", s);
		}
		System.out.println(" <- Original");
		
		Collections.shuffle(cadenas);
		
		for (String s: cadenas) {
			System.out.printf("%s ", s);
		}
		System.out.println(" <- Desordenada");
		
		Collections.sort(cadenas);
		
		for (String s: cadenas) {
			System.out.printf("%s ", s);
		}
		System.out.println(" <- Reordenadas");
		
		
		//Agrega al final
		enteros.add(10 + 1);
		//Agrega en la segunda posición
		enteros.add(1, 10);
		
		for (int v: enteros) {
			System.out.printf("%d ", v);
		}
		System.out.println(" <- Enteros ");
		
		
		String[] arregloCadenas = {"Vacío", "Parrillada"};
		
		List <String> cadenasNuevas = Arrays.asList(arregloCadenas);
		
		cadenas.addAll(cadenasNuevas);
		
		
		for (String s: cadenas) {
			System.out.printf("%s ", s);
		}
		System.out.println("");

		System.out.println("Contiene Pan? " + cadenas.contains("Pan"));
		
		System.out.println("Contiene Parrillada? " + cadenas.contains("Parrillada"));
		
		
		
				
	}
}

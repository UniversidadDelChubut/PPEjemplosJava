package edu.udc.pp.elementosbasicos;

/**
 * Ejemplos de arrays y estructuras repetitivas.
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */
public class Tema04Arreglos {

	public static void main(String[] args) {

		float[] temperaturasPromedio = new float[12];
		//Los arreglos de tipos primitivos se llenan con valores por defecto
		
		for (float valor: temperaturasPromedio) {
			System.out.print(valor + " ");
		}
		System.out.println(" <- Valores de inicialización");
		

		temperaturasPromedio [0] = 23.4f;
		temperaturasPromedio [1] = 22.1f;
		temperaturasPromedio [2] = 20.0f;
		temperaturasPromedio [3] = 17.0f;
		temperaturasPromedio [4] = 13.0f;
		temperaturasPromedio [5] = 10.4f;
		temperaturasPromedio [6] =  9.5f;
		temperaturasPromedio [7] = 11.5f;
		temperaturasPromedio [8] = 13.7f;
		temperaturasPromedio [9] = 17.5f;
		temperaturasPromedio[10] = 20.6f;
		temperaturasPromedio[11] = 22.9f;
		
		for (float valor: temperaturasPromedio) {
			System.out.print(valor + " ");
		}
		System.out.println( " <- Valores cargados ");
		
		float suma = 0.0f; // <- notar la f
		
		for (int i = 0 ; i < temperaturasPromedio.length ; i++) {
			suma += temperaturasPromedio[i];
		}
		
		System.out.printf("La temperatura promedio anual es %.2f", suma /temperaturasPromedio.length);

		

		int[] fibonacci = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 }; // <- Sólo en la declaración

		System.out.println("Longitud " + fibonacci.length);
		
	}

}

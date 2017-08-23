package edu.udc.pp.elementosbasicos;

import java.util.Random;

public class Tema03EstructurasDeControl01SentenciaIf {

	public static void main(String[] args) {

		Random rnd = new Random();

		int a = rnd.nextInt(1000);
		int b = rnd.nextInt(1000);
		int c = rnd.nextInt(1000);
		int d = rnd.nextInt(1000);

		System.out.printf("a=%d , b=%d , c=%d , d=%d\n", a, b, c, d);

		if (a > 500)
			System.out.println("a tiene un valor mayor de quinientos");

		if (b > 500) {
			System.out.println("b tiene un valor mayor de quinientos");
		}

		if (c > 500) {
			System.out.println("c tiene un valor mayor de quinientos");
		} else {
			System.out.println("c no tiene un valor mayor de quinientos");
		}
		
		if (a >= b && a >= c && a >= d) {
			System.out.println("El mayor es a");
		} else if (b >= c && b >= d) {
			System.out.println("El mayor es b");
		} else if (c >= d) {
			System.out.println("El mayor es c");
		} else {
			System.out.println("El mayor es d");
		}

		// La versión anterior es más legible
		if (a >= b && a >= c && a >= d) {
			System.out.println("El mayor es a");
		} else {
			if (b >= c && b >= d) {
				System.out.println("El mayor es b");
			} else {
				if (c >= d) {
					System.out.println("El mayor es c");
				} else {
					System.out.println("El mayor es d");
				}
			}
		}

		/*
		 * Muy claro en:
		 * https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Sentencia_if-else
		 */
	}
}

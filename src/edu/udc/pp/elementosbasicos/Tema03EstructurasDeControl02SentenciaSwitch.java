package edu.udc.pp.elementosbasicos;

import java.util.Random;

public class Tema03EstructurasDeControl02SentenciaSwitch {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		// Elige una operacion al azar entre números del 1 al 99
		char [] operadores = {'+','-','*','/'};
		char operador = operadores [rnd.nextInt(4)];
		int operando1 = rnd.nextInt(99) + 1;
		int operando2 = rnd.nextInt(99) + 1;
		
		System.out.printf("%d %c %d = " , operando1, operador, operando2 );
		
		switch (operador) {
		case '+':
			System.out.println( operando1 + operando2 );
			break;
		case '-':
			System.out.println( operando1 - operando2 );
			break;
		case '*':
			System.out.println( operando1 * operando2 );
			break;
		case '/':
			System.out.println( operando1 / operando2 );
			break;
		default:
			System.out.println("No deberíamos estar aquí");
			break;
		}
		
		
		System.out.println();
		
		
		// Si no se usa break continúa con la siguiente instrucción 
		int cantidad = rnd.nextInt(5) + 1;
		System.out.println(cantidad + " estrella" + (cantidad > 1 ? "s":""));
		switch (cantidad) {
		case 5:
			System.out.print("*");
		case 4:
			System.out.print("*");
		case 3:
			System.out.print("*");
		case 2:
			System.out.print("*");
		case 1:
			System.out.println("*");
		}

		/*
		 * https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/
		 * Sentencia_switch
		 */
	}
}

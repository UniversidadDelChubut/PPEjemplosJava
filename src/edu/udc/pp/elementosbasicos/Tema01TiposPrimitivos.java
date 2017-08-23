package edu.udc.pp.elementosbasicos;

/**
 * Ejemplos de declaraciones y asignaciones de tipos primitivos.
 * 
 * @author Santiago Della Torre
 *
 */
public class Tema01TiposPrimitivos {
	
	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l = 123L;      //Se puede inicializar en la declaraci�n 
		float f;
		double d = Math.PI;
		char c;
		boolean bool;
		
		b = 8; // Las variables autom�ticas deben incializarse antes de usarlas
		
		/* Hay una clase asociada a cada tipo de datos primitivo. 
		 * Entre otrras cosas le podemos pedir a la cada una de ellas 
		 * el m�nimo y m�ximo valor permitido para cada tipo.  
		 */
		b = Byte.MIN_VALUE; 		
		
		System.out.println(
				"El m�ximo valor que se puede almacenar "
				+ "en una variable de tipo byte es " 
				+ Byte.MAX_VALUE);
		
		/*
		 * Ejercicio:
		 * a) Escriba un programa que imprima el m�nimo valor permitido
		 * y el m�ximo valor permitido para cada uno d elos tipos enteros.
		 * b) Responda �Estos valores m�ximos y m�nimos difieren entre distintos sistemas (SO y hardware)? 
		 */
		
		
		/* Ejercicio
		 * �Porqu� la asignaci�n que est� a continuaci�n no funciona? 
		 */
		// b = 5000; // <---- Descomentar para corroborar que no funciona 

		// En java se controla que toda variable local deba ser incializada antes de usarla 
		// b = i;    // <---- Al descomentar vermos que falla
		
		i = 12;
		// b = i;    // <---- Preguta: �Porqu� falla si 12 es un valor aceptado por un byte?
		             //       Pregunta �Como puedo forzar la asignaci�n?

		//Asignaci�n de literales
		i = 12;    //Decimal
		i = 012;   //Octal
		i = 0x12;  //Hexadecimal
		System.out.println("c = " + i);

		
		//Literales con underscore 
		long habitantesDeLaTierra = 7490475892L;
		//O mejor, por temas de legibilidad
		habitantesDeLaTierra = 7_490_475_892L;

		/* Para el dato actualizado ver:
		 *    http://www.worldometers.info/world-population/ 
		 */		
		
		System.out.println("En la tierra hay " + habitantesDeLaTierra + " habitantes");
		System.out.printf("En la tierra hay %d habitantes\n", habitantesDeLaTierra);
		System.out.printf("En la tierra hay %,d habitantes\n", habitantesDeLaTierra);
		/* Es aconsejable usar salida con 
		 * Referencia r�pida printf 
		 * http://web.cerritos.edu/jwilson/SitePages/java_language_resources/Java_printf_method_quick_reference.pdf 
		 */
		
		/* Flotantes */		
		double d1 = 123.4;
		double d2 = 1.234e2;
		float f1  = 123.4f;
		
		/* Caracteres */
		
		char caracterEspecial = '\u00e4'; //La letra a con di�resis
		System.out.println(caracterEspecial);

		//Las cadenas son objetos, son una secuencia de caracteres
		String cad = "";
		for (i = 0; i<=30 ; i++) {
			cad += caracterEspecial++;  
		}
		System.out.println(cad);
		
		c = '\u221E'; //Simbolo del infinito en Unicode
		c = '\n';
		c = 'd';
		
		if (c >='a' && c <= 'z') {
			System.out.println("El caracter " + c + " est� en la posici�n " + (c - 'a' + 1) + " del alfabeto");
			System.out.printf("El caracter %c est� en la posici�n %d del alfabeto\n", c, c - 'a' + 1);
		}
		
		/*Secuencias de escape*/
		cad = "M\u00e6ler\nc:\\";
		System.out.println(cad);
		
		/*  
		 * Java tutorial
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * 
		 * Traducido no oficial: 
		 * http://www.codexion.com/tutorialesjava/java/nutsandbolts/datatypes.html
		 */
		
	}

}

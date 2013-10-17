package edu.udc.pp.metodosdeclase;

import java.util.Random;

public class RandomizeTP {

	public static void main(String[] args) {
		String [] alumnos = {"Alan", "Fernando", "Jaime", "Julian", "Pablo" };
		String [] lenguajes= {"Python", "Ruby", "SmallTalk", "ObjectiveC", null};
		
		
		Random rnd = new Random();
		
		
		int lenguaje = rnd.nextInt(4);
		lenguajes [4] = lenguajes[lenguaje];
		
		for (int i = 0 ; i < 5; i++) {
			//ELEGIR LENGUAJE
			do {
				lenguaje = rnd.nextInt(5);
			} while( lenguajes[lenguaje] == null );
			
			//ELEGIR ALUMNO
			int alumno;
			do {
				alumno = rnd.nextInt(5);
			} while( alumnos[alumno] == null );
			
			//MOSTRAR
			System.out.println(alumnos[alumno] + " " + lenguajes[lenguaje]);
			
			//LIMPIAR
			lenguajes[lenguaje] = null;
			alumnos[alumno] = null ;
		}
		
		
		
		
	}
}

package edu.udc.pp.elementosbasicos;

public class Tema00MetodoMain {

	public static void main(String[] args) {
		
		System.out.println(
				"Un progrma normalmente se"
				+ " lanza mediante el m�todo main.");
		
		System.out.println(
				"Los argumentos de l�nea de comandos se pueden obtener"
				+ " del arreglo recibido como par�metro, los argumentos"
				+ " se reciben siempre como cadena.");
		
		System.out.println(
				"Los argumentos de l�nea de comandos se pueden"
				+ " entrecomillar para poder agregar espacios en las"
				+ " cadenas recibidas");
		
		if (args.length != 0) {
			System.out.println("Argumentos recibidos:");		
			for (String arg: args) {
				System.out.println(arg);
			}
		} else {
			System.out.println("Este proceso se lanz� sin agumentos");
		}
		
	}
	
}

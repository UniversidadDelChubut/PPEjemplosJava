package edu.udc.pp.elementosbasicos;

public class Tema03EstructurasDeControl03While {
	
	public static void main(String[] args) {
		
		int i = 1;
		System.out.printf("Del 1 al 9: ");
		while (i <= 9) {
			System.out.printf(i++ +" ");
		}
		System.out.printf(" - usando while - \n");

		
		i = 1;
		System.out.printf("Del 1 al 9: ");
		do {
			System.out.printf(i++ +" ");
		} while (i <= 9);
		System.out.printf(" - usando do while - \n");

		
	}

}

package edu.udc.pp.elementosbasicos;

public class Tema03EstructurasDeControl05SentenciasDeCorte {

	public static void main(String[] args) {
		int i = 1;
		System.out.printf("Del 1 al 9: ");
		while (i <= 9) {
			System.out.printf(i++ +" ");
		}
		System.out.printf(" - usando while - \n");


		i = 1;
		System.out.printf("Del 1 al 9: ");
		while (true) {
			System.out.printf(i++ +" ");
			if (i > 9)
				break;
		}
		System.out.printf(" - cortando con break - \n");
		
		i = 0;
		System.out.printf("Impares del 1 al 9: ");
		while (true) {
			i++;
			if (i > 9)
				break;			
			if (i%2==0)
				continue;
			System.out.printf(i +" ");
		}
		System.out.printf(" - con break y continue - \n");
		
	}
}

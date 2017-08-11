package edu.udc.pp.varios.gruposalazar;

public class Principal {

	public static void main(String[] args) {
		
		AgrupadorAlAzar agrupador = new AgrupadorAlAzar("estudiantes.txt");
		agrupador.agruparEImprimir(2);
		
	}
}

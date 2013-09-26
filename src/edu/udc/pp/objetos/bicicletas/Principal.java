package edu.udc.pp.objetos.bicicletas;

public class Principal {

	public static void main(String[] args) {


		Ciclista ciclista = new Ciclista("Pedro");
		Bicicleta bicicleta = new Bicicleta(26, "Bianchi");
		bicicleta.montar(ciclista);
		
		
		System.out.println("La " +  bicicleta.getMarca() + " es montada por " + bicicleta.getCiclista().getNombre() );
		
		
		Bicicleta bicicleta2 = new Bicicleta(26, "Zenith");
		if (bicicleta2.isEnUso()) { 
		System.out.println(
				"La " +  bicicleta2.getMarca() + 
				" es montada por " + bicicleta2.getCiclista().getNombre() );
		} else {
			System.out.println("No este en uso la " +  bicicleta2.getMarca());
		}
	}

}

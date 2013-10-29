package edu.udc.pp.interfaces;

public class MaquinaRecargadora {

	void recargar(String compania, String numeroCliente, double importe) {
		
		Recargable recargable = null;
		
		if (compania.equals("MOVISTAR") || compania.equals("CLARO")){
			long numeroLinea = Long.parseLong(numeroCliente);
			recargable = new Celular(numeroLinea);
		}
		if (compania.equals("DIRECTV") ){
			recargable = new DecoTV(numeroCliente);
		}
		
		recargable.recargar(importe);
		

	}
	
}

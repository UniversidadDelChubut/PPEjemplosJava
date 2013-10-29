package edu.udc.pp.interfaces;

public class DecoTV implements Recargable {
	
	public static final double VALOR_MINUTO = 0.12;
	
	private int minutos;
	
	public DecoTV(String numeroCliente) {
		//TRAIGO DE LA BBDD
		this.minutos = 100;
	}
	
	public void verPrograma() {
		this.minutos -= 60;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	@Override
	public void recargar(double importe) {
		this.minutos = (int) (importe / DecoTV.VALOR_MINUTO); 
	}
	
	@Override
	public double getSaldo() {
		return this.minutos * DecoTV.VALOR_MINUTO;
	}
	
}

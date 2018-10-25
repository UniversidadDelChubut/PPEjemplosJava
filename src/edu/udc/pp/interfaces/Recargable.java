package edu.udc.pp.interfaces;

public interface Recargable {
	
	public static final int MAXIMO_RECARGA = 500;
	
	public void recargar(double importe);
	
	public double getSaldo();
	
}

package edu.udc.pp.interfaces;

public class Celular implements Recargable {
	
	public static final double VALOR_MINUTO = 0.25; 
	
	private double saldo;
	
	public Celular(long numero) {
		// HACER TODAS LAS COSAS PARA CREAR EL CELULATR
		//TRAER DE LA BASE DE DATOS EL SALDOS
		//Y EL NOMBRE DEL CLIENTE
		this.saldo = 8.50;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void llamar(long numero) {
		this.saldo -= Celular.VALOR_MINUTO; 
	}
	
	@Override
	public void recargar(double importe) {
		this.saldo += importe;
	}
	
}

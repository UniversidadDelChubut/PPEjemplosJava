package edu.udc.pp.igualdad;

public class CuentaBancaria {
	
	private int numero;
	private double saldo;
	
	public CuentaBancaria(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public boolean equals(CuentaBancaria laOtraCuanta) {
		return this.numero == laOtraCuanta.numero;
	}
	
	@Override
	public int hashCode() {
		return this.numero;
	}
	
	
}
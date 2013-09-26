package edu.udc.pp.objetos.bicicletas;

public class Bicicleta {
	private int rodado;
	private String marca;
	private boolean andando;
	private Ciclista ciclista;
	
	public Bicicleta(int rodado, String marca) {
		this.rodado = rodado;
		this.marca = marca;
	}

	public boolean isAndando() {
		return andando;
	}
	
	public int getRodado() {
		return rodado;
	}



	public String getMarca() {
		return marca;
	}



	public void setAndando(boolean andando) {
		this.andando = andando;
	}
	
	public void montar(Ciclista ciclista) {
		this.ciclista = ciclista;
	}
	
	public void desmontar(){
		this.ciclista = null;
	}
	
	public boolean isEnUso() {
		return this.ciclista != null;
	}
	
	public Ciclista getCiclista() {
		return ciclista;
	}
}

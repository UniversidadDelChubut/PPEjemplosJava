package edu.udc.pp.agregacioncomposicion;

public class LoteCarga {
	
	public enum TipoCarga {
		SECA,
		REFRIGERADA,
		CONGELADA
	};
	
	private TipoCarga tipoCarga;
	private double tara; //En toneladas
	
	public double getTara() {
		return tara;
	}
	
	public TipoCarga getTipoCarga() {
		return tipoCarga;
	}
	
}

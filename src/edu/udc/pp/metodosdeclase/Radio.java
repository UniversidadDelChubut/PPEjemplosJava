package edu.udc.pp.metodosdeclase;

public class Radio {
	
	private int volumen;
	private boolean encendido;
	private int numeroSerie;
	
	private static int proximoNumeroSerie = 1;
	
	//Metodo de clase porque tiene modificador static
	public static int getCantidadRadiosFabricadas(){
		return Radio.proximoNumeroSerie - 1;
	}
	
	
	public void resetearRadio(Radio radio){
		new Radio();
		radio.encendido = false;
		radio.volumen = 5;
	}

	/*
	public static void hacerAlgo(){
		this.numeroSerie++;
	}
	*/
	
	public Radio() {
		this.numeroSerie = Radio.proximoNumeroSerie++;
		
	}
	 
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public void encender(){
		this.encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public int getNumeroSerie() {
		return numeroSerie;
	}
}



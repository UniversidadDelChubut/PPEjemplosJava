package edu.udc.pp.metodosdeclase;

public class Radio {
	
	public static final int VOLUMEN_MINIMO =  0;
	public static final int VOLUMEN_MAXIMO = 10;
	public static final int VOLUMEN_PREDEFINIDO = 5;
	
	
	private int volumen;
	private boolean encendido;
	private int numeroSerie;
	
	private static int proximoNumeroSerie = 1;
	
	//Metodo de clase porque tiene modificador static
	public static int getCantidadRadiosFabricadas(){
		return Radio.proximoNumeroSerie - 1;
	}
	
	
	public static void resetearRadio(Radio radio){
		radio.encendido = false;
		radio.volumen = Radio.VOLUMEN_PREDEFINIDO;
	}

	/*
	public static void hacerAlgo(){
		this.numeroSerie++;
	}
	*/
	
	public Radio() {
		this.numeroSerie = Radio.proximoNumeroSerie++;
		this.encendido = false;
		this.volumen = Radio.VOLUMEN_PREDEFINIDO;
	}
	 
	public void setVolumen(int volumen) {
		if (volumen >= Radio.VOLUMEN_MINIMO && volumen <= Radio.VOLUMEN_MAXIMO)
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



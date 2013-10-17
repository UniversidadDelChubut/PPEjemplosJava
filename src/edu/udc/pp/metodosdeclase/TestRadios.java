package edu.udc.pp.metodosdeclase;

public class TestRadios {

	public static void main(String[] args) {
		Radio radio1= new Radio();
		Radio radio2= new Radio();
		
		
		System.out.println(radio1.getNumeroSerie());
		System.out.println(radio2.getNumeroSerie());
		
		
		
		System.out.println("Se fabricaron " + Radio.getCantidadRadiosFabricadas() + " radios");
		
		
	}
}

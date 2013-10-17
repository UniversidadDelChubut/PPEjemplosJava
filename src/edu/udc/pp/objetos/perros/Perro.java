package edu.udc.pp.objetos.perros;

public class Perro {
	
	private String nombre;
	private int edad;		// Edad actual en meses
	private float velocidad;
	private float velocidadMaxima = 51;
	private int energia;
	private boolean cansado;
	
	
	public Perro() {
		
	}
	
	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public Perro(String nombre){
		this.nombre = nombre;
		this.edad = 0;
	}
	
	//BALANCEADO
	public void comer(float cantidad) {
		this.procesarAlimento(cantidad, 0.8f);
	}
	
	public void comer(float cantidad, String alimento) {
		if (alimento.equals("carne")){
			this.procesarAlimento(cantidad, 1);			
		} else if (alimento.equals("balanceado")) {
			this.comer(cantidad);
		} else if (alimento.equals("polenta")) {
			this.procesarAlimento(cantidad, 0.4f);
		}
	}
	
	private void procesarAlimento(float cantidad, float valorEnergetico){
		int energiaASumar = (int)( (cantidad *  valorEnergetico) * 100);
		if (energiaASumar + this.energia > 100 ){
			this.energia = 100;
		} else {
			this.energia = this.energia + energiaASumar;
		}
		
	}
	
	
	
	
	public void picar(){
		if (this.energia > 50) {
			this.velocidad = this.velocidadMaxima;
		} else {
			this.velocidad = this.velocidadMaxima * 0.8f;
		}
	} 

	public void setVelocidadMaxima(float velocidadMaxima) {
		if(velocidadMaxima > 80)
			return;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public float getVelocidad(){
		return this.velocidad;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getEnergia() {
		return energia;
	}

	public boolean isCansado() {
		return cansado;
	}
	
}

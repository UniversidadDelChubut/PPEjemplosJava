package edu.udc.pp.objetos.ejemplopunto;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto() {
	}
	
	public Punto(double x, double y) {
		System.out.println("Entre por double double");
		this.x = x;
		this.y = y;
	}
	
	public Punto(int x, int y) {
		System.out.println("Entre por int int");
		this.x = x;
		this.y = y;
	}
	
	public Punto(Punto punto){
		this.x = punto.getX();
		this.y = punto.getY();
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y ;
	}
	
	@Override
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		Punto otroPunto = (Punto) obj;
		return this.x == otroPunto.getX() && this.y == otroPunto.getY();  
	}
	
	
	public double distancia(double x2, double y2){
		return Math.sqrt(  (x2 - this.x) * (x2 - this.x) +  (y2 - this.y) * (y2 - this.y) )  ;
	}
	
	public double distancia(Punto p2){
		
		return this.distancia(p2.getX(), p2.getY());
	}
	
}

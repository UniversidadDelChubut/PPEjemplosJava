
package edu.udc.pp.objetos.ejemplopunto;

public class Principal {

	public static void main(String[] args) {
		
		int a = 89;
		int b = a;
		
		Punto p = new Punto();
		
		Punto p2 = new Punto(2.3, 8);
		Punto p3 = new Punto(p2);
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("a y b �son iguales?" + (a==b));
		System.out.println("p2 y p3 �son iguales?" + (p3==p2));
		System.out.println("p2 y p3 �son iguales?" + p3.equals(p2));
		System.out.println("p y p2 �son iguales?" + p.equals(p2));
		System.out.println("p3 y p3 �son iguales?" + p3.equals(p3));
		System.out.println("p3 y p3 �son el mismo objeto?" + (p3 == p3));
		System.out.println("La distancia de p3 al p2 " + p3.distancia(p2) );
		
		
		
	}
}

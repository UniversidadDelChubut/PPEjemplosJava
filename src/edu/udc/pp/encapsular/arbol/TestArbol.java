package edu.udc.pp.encapsular.arbol;

public class TestArbol {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		
		Persona p = null;
		
		
		p = new Persona(25230298, "DELLA TORRE");
		arbol.agregar(p.getNumeroDocumento(), p);
		p = new Persona(22578455, "GOMEZ");
		arbol.agregar(p.getNumeroDocumento(), p);
		p = new Persona(25478125, "RAMIREZ");
		arbol.agregar(p.getNumeroDocumento(), p);
		p = new Persona(32156785, "ARANDA");
		arbol.agregar(p.getNumeroDocumento(), p);
		p = new Persona(32587458, "ASTIER");
		arbol.agregar(p.getNumeroDocumento(), p);
		p = new Persona(35785421, "MANSILLA");
		arbol.agregar(p.getNumeroDocumento(), p);
		
		System.out.println();		
		
	}
}

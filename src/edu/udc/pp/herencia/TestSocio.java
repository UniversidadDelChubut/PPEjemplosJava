package edu.udc.pp.herencia;

public class TestSocio {

	public static void main(String[] args) {
		
		
		Socio s = new Socio();
		s.setNombre("José");
		s.setNumeroSocio(104);
		
		Persona p = new Persona();
		p.setNombre("Julio");
		
		p.saludar();
		s.saludar();
		
		
		
		
	}
}

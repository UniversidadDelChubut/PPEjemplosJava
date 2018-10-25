package interfaces;

public class Persona {
	private int dni;
	private String nombre;
	
	public Persona(int dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public int getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getDni() + " " + this.getNombre();
	}
}

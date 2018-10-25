package interfaces;

public class Docente extends Persona implements Asalariado{
	
	private int anigüedad;
	
	public Docente(int dni, String nombre, int anigüedad) {
		super(dni, nombre);
		this.anigüedad = anigüedad;
	}

	public int getAnigüedad() {
		return anigüedad;
	}

	@Override
	public double getSalario() {
		return SALARIO_MINIMO * this.anigüedad;
	}
}

package interfaces;

public interface Asalariado {
	
	public static final double SALARIO_MINIMO = 10000;
	
	public default double getSalario() {
		return SALARIO_MINIMO;
	}
	
}

package edu.udc.pp.igualdad;

public class Direccion {
	
	private String calle;
	private int numero;
	private String codigoPostal;
	private String informacionAdcional;
	
			

	public Direccion(String calle, int numero, String codigoPostal, String informacionAdcional) {
		this(calle, numero, codigoPostal);
		this.informacionAdcional = informacionAdcional;
	}

	public Direccion(String calle, int numero, String codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public String getInformacionAdcional() {
		return informacionAdcional;
	}
	
	public void setInformacionAdcional(String informacionAdcional) {
		this.informacionAdcional = informacionAdcional;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calle == null) ? 0 : calle.hashCode());
		result = prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.calle == null || this.codigoPostal==null)
			return false;
		Direccion other = (Direccion) obj;
		if (!calle.equals(other.calle))
			return false;
		if (numero != other.numero)
			return false;
		if (!codigoPostal.equals(other.codigoPostal))
			return false;
		return true;
	}
	
}

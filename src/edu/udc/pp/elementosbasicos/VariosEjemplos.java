package edu.udc.pp.elementosbasicos;

public class VariosEjemplos {

	

	   
	   
    public static int numeroAstral (String nombre) {
       
        int suma = 0;
        for (int i = 0; i < nombre.length(); i++) {
            int orden = nombre.charAt(i) - 'a';
            suma += orden;
        }
               
        while (suma > 10) {
            int valor = suma;
            int resto = 0;
            while (valor > 0) {
                resto += valor % 10;
                valor = valor / 10;
            }
            suma = resto;
        }

        return suma;
    }
    
    public static String claveAlAzar(int longitud, boolean conMayusculas, boolean conNumeros) {
    	return "bhsghga";
    }
   
   
    public static void main(String[] args) {
        System.out.println( numeroAstral("silvia"));
    }
	
}

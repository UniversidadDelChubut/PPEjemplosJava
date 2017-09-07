package edu.udc.pp.elementosbasicos;

import java.util.Random;

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
    	
    	String clave ="";
    	Random random = new Random();
    	
    	for (int i = 0; i < longitud ; i++) {
    		
			char c = '\0';    		
    		
			//Tipo
			int opcion = random.nextInt(3);
			
			if (!conNumeros && opcion == 2){
				opcion = random.nextInt(2);
			} 
			
			if (!conMayusculas && opcion == 1){
				opcion = 0;
			} 
			
			
			
			
    		switch (opcion) {
			case 0:
				c = (char)('a' + random.nextInt(26));
				break;
			case 1:
				c = (char)('A' + random.nextInt(26));
				break;
			case 2:
				c = (char)('0' + random.nextInt(10));
				break;

			}
 
			clave = clave + c;
		}
    	
    	
    	return clave;
    }
   
   
    public static void main(String[] args) {
        System.out.println( numeroAstral("silvia"));
        System.out.println( claveAlAzar(8, true, false));
    }
	
}

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
    
    /*
    private static int determinanteMatriz3x3(int [][] matriz) {
    	int valor = 0;
    	
    	for (int i = 0; i< matriz.length; i++) {
    		int diagonal1 = 1;
    		int diagonal2 = 1;
    		for (int j = 0, k = matriz.length -1; j < matriz.length; j++, k--) {
    			diagonal1 *= matriz[(i+j) % matriz.length][j];
    			diagonal2 *= matriz[(i+j) % matriz.length][k];
    		}
    		valor += diagonal1;
    		valor -= diagonal2;
    	}
    	
    	return valor;
    }
    */
    
    public static int determinanteMatriz(int [][] matriz) {
	//El caso trivial debería ser la matriz 1 x 1 
    	if (matriz.length == 2) {
    		return determinanteMatriz2x2(matriz);
    	}
    	
    	int retval = 0;
    	
    	for (int i= 0; i < matriz.length; i++) {
    		retval += (i %2 != 0 ? -1 : 1) * matriz[0][i] * determinanteMatriz(excluir(matriz, 0 ,i));
    	}
    	
    	return retval;
    	
    }
    
    private static int determinanteMatriz2x2(int [][] matriz) {
    	return matriz[0][0]*matriz[1][1]-matriz[0][1]*matriz[1][0];
    }
    
    private static int [][] excluir (int[][] matriz, int fila, int columna) {
    	int[][] retval = new int[matriz.length - 1][matriz.length - 1];
    	
    	for (int i = 0; i < matriz.length; i++) {
    		if (i != fila) {
	    		for (int j = 0; j < matriz.length; j++) {
	    			if (j != columna) {
	    				retval [i - (i > fila ? 1: 0)][j - (j > columna ? 1 : 0)] = matriz[i][j];
	    			}
	    		}
    		}
    	}
    	
    	return retval;
    }
    

    public static String matrizToString(int[][] matriz) {
    	String s = "";
    	for (int[] fila: matriz) {
    		for (int valor: fila) {
    			s += valor + " ";
    		}
    		s += '\n';
    	}
    	return s;
    }
    
   
   
    public static void main(String[] args) {
        System.out.println( numeroAstral("silvia"));
        System.out.println( claveAlAzar(8, true, false));
        
        int [][] matriz = {
        		{1,4,7},
        		{0,5,2},
        		{8,9,0}
        };
        
        System.out.println(matrizToString(matriz));
        System.out.println(determinanteMatriz(matriz));
        
        
        int [][] matriz2 = {
        		{1,3,4,5},
        		{3,2,1,6},
        		{1,9,1,4},
        		{1,4,3,9}
        };
        
        System.out.println(matrizToString(matriz2));
        System.out.println(determinanteMatriz(matriz2) );
    }
	
}

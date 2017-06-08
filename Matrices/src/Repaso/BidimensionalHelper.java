package repaso;

import java.util.Random;

public class BidimensionalHelper {
	
	public int aleatorio(int min, int max) {
		
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public int[][] llenarArreglo( int numeroFilas, int numeroColumnas ){
		
		int[][] arreglo = new int[ numeroFilas ][ numeroColumnas ];

		for (int i = 0; i < numeroFilas; i++) {
			
			for (int j = 0; j < numeroColumnas; j++) {
				
				arreglo[i][j] = aleatorio(1, 20); 
				
			}
		}
		
		return arreglo;
	}
	
	public void motrarNotasAlumno( String[] nombreAlumnos, int[][] notas, int nAlumnos, int nEvaluaiones ){
		
		for (int i = 0; i < nAlumnos; i++) {
			
			for (int j = 0; j < nEvaluaiones; j++) {
				
				System.out.println( nombreAlumnos[i] + " evaluacion # [" + j + "] : " + notas[ i ][ j ] );
				
			}
			
		}
		
	}
	
	public int buscarAlumnoPorNombre( String[] nombresAlumnos, String nombre ){
		
		int posicion = 0;
		
		for (int i = 0; i < nombresAlumnos.length; i++) {
			
			if ( nombresAlumnos[ i ].equalsIgnoreCase( nombre ) ) {
				posicion = i;
			}
		}
		
		return posicion;
		
	}

}

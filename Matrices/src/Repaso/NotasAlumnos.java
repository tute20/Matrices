package repaso;

public class NotasAlumnos {
	
	public static void main(String[] args) {
		
		int nAlumnos = 4, nEvaluaiones = 4;
		
		int[][] notas;
		
		String[] nombreAlumnos = { "Pedro", "Maria", "Juana", "Carlos" };
		
		String buscarNombre;
		
		BidimensionalHelper helper = new BidimensionalHelper();
		Vista view = new Vista();
		
		notas = helper.llenarArreglo(nAlumnos, nEvaluaiones);
		
		helper.motrarNotasAlumno(nombreAlumnos, notas, nAlumnos, nEvaluaiones);
		
		buscarNombre = view.ingresarValor();
		
		int posicionAlumno = helper.buscarAlumnoPorNombre(nombreAlumnos, buscarNombre);
		
		if( posicionAlumno == 0 && !buscarNombre.equalsIgnoreCase( nombreAlumnos[0] )  ) {
			
			view.mostrarMensaje( "Disculpe el nombre es incorrecto, no se encuentra en nuetra base de datos" );
			
		} else {
			
			view.mostrarMensaje( nombreAlumnos[ posicionAlumno ] );
			
		}
		
	}

}

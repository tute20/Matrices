package repaso;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Vista {
	
	public String ingresarValor(){
		
		JFrame frame = new JFrame("cualquiera");
		
		String ingresado = JOptionPane.showInputDialog( frame, "Buscar alumno", "");
		
		return ingresado;
	}
	
	public void mostrarMensaje( String mensaje ){
		
		JFrame frame = new JFrame("etc");
		
		JOptionPane.showMessageDialog( frame, mensaje );
	}

}
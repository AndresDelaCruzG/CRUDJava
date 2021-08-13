package Leer_Archivos;

import javax.swing.JOptionPane;

public class Ejecutable {

	public static void main(String[] args) {
		
		
		Crear_Archivos obj = new Crear_Archivos();
		Leer_Archivos obj1 = new Leer_Archivos();
		
		int opcion = 0;
		
		while (opcion != 6) {
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú \n\n1) Crear archivos \n2) Leer Archivos \n3) Borrar Archivo \n4) Escribir Archivo \n5) Meta Datos \n\n6) Salir \n\n\n De la Cruz Gonzalez Andres Ricardo" ));

			switch (opcion) {

			case 1:

				obj.crearArchivo();
				
				break;

			case 2:

				obj1.leer();
		
				break;

			case 3:
				
				obj.Borrar("Prueba.txt");
				
				break;
				
			case 4:
				
				obj.Escribir("Prueba.txt");
				
				break;
				
			case 5:
				
				obj.Meta_Datos("Prueba.txt");
				
				break;
			
			case 6:
				
				JOptionPane.showMessageDialog(null, "Hasta luego !");
				
				break;
				
			default:

				JOptionPane.showMessageDialog(null, "Error");
				
				break;
				
			} // Switch
			
		} // While
		
	}

}

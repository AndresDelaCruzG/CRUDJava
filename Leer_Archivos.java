package Leer_Archivos;

import javax.swing.JOptionPane;

public class Leer_Archivos {


	public void leer() {
		
		String arc = "";
		String rut = "C:\\Users\\52664\\Documents\\UABC\\Cuarto Semestre\\Programacion Avanzada\\Archivos\\";
		arc = JOptionPane.showInputDialog("Ingresa nombre del archivo a leer");		
		Crear_Archivos archivo = new Crear_Archivos ();
		archivo.leerArchivo(rut + arc);
		
		
	} // METODO LEER
	
	

}

package Leer_Archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Crear_Archivos {

	public void crearArchivo() {

		String archivo = "";
		String ruta = "C:\\Users\\52664\\Documents\\UABC\\Cuarto Semestre\\Programacion Avanzada\\Archivos\\";

		archivo = JOptionPane.showInputDialog("Ingresa Nombre del Archivo");

		File fichero;

		try {

			fichero = new File(ruta + archivo);

			if (fichero.createNewFile())

				System.out.println("El fichero se ha creado correctamente" + "\n\nDe la Cruz Gonzalez Andres Ricardo");

			else
				System.err.println("No ha podido ser creado el fichero");

		} catch (IOException ioe) {

			ioe.printStackTrace();

		} // Catch

	} // METODO CREAR ARCHIVO

	public void leerArchivo(String nom) {

		try {

			Scanner lee = new Scanner(new File(nom));

			while (lee.hasNextLine()) {

				String line = lee.nextLine();
				System.out.println(line);

			} // While

			lee.close();

		} catch (Exception e) {

			System.out.println(e);

		} // Catch

	} // METODO LEER ARCHIVO

	public void Borrar(String nom) {

		String ruta = "C:\\Users\\52664\\Documents\\UABC\\Cuarto Semestre\\Programacion Avanzada\\Archivos\\";

		File archivo = null;

		archivo = new File(ruta + nom);

		try {

			if (archivo.exists()) {

				archivo.delete();
				System.out.println("El archivo se ha borrado");

			} // IF

			else {

				System.out.println("Nombre de archivo invalido o el archivo no existe");

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ha sucedido un error al borrar el archivo");

		} // Catch

	} // METODO BORRAR

	public void Meta_Datos(String nom) {

		String ruta = "C:\\Users\\52664\\Documents\\UABC\\Cuarto Semestre\\Programacion Avanzada\\Archivos\\";
		File archivo = null;
		archivo = new File(ruta + nom);

		try {

			if (archivo.exists()) {

				System.out.println("Nombre del archivo: " + archivo.getName());
				System.out.println("Ruta: " + archivo.getPath());
				System.out.println("Ruta Absoluta: " + archivo.getAbsolutePath());
				System.out.println("¿Se puede Leer? " + archivo.canRead());
				System.out.println("¿Se puede Escribir? " + archivo.canWrite());
				System.out.println("Tamaño del archivo: " + archivo.length());
		
			} // IF

			else {

				System.out.println("Nombre de archivo invalido o el archivo no existe");

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ha sucedido un error al leer archivo" + e);
		}

	} // METODO METADATOS

	public void Escribir(String nom) {

		String ruta = "C:\\Users\\52664\\Documents\\UABC\\Cuarto Semestre\\Programacion Avanzada\\Archivos\\";
		Scanner sc = new Scanner(System.in);
		File f;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		try {

			f = new File(ruta + nom);

			if (f.exists()) {

				System.out.println("El archivo ya existe");
				System.out.println("Escribe el contenido para el archivo");
				String texto = sc.nextLine();

				fw = new FileWriter(f.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				bw.write("Tarea Editada el dia: 7/12/20 \n");
				bw.write(texto + "\n");

				System.out.println("Informacion agregada!");

			} // IF

			else {

				System.out.println("Escribe el contenido para tu archivo");
				String texto = sc.nextLine();
				f.createNewFile();
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				pw.write("Hola mundo se creo correctamente \n");
				pw.append(texto + "\n");

				leerArchivo(nom);

			} // ELSE

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Ha sucedido un error" + e);

		} // CATCH

		finally {

			try {

				if (bw != null);
					bw.close();
				if (fw != null);
					fw.close();
				if (pw != null);
					pw.close();
				
			} catch (IOException ex) {

				ex.printStackTrace();

			} // CATCH

		} // FINNALY

	} // METODO PARA ESCRIBIR

}

package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DeclaracionExcepciones {

public void leerArchivo () throws FileNotFoundException, IOException {
	
	File archivo = new File("D:\\johao\\OneDrive\\Escritorio\\EjerciciorealizarNo1.txt");
	FileReader fr = new FileReader(archivo);
	BufferedReader bf = new BufferedReader(fr);
	String linea;
	
	while ((linea= bf.readLine())!=null) {
		System.out.println(linea);
	}
	
}

public void leerArchivo2()  {
	try {
		leerArchivo();
	} catch (FileNotFoundException ex) {
		JOptionPane.showMessageDialog(null, "Valide la ruta del archivo" );
	} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Valide la ruta del archivo nuevamente");
	}
	System.out.println("Programa terminado");
}
	
public static void main (String[]args) {
	DeclaracionExcepciones pe= new DeclaracionExcepciones() ;
	pe.leerArchivo2();	
	
}

}


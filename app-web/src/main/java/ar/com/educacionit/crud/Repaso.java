package ar.com.educacionit.crud;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) throws Exception {

		Scanner teclado = new Scanner(System.in);
		int opcion;
		int continuar;
		
		do {
			do {
				Menu.mostrar();
				opcion = teclado.nextInt();
				
		} while (opcion <0 || opcion > 4  );
		
		
		try {
			Ejecutable ej= CreadorDeEjecutables.getEjecutable(opcion);
			ILectora lector =new LectorPorConsola(teclado,opcion);
			
			Data data= lector.leerDatos();
			
			//1 > id,titulo
			//2 > id
			//3 > titulo
			//4> id
			Long id ;
			String titulo ;
			data =new Data();
			 
			if(opcion ==1) {
				System.out.println("Ingrese id :");
				id = teclado.nextLong();
				System.out.println("Ingrese titulo :");
				titulo= teclado.next();
				data.setId(id);
				data.setTitulo(titulo);
			}else if (opcion ==2) {
				System.out.println("Ingrese id :");
				id = teclado.nextLong();
				data.setId(id);
			}else if (opcion==3) {
				System.out.println("Ingrese titulo :");
				titulo= teclado.next();
				data.setTitulo(titulo);
			}else {
				System.out.println("Ingrese id :");
				id = teclado.nextLong();
				data.setId(id);
			}
			
			ej.ejecutar(data); //ejecuto la acción sin saber cual es, pero como se que implementa la 
			//interface Ejecutable entonces tengo disponible el metodo ejecutar	
			
			//opcion para ejecutar individualmente un metodo particular de la clase alta
			/*if (ej instanceof Alta) {
			//solo si es alta tiene el metodo crear()
				Alta alta=(Alta)ej;
				alta.crear();
			}*/
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		finally {
		}
		Menu.mostrarContinuar();
		continuar=teclado.nextInt();
		} while(continuar==1);
		
		teclado.close();	
		System.out.println("Fin");
	}

}

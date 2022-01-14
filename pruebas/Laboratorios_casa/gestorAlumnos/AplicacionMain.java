package gestorAlumnos;

import java.util.Scanner;

public class AplicacionMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el número de la opción deseada  "
				+ "( 1.Realizar operaciones de CRUD"
				+ ", 2.Realizar operaciones del menú :)"  );
		int opcion=teclado.nextInt();
		
		DatosDBMemoria db= new DatosDBMemoria();
		Icrud icrud = new Icrud();
		
		//if(opcion >=1 && opcion <=4) {
		
		if (opcion == 1 ) {
			System.out.println("Indique que operación quiere realizar 1.Crear , 2.Leer , 3. Actualizar, 4.Eliminar");
			int opcionCrud=teclado.nextInt();
			
			if (opcionCrud==1) {
				icrud.create(teclado);	
			}if (opcionCrud==2) {
				icrud.read();
			}if (opcionCrud==3) {
				icrud.update();
			}if (opcionCrud==4) {
				icrud.delete();
			}if (opcionCrud <1 && opcionCrud >4) {
				System.out.println("Opcion invalida");
			}		
		}
		}
}

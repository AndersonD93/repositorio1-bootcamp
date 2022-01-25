package gestorAlumnos;

import java.util.Scanner;

public class AplicacionMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el número de la opción deseada  "
				+ "( 1.Realizar operaciones de CRUD"
				+ ", 2.Realizar operaciones del menú) :"  );
		int opcion=teclado.nextInt();
		
		DatosDBMemoria db= new DatosDBMemoria();
		IcrudAlum icrudalum = new IcrudAlum();
		IcrudMaterias icrudmaterias=new IcrudMaterias();
		Menu menu=new Menu();
		
		if (opcion == 1 ) {
		System.out.println("Indique 1. Para realizar operaciones con alumnos , 2. Para realizar operaciones con materias :");
		int opcionAlumMat =teclado.nextInt();
		
		if(opcionAlumMat==1) {
			System.out.println("Indique que operación quiere realizar 1.Crear , 2.Leer , 3. Actualizar, 4.Eliminar");
		int opcionCrudAlum=teclado.nextInt();
		
			if(opcionCrudAlum==1) {icrudalum.create();}
			if (opcionCrudAlum==2) {icrudalum.read();}	
			if (opcionCrudAlum==3) {icrudalum.update();}
			if (opcionCrudAlum==4) {icrudalum.delete();}	
			if (opcionCrudAlum <1 && opcionCrudAlum >4) {
				System.out.println("Opcion invalida");
			}		
	
			
		}if (opcionAlumMat==2) {
			System.out.println("Indique que operación quiere realizar 1.Crear , 2.Leer , 3. Actualizar, 4.Eliminar");
			int opcionCrudMat=teclado.nextInt();
			
			if(opcionCrudMat==1) {icrudmaterias.create();}
			if (opcionCrudMat==2) {icrudmaterias.read();}	
			if (opcionCrudMat==3) {icrudmaterias.update();}
			if (opcionCrudMat==4) {icrudmaterias.delete();}	
			if (opcionCrudMat <1 && opcionCrudMat >4) {
				System.out.println("Opcion invalida");}
		};
		
		}if(opcion == 2 ) {
			System.out.println("Ingrese la opción de menú 1.Inscribir, 2. Eliminar ,3. Buscar Inscripción : ");
			int opcionMenu=teclado.nextInt();
			if(opcionMenu==1) {menu.inscribir();}
			if(opcionMenu==2) {menu.eliminarIscripcion();}
			if(opcionMenu==3) {menu.buscarIscripcion();}
			if (opcionMenu <1 && opcionMenu >3) {
				System.out.println("Opcion invalida");}
		}teclado.close();
		}
		}



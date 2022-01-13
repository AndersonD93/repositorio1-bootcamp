package gestorAlumnos;

import java.util.Scanner;

public class Icrud {
	
	static Scanner teclado = new Scanner(System.in);
	
	public void create() {	
		System.out.println("ingrese la cantidad de estudiantes a inscribir :");
		int cantidadAInscribir=teclado.nextInt();
		
		Alumnos inscripcionAlumnos[] = new Alumnos[cantidadAInscribir];
		
		for(int i=0; i<inscripcionAlumnos.length ; i++) {
			System.out.println("Digite la inscripción del alumno No. "+(i+1) );
			System.out.print("Digite la identificación del alumno: ");
			int id=teclado.nextInt();
			System.out.print("Digite el nombre del alumno: ");
			String nombre=teclado.next();
			System.out.print("Digite el apellido del alumno : ");
			String apellido=teclado.next();
			System.out.print("Digite el numero de la matricula : ");
			int matricula =teclado.nextInt();
			
			Alumnos vector=new Alumnos(id, matricula, nombre, apellido);
			inscripcionAlumnos[i]=vector;
			
			System.out.println("--------------------------------------");
			System.out.println("Alumno agregado "+ vector);
			
		}
		
	};
	
	public void delete() {
		
	};
	
	public void read() {
		
	};
	
	public void update() {
		
	};
	
}

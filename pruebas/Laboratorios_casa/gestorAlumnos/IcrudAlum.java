package gestorAlumnos;


import java.util.ArrayList;
import java.util.Scanner;

public class IcrudAlum implements IcrudGeneric<Alumnos> {
	
	static Scanner teclado = new Scanner(System.in);
	int cantidadAInscribir;
	static ArrayList<Alumnos> arrayAlum;
	static String nombreAlum;
	Menu menu= new Menu();
	String nombreAlum1;
	String apellidoAlum1;
	Integer alumno= menu.getIdAValidar();
	
	public ArrayList<Alumnos> create() {	
		try {System.out.println("ingrese la cantidad de estudiantes a registar en la BD:");
		cantidadAInscribir=teclado.nextInt();
			
		}catch(Exception e) {
			System.out.println("Error, el valor digitado debe ser entero numerico..");
		}
		
		Alumnos vector= null;
		int id=0;
		int matricula=0;
		String nombre="";
		String apellido="";
		
		
		arrayAlum=new ArrayList<Alumnos>();
		
		
		for(int i=0; i<cantidadAInscribir; i++) {
			try {
			System.out.println("Alumno No. "+(i+1) );
			System.out.print("Digite la identificación del alumno: ");
			id=teclado.nextInt();
			System.out.print("Digite el nombre del alumno: ");
			nombre=teclado.next();
			System.out.print("Digite el apellido del alumno : ");
			apellido=teclado.next();
			System.out.print("Digite el numero de la matricula : ");
			matricula =teclado.nextInt();
			
			vector=new Alumnos(id, matricula, nombre, apellido);
			arrayAlum.add(vector);
				
			}catch(Exception e) {
				System.out.println("\nError, Valide el tipo de dato ingresado \n Id:Numerico Entero \n Nombre:Texto \n Apellido:Texto \n No.Matricula:Numerico Entero ");
			}
			
			
			//System.out.println("--------------------------------------");
			//System.out.println("Alumno agregado "+ vector);
		}
		System.out.println("--------------------------------------"); 
		//System.out.println("Los vectores agregados son: \n"+arrayAlum);
		
		for(Alumnos arrayalum :arrayAlum) {
			System.out.println("ID: "+ arrayalum.getId()+" "+"Nombre: "+ arrayalum.getNombre());
			nombreAlum=arrayalum.getNombre();
			
		} return arrayAlum;
		
		
		
	};
	
	public void delete() {
		if(menu.existeAlumno(alumno)==true) {
			nombreAlum1= menu.getNombreAlum();
			apellidoAlum1=menu.getApellidoAlum();
			System.out.println("Alumno "+nombreAlum1+" "+apellidoAlum1+" encontrado en los registros...");
			System.out.println("Alumno "+nombreAlum1+" "+apellidoAlum1 +" Eliminado de la BD");
		}else {
			System.out.println("No existe alumno");
		}
	
	};
	
	public void read() {
		if(menu.existeAlumno(alumno)==true) {
			nombreAlum1= menu.getNombreAlum();
			apellidoAlum1=menu.getApellidoAlum();
			System.out.println("Los datos encontrados en la BD son");
			System.out.println(arrayAlum);
		}else {
			System.out.println("No existe alumno");
		}
	
	};	
	
	public void update() {
		if(menu.existeAlumno(alumno)==true) {
			nombreAlum1= menu.getNombreAlum();
			apellidoAlum1=menu.getApellidoAlum();
			System.out.println("Asigne nuevo nombre :");
			String nuevoNombre=teclado.next();
			menu.setNombreAlum(nuevoNombre);
			System.out.println("Nuevo nombre actualizado a : "+menu.getNombreAlum());
		}else {
			System.out.println("No existe alumno");
		}
		
	}






	
}

package gestorAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	 public static ArrayList<Alumnos> arrayAlum1;
	 public static ArrayList<Materias> arraymateria1;
	 public static IcrudAlum createalum= new IcrudAlum();
	 public static IcrudMaterias createmateria=new IcrudMaterias();
	 Scanner teclado1 = new Scanner(System.in);
	private int idAValidar;
	private int idMatAValidar;
	public String nombreAlum;
	public String apellidoAlum;
	public String nombreMat;
	

	

	public boolean existeAlumno(int id) {
		
		try {System.out.println("Ingrese el id del alumno a (Inscribir , Eliminar o Buscar en BD): ");
		idAValidar = teclado1.nextInt();
			
		} catch(Exception e) {
			System.out.println("Error, el valor a ingresar debe ser de tipo numerico..");
		}
		
		//obtengo el retorno del arraylist de la clase IcrudAlum
		arrayAlum1=createalum.create();
	
		boolean existe=false;
		for(int i=0;i<arrayAlum1.size();i++) {
			if(arrayAlum1.get(i).getId().equals(idAValidar)) {
				nombreAlum = arrayAlum1.get(i).getNombre();
				apellidoAlum = arrayAlum1.get(i).getApellido();
				existe=true;
				break;
			}	
		}
		return existe;
	};
	
		public boolean existeMateria(int idMateria) {
		
		System.out.println("Ingrese el id de la materia : ");
		idMatAValidar = teclado1.nextInt();
		
		//obtengo el retorno del arraylist de la clase IcrudAlum
		arraymateria1=createmateria.create();
	
		boolean existe=false;
		for(int i=0;i<arraymateria1.size();i++) {
			if(arraymateria1.get(i).getIdMateria().equals(idMatAValidar)) {
				nombreMat=arraymateria1.get(i).getNombreMateria();
				existe=true;
				break;
			}	
		}
		return existe;
	};
	
	public void inscribir() {
			
		Boolean auxAlum=false;
		Boolean auxMat=false;
		
		
		if (existeAlumno(idAValidar)==true) {
		System.out.println("Alumno "+ nombreAlum +" "+apellidoAlum+" Existe");
		auxAlum=true;
		}else {
		System.out.println("Alumno no existe");
	}
		if (existeMateria(idMatAValidar)==true) {
			System.out.println("Materia "+nombreMat+ " Existe");
			auxMat=true;
			}else {
			System.out.println("Materia no existe");
		}
		 if(auxAlum==true && auxMat==true) {
			System.out.println("Alumno :"+nombreAlum+" "+apellidoAlum+" Inscrito a materia: "+nombreMat);
		}
	}
	
	public void eliminarIscripcion() {
		Boolean auxelimAlum=false;
		Boolean auxelimMat=false;
		
		if (existeAlumno(idAValidar)==true) {
		System.out.println("Alumno "+ nombreAlum +" "+apellidoAlum+" Existe");
		auxelimAlum=true;
		}else {
		System.out.println("Alumno no existe");
	}
		if (existeMateria(idMatAValidar)==true) {
			System.out.println("Materia "+nombreMat +" Existe");
			auxelimMat=true;
			}else {
			System.out.println("Materia no existe");
			}
		if(auxelimAlum==true && auxelimMat==true) {
			System.out.println("Alumno :"+nombreAlum+" "+apellidoAlum+" Eliminado de la inscripción a materia: "+nombreMat);
		}

	}
	
	public void buscarIscripcion() {
		Boolean auxBusAlum=false;
		Boolean auxBusMat=false;
		
		if (existeAlumno(idAValidar)==true) {
		System.out.println("Alumno "+ nombreAlum +" "+apellidoAlum+" Existe");
		auxBusAlum=true;
		}else {
		System.out.println("Alumno no existe");
	}
		if (existeMateria(idMatAValidar)==true) {
			System.out.println("Materia "+nombreMat +" Existe");
			auxBusMat=true;
			}else {
			System.out.println("Materia no existe");
			}
		if(auxBusAlum==true && auxBusMat==true) {
			System.out.println("Buscando los datos del alumno :"+nombreAlum+ " "+apellidoAlum+" y de materia: "+nombreMat);
			System.out.println("Los datos procesados y encontrados en la BD son:");
			System.out.println(arrayAlum1+" "+"\n"+arraymateria1);
		}

	}
	
	public int getIdAValidar() {
		return idAValidar;
	}
	public int getIdMatAValidar() {
		return idMatAValidar;
	}

	public String getNombreAlum() {
		return nombreAlum;
	}

	public String getNombreMat() {
		return nombreMat;
		
	}public String getApellidoAlum() {
		return apellidoAlum;
	}
	public void setNombreAlum(String nombreAlum) {
		 this.nombreAlum = nombreAlum;
	}
	public void setNombreMat(String nombreMat) {
		this.nombreMat = nombreMat;
	}
		
	};




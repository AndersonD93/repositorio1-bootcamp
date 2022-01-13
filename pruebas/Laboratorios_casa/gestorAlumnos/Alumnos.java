package gestorAlumnos;

public class Alumnos {
	protected static int matricula;
	protected static String nombre;
	protected static String apellido;
	protected static int id;
	
	
	public Alumnos(int id, int matricula, String nombre, String apellido) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Alumnos.id = id;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Alumnos [id="+id+", matricula=" + matricula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	

}

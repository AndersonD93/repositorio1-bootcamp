package herenciaoop;

public class Estudiante extends Persona{ 
	private int codigoEst;
	private int notaEst;
	
	
	public Estudiante(String nombre, String apellido, int edad,int codigoEst,int notaEst) {
		super(nombre, apellido, edad);
		this.codigoEst = codigoEst;
		this.notaEst = notaEst;
	}
	
	public void MostrarDatos() {
		System.out.println("Los Datos del estudiante son: "+ nombre +" apellido "+apellido+" edad "+ edad +" codigo de estudiante " +this.codigoEst+ "NotaEst"+this.notaEst);
	}
	
	

}

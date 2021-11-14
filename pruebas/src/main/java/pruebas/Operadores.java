package pruebas;

public class Operadores {

	public static void main(String[] args) {
		//ctrl+d eliminar una linea
		
		//matematicos
		
		int edad1 =10;
		int edad2 =20;
		int res=edad1+edad2;
		
		//syso+ctrl+space
		System.out.println("edad1+edad2="+ res);
		
		
		String nombre= "anderson";
		String apellido= "Duran";
		String res1= nombre+apellido;
		System.out.println("nombre+apellido="+ res1);
		
		//para los float al asignar valor a la varbiable hay que colocar una f al final
		float ancho= 125.6f;
		double largo= 745.98;
		
		float resultdiv = (float) largo/ancho; //si quiero obtener la parte float de un double debo iniciar la operacion con (float)
		
		double profundidad= 657.98;
		
		double resultdivdouble= largo/profundidad; // obteniendo otro double no es necesario.
		
		//rango de represntación de un byte desde -128 hasta 127
		
		byte valor1= 127;
		
		//division
		
		double dinv0= ancho /9;
		System.out.println("div0 ="+dinv0) ;
		
		//relacionales > <= >= ¡=

		
		boolean reslargoancho=ancho>largo;
		System.out.println(reslargoancho);
		
		// logicos
		
		//%% (y)
		// || (or)
		// ! NOT
		// ^ exclusivo XOR UNO O EL OTRO ES TRUE ( MAS NO LOS DOS)
		
		boolean esmartes= true;
		boolean horario10=false;
		boolean curso= esmartes || horario10;
		System.out.println("el valor de verdad de es martes es:"+curso);
		
		int edadadulto=18;
		boolean tienecarnet=true;
		String nombre1 = "jose";
		float alturan = 0.75f;
		char Pletra ='M';
		//puede conducir si es mayor o igual y tiene carnet
		
		boolean puedeconducir= edadadulto >= 18 && tienecarnet && (nombre1 == "jose") || (alturan>1) != (Pletra=='G') ;
		System.out.println("puede conducir ="+ puedeconducir);
		
				
		
		
		
		
	}

}

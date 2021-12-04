package clase6y7_repjohao;

public class Ejemplo_procedimiento {

	public static void main(String[] args) {

		//invocar el procedimiento
		
		saludar("que hay de nuevo?");
		responder ("bien gracias");
		
		//calcular la suma de 2 variables
		int a =10;
		int b= 20;
		//asignar el valor de retorno de la funcion a una variable tipo int
		int c= sumar (a,b);
		
	}
		static int sumar (int a, int b) {
			int res = a + b;
			return res;
			
		}
	
		private static void responder(String saludo) {
		System.out.println(saludo);
		
	}
		//procedimiento
		
	 static void saludar(String saludo) {
		System.out.println("Hola" + saludo );
	}
	

}

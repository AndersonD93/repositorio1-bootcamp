package laboratorios_casa;

public class MiembrosEstaticos {
	
	//atributo estatico
	public static  String nombre="Anderson";
	
	// metodo estatico
	public static int sumar (int n1, int n2) {
		int sumar = n1+n2;
		return sumar;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("El nombre del parroquiano es :"+ MiembrosEstaticos.nombre);
		
		
		// para traer el metodo sumar de la clase miembros estatatico, puedo hacerlo instancial o al ser un metodo estatico puedo traerlo directamente de clase.metodo();
		MiembrosEstaticos me= new MiembrosEstaticos();
		System.out.println();
		
		me.nombre="Jenny";
			
		System.out.println("El nombre del parroquiano es :"+ me.nombre);
		System.out.println("La suma de los numeros es: "+MiembrosEstaticos.sumar(5, 7));
		
		
		
	}
	public static void main1(String[] args) {
		
	}

}	

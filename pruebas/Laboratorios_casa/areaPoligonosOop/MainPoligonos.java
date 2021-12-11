package areaPoligonosOop;

import java.util.ArrayList;
import java.util.Scanner;


public class MainPoligonos {
	
	//Crear un array dinamico
	
	static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();  
	static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
			
		llenarPoligono ();
		mostrarResultados();
	}
		
		// Pedir datos para tipo de poligono
		
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		
		do{	
		
			do{ System.out.println("Digite que tipo de poligono desea ingresar :");
				System.out.println("Opcion 1: Triangulo");
				System.out.println("Opcion 2: Rectangulo");
				System.out.println("Opcion :");
				opcion=teclado.nextInt();
				
			}while(opcion<1 || opcion>2);
			
			switch (opcion) {
			case 1 :llenarTriangulo();//llenar un triangulo
					break;
			case 2 :llenarRectangulo(); // llenar un rectangulo
					break;
				
			}	
			System.out.println("Desea ingresar otro Poligono (s/n):");
			respuesta=teclado.next().charAt(0);
			
		}while(respuesta=='s'|| respuesta=='S');
		

	}
	public static void llenarTriangulo() {
		double lado1,lado2,lado3;
		
		System.out.println("Digite los cms el lado 1: ");
		lado1=teclado.nextDouble();
		System.out.println("Digite los cms el lado 2: ");
		lado2=teclado.nextDouble();
		System.out.println("Digite los cms el lado 3: ");
		lado3=teclado.nextDouble();
		
		Triangulos triangulo= new Triangulos(lado1,lado2,lado3);
		
		//guardamos un triangulo dentro de nuestro arreglo dinamico
		
		poligono.add(triangulo);
		
		
		
	}
	public static void llenarRectangulo() {
		double lado1,lado2;
		
		System.out.println("Digite los cms el lado 1: ");
		lado1=teclado.nextDouble();
		System.out.println("Digite los cms el lado 2: ");
		lado2=teclado.nextDouble();

		Rectangulo rectangulo= new Rectangulo(lado1,lado2);
		
		//guardamos un rectangulo dentro de nuestro arreglo dinamico
		
		poligono.add(rectangulo);
	}

	public static void mostrarResultados() {
		//Recorriendo el area del poligono
		for(Poligonos poli :poligono) {
		System.out.println("Los datos del poligono son :"+ poli.toString());
		System.out.println("El area del poligono es: "+ poli.areaPoligonos());
		System.out.println("");
	}
		
	}


}




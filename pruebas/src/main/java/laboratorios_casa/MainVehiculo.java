package laboratorios_casa;

import java.util.Scanner;

public class MainVehiculo {
	
	public static int indiceCocheMbarato(Vehiculo coches[]) {
		int precio;
		int indice=0;
		
		precio=coches[0].getPrecio();
		
		for (int i=1;i<coches.length;i++) {
			if(coches[i].getPrecio()<precio) {
			precio=coches[i].getPrecio();
			indice=i;
			}
		}
		return indice;
		
	}
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String modelo,marca;
		int precio,indiceBarato;
		
		int numeroVehiculos;
		System.out.println("Digite la cantidad de vehiculos: ");
		numeroVehiculos=teclado.nextInt();
		
		Vehiculo coches[]= new Vehiculo[numeroVehiculos];
		
		for(int i=0; i<coches.length ; i++) {
			System.out.println("Digite las caracteristicas del coche "+(i+1) );
			System.out.print("Digite el nombre de la marca: ");
			marca=teclado.next();
			System.out.print("Digite el nombre del modelo: ");
			modelo=teclado.next();
			System.out.print("Digite el valor del vehiculo: ");
			precio=teclado.nextInt();
			
			coches[i]=new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato= indiceCocheMbarato(coches);
		System.out.println("El coche mas barato es:" );
		System.out.println(coches[indiceBarato].mostrarDatos());
	}

}

package PolimorfismoVehiculos;

import java.util.Scanner;

public class MainVehiculos {

	public static void main(String[] args) {
		
		int cantVehiculos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de vehiculos");
		cantVehiculos= teclado.nextInt();
		
		
		Vehiculos misVehiculos[]=new Vehiculos[cantVehiculos];
		
		misVehiculos[0]= new Vehiculos("Renault",4,"Corriente");
		misVehiculos[1]= new VehiculoDeportivo("Mazda",4,"Corriente",4);
		misVehiculos[2]= new VehiculoDeportivo("Kia",4,"Corriente",4);
		misVehiculos[3]= new VehiculoFurgoneta("Auidi",4,"Diesel","2018");
		
		for (Vehiculos vehiculo: misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());	
			
		}

	}

}

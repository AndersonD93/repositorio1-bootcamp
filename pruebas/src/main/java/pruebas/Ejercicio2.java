package pruebas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
	// ahora puedo lleer datos desde el teclado.
	// Paso a la vez f6; f8 ejecuta todo continuo a partir de la linea donde estoy parado
		
		System.out.println("Ingrese el valor de a:");
		int a = teclado.nextInt();//leer un dato entero
		
		System.out.println("Ingrese el valor de a:");
		int b = teclado.nextInt();
		
		int suma= a+b;
		System.out.println("las suma es ="+ suma);
		
		
		// cierro teclado
		teclado.close();
	}

}

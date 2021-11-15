package clase3;

import java.util.Scanner;

public class EjercicioIF2 {

	public static void main(String[] args) {
		// determinar dado 3 numero, cual es el mayor
		
		Scanner teclado = new Scanner(System.in);
		
		
		//a>b y a>c 
		//b>a y b>c
		//c>a y c>a
		// a==b y a==c
		
		System.out.println("Ingrese el 1er No :");
		double a1 = teclado.nextDouble();
		System.out.println("Ingrese el 2do No :");
		double b1 = teclado.nextDouble();
		System.out.println("Ingrese el 3er No :");
		double c1 = teclado.nextDouble();
		
		if (a1>b1 && a1>c1) {
			System.out.println("a es el mayor y su numero es ="+ a1);
		}
		if(b1>a1 && b1>c1) {
			System.out.println("b es el mayor y su numero es ="+ b1);
		}
		if(c1>a1 && c1>b1) {
			System.out.println("c es el mayor y su numero es ="+ c1);
		}
		if(a1==b1 && a1==c1) {
			System.out.println("Todos los numeros son iguales"+a1+","+b1+","+c1);
		}
		
		
		teclado.close();

	}

}

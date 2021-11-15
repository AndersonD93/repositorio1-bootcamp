package clase3;

import java.util.Scanner;

public class EjercicioIF {

	public static void main(String[] args) {
		// determinar dado 3 numero, cual es el mayor
		
		Scanner teclado = new Scanner(System.in);
		
		
		//a>b y a>c 
		//b>a y b>c
		//c>a y c>a
		// a==b y a==c
		
		System.out.println("Ingrese el 1er No :");
		double n1 = teclado.nextDouble();
		System.out.println("Ingrese el 2do No :");
		double n2 = teclado.nextDouble();
		System.out.println("Ingrese el 3er No :");
		double n3 = teclado.nextDouble();
		
		double mayor=n1;
		
		if (mayor<=n2) {
			mayor = n2;
			if (mayor <=n3) {
				mayor= n3;	
			}
		}	
			
		System.out.println(mayor);
		teclado.close();	
	}
	
		

	
	
	
}

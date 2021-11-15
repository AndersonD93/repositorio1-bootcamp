package clase3;

import java.util.Scanner;

public class EjercicioIF3jose {

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
		
		if(n1>=n2 && n1>n3) {
			System.out.println(n1);
		}
		else if (n2 >=n1&&n2>n3 ) {
			System.out.println(n2);	
		}
		else if((n3>=n1 && n3>n1)) {
			System.out.println(n3);
		}
		else if (n1==n2 && n2==n3) {
			System.out.println("iguales");
		}
		
		// n1 y n2 < n3 (n3 mayor)
		// n1 y n3 < n2 (n2 mayor)
		// n2 y n3 < n1 (n1 mayor)
		
		/*
		if (n1==n2 && n1<n3);{
			System.out.println(n3);
		}else {
			System.out.println(n2);
		}
		if (n1==n3 && n1<n2);{
			System.out.println(n2);
		}		
		if (n2==n3 && n2<n1);{
			System.out.println(n1);
		}
		*/
		teclado.close();

	
	}
	
}

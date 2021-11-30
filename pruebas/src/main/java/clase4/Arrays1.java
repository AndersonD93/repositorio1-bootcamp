package clase4;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// crear vector
		
		/*
				int [] edades =  new  int [ 2 ]; // un vector de 2 posiciones 0,1
				
				// [0,0,0]
				//   0 1 2
				// carga
				edades [ 0 ] =  5 ;
				edades [ 1 ] =  10 ;
				// edades [2] = 15; NO VA
				
				// longitud atributo

				int tamanio = edades . length; // tamaño del vector
				
				// acceder al último elemento
				int edad = edades [tamanio - 1 ];
				
				System.out.println(edad);
				
				// edades [0];
				
				// edades [2]; // bien ??
			}
*/
		int[]Losvalores=new int[10];
		
		Scanner teclado= new Scanner (System.in);
			
		int i=0;
		
		while(i<=9) {
			System.out.println("Ingrese los valores que componen la cadena");
			int Vingresado= teclado.nextInt();
			Losvalores[i]=Vingresado;
			i++;				
		}System.out.println(Losvalores);
		

		}
		
		
	
}
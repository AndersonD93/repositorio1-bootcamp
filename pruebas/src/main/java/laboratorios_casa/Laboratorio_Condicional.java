package laboratorios_casa;

import java.util.Scanner;

public class Laboratorio_Condicional {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		// Ejemplo video
		
	/*	
		int n=20;
		
		if(n<15) {
			n+=2;
			n *=5;					
		}else {
			n-=3;
			n*=2;
		}
		System.out.println("El valor de n es:"+ n);
		
// teniendo dos numeros positivos y uno negativo, informar el valor de la multiplicaci�n de los positivos.
		
	int a=10,b=9,c=-5,valor=1;
		
	if(a>0) {
		valor=a;							
	}if (b>0) {
		valor*=b;	
	}if (c>0) {
		valor*=c;
	}
	System.out.println("El acumunlado de la multiplicaci�n de los valores positivos es: "+valor);	
	
	*/
		
	// El usuario debe ingresar dos valores y seleccionar que tipo de operaci�n quiere realizar
	
		/*
		System.out.println("Ingrese el valor No 1: ");
		int v1=teclado.nextInt();
		System.out.println("Ingrese el valor No 2: ");
		int v2=teclado.nextInt();
		System.out.println("Que operaci�n desea realizar (1-suma,2-resta,3-producto,4-divisi�n): ");
		int tipo_operacion=teclado.nextInt();
		
		int resul=0;
		
		if (tipo_operacion!=1 && tipo_operacion!=2 &&tipo_operacion!=3&&tipo_operacion!=4);{
			 System.out.println("Error");
		}if(tipo_operacion==1) {
			resul= v1+v2;
		}if(tipo_operacion==2) {
			resul= v1-v2;
		}if(tipo_operacion==3) {
			resul= v1*v2;
		}if(tipo_operacion==4) {
			resul= v1/v2;
		}System.out.println(resul);
		
		
		// Mismo ejercicio anterior ejecutado por Switch 
		
		switch (tipo_operacion) {
		case 1:
			System.out.println("El resultado es +=" +(v1+v2));
		break;
		case 2:
			System.out.println("El resultado es -=" +(v1-v2));
		break;
		case 3:
			System.out.println("El resultado es *=" +(v1*v2));
		break;
		case 4:
			System.out.println("El resultado es /=" +(v1/v2));
		break;
		
		default:System.out.println("Selecciono un valor invalido"); 
		}*/
		
		/* Cree un programa en Java que simule la petici�n de una opci�n seg�n el siguiente men� y muestre en pantalla que ha
		ingresado a la opci�n seleccionada:
			Gracias por contactarte con nosotros!
			�En qu� podemos ayudarte?
			A) Documentaci�n
			B) Cotizaci�n
			C) Asistencia
			D) Siniestros
			E) Informaci�n de Pagos
			F) Otras Consultas
			G) Anulaci�n
			Escribe la letra de la opci�n seleccionada
		*/
		
		char opcion;
		System.out.println("Gracias por contactarte con nosotros, En que podemos ayudarte?");
		
		System.out.println("Ingrese la opci�n deseada"
				+ "			A) Documentaci�n"
				+ "			B) Cotizaci�n"
				+ "			C) Asistencia"
				+ "			D) Siniestros"
				+ "			E) Informaci�n de Pagos"
				+ "			F) Otras Consultas"
				+ "			G) Anulaci�n ");
		opcion = teclado.next().charAt(0);;
		
		switch (opcion) {
		case 'A':
			System.out.println("Ha seleccionado la opcion :" +opcion );
		break;
		default: System.out.println("Valor errado");
		
		}
		
		
		teclado.close();

	}

}

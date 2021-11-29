package laboratorios_casa;

import java.util.Arrays;
import java.util.Scanner;

public class Practica_en_casaNo1 {

	public static void main(String[] args) {
		
	/*	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos que desea incluir en la data :");
		int cant_alumnos = teclado.nextInt();
		
		
		Object[][] data_total= new Object [cant_alumnos][];
		Object[] datos_alumno = new Object[4];
		Object[] copia_datos_alumno = new Object[4];
		
		
		// Rellenando el vector datos alumno
		int j=1; // inicialización de j para la impresión en pantalla de aspecto a ingresar
		System.out.println("El orden de los parametros es "
				+ "1. Nombre "
				+ "2.Apellido "
				+ "3.No Examen "
				+ "4.Calificacion examen");
		for (int k=0; k < data_total.length;k++) {
			for (int i=0;i<datos_alumno.length;i++) {
			System.out.println("Ingrese el parametro No."+j+" del Alumno :");
			String aux= teclado.next();
			datos_alumno[i]=aux;
			data_total[k]= datos_alumno[i];
			if(j<4) {
				j++;
			}else {
				j=1;
			}
			}//for (int p=0;p<datos_alumno.length;p++){ //For para hacer una copia de datos alumno
				//copia_datos_alumno[p]=datos_alumno[p];
			teclado.close();				
			}//data_total[k]=copia_datos_alumno;
			
			*/
		Scanner teclado = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;

        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = teclado.nextInt();
        } while (numAlum <= 0);
        
        //se  crea array solicitando el nombre de los alumnos
  /**/  String[]nomalumn=new String[numAlum];
  		for (i=0;i<nomalumn.length;i++) {
  			System.out.print("Ingrese el Nombre del Alumno No"+(i+1)+". :");
  			nomalumn[i]=teclado.next();
  		}
  		String[]apellidos=new String[numAlum];
  		for (i=0;i<apellidos.length;i++) {
  			System.out.print("Ingrese el apellido del Alumno No"+(i+1)+". :");
  			apellidos[i]=teclado.next();
  		}
  		String[]nomexamen=new String[numAlum];
  		for (i=0;i<nomexamen.length;i++) {
  			System.out.print("Ingrese el Numero de Examen del Alumno No"+(i+1)+". :");
  			nomexamen[i]=teclado.next();
  		}
        
        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numAlum]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = teclado.nextDouble();
        }

        // Sumar todas las notas
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        // Calcular la media
        media = suma / notas.length;

      /*  // Mostrar la media
        System.out.println("Nota media del curso: "+ media);
        System.out.println("----------------");
        
        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("El alumno " + (nomalumn[i])+apellidos[i] +" cuya nota final es: " + notas[i]);
            }
        */ // Mostrar el mejor estudiante.
         Double nota_alta = 0.0 ;
         String mejor_estudiante = " ";
         String apellidos_mejor =" ";
         for (i=0; i<notas.length;i++) {
        	 if(notas[i]>nota_alta) {
        		 nota_alta=notas[i];
        		 mejor_estudiante=nomalumn[i];
        		 apellidos_mejor=apellidos[i];
        	 }
        }System.out.println("El Mejor estudiante es :"+mejor_estudiante +" "+ apellidos_mejor+" cuya nota final fue " +nota_alta);
        
        // Mostrar el peor estudiante
        Double nota_baja = 10.0 ;
        String peor_estudiante = " ";
        String apellidos_peor =" ";
        for (i=0; i<notas.length;i++) {
       	 if(notas[i]<nota_baja) {
       		 nota_baja=notas[i];
       		 peor_estudiante=nomalumn[i];
       		 apellidos_peor=apellidos[i]; 
       		 
       	 }
       }System.out.println("El Peor estudiante es :"+peor_estudiante+" "+apellidos_peor +" "+ "cuya nota final fue" +nota_baja);

       // Mostrar los estudiantes que aprobaron
       
       for(i=0;i<notas.length;i++) {
    	   if(notas[i]<7) {System.out.println("El estudiante :"+ nomalumn[i]+" "+apellidos[i] + " debe recursar la materia.");
    		   
    	   }else {
    		  System.out.println("El estudiante :"+ nomalumn[i]+" "+apellidos[i] +" aprobo el curso y promociono"); 
    	   }
       }
       
        
         teclado.close();   
        }
}
		//System.out.println(Arrays.toString(data_total));	
	

		



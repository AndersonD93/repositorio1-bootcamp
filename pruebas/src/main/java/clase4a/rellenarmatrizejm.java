package clase4a;

import java.util.Scanner;

public class rellenarmatrizejm {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cantidad_filas=2;
		int cantidad_columnas=4;
			
		Object matrizjoh[][]=new Object [cantidad_filas][cantidad_columnas];
		
		for(int fi=0; fi < cantidad_filas ; fi++){
			for(int co=0 ; co <cantidad_columnas ; co++){
				if( co == 0){					
				System.out.println("Ingrese el Nombre del usuario :");
				String ingreso_usuario= teclado.next();
				matrizjoh[fi][co]=ingreso_usuario;
				
				}else if(co==1){					
				System.out.println("Ingrese el Nombre del apellido :");
				String ingreso_usuario= teclado.next();
				matrizjoh[fi][co]=ingreso_usuario;
				}
				else if(co==2){					
					System.out.println("Ingrese el Nombre del dirección :");
					String ingreso_usuario= teclado.next();
					matrizjoh[fi][co]=ingreso_usuario;
				/*}else if(co==3){					
					System.out.println("Ingrese el Numero telefonico :");
					int ingreso_usuario= teclado.nextInt();
					matrizjoh[fi][co]=ingreso_usuario;*/
				}
				
			System.out.println("La Matriz es:");
			for (fi=0;fi<cantidad_filas;fi++){
				for (co=0;co<cantidad_columnas;co++){
					System.out.print(matrizjoh[fi][co]+"");
				}
			System.out.println("");
			}
			System.out.println("");
			
	}
			teclado.close();
	}
	}
	}

	

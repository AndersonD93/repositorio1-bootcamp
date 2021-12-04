package clase4a;

public class Multiplicacion_Matriz {

	public static void main(String[] args) {
		
		int[][] matriz_a = { 
				{1,2},
				{4,5},
				{7,8},
		};
		
		int[][] matriz_b = { 
				{1,2,3},
				{0,5,2},
		};		
				
		int filas_a =matriz_a.length;
		int columns_a=matriz_a[0].length;
		int filas_b =matriz_b.length;
		int columns_b=matriz_b[0].length;
		
		if(columns_a==filas_b) {	
		
			int matriz_mult[][]= new int [filas_a][columns_b];  
			
			for(int i=0;i<filas_a;i++) {
				for (int j=0;j<matriz_mult[0].length;j++) {
					matriz_mult[i][j]=(matriz_a[i][i])*(matriz_b[j][j]);
						
				}
			}
			
			
		}System.out.println("Las matrices no pueden ser multiplicadas.");
	}

}

package pruebas_casa_poo;

public class Operaciones {

	int suma;
	double resto;
	double division;	
	
	public void sumar(int numero_1 , int numero_2) {
		suma= numero_1+ numero_2;
	}
		
	public void restante (int numero_1 , int numero_2) {
		resto = numero_1 % numero_2;
	
	}
	public void dividir (int numero_1, int numero_2) {
		division = numero_1/ numero_2;
		
	}
	public void mostraresultados() {
	
		System.out.println("La suma es = "+ suma);
		System.out.println("el resto es = "+ resto);
		System.out.println("la division es = "+ division);
	}
	
	
	}	

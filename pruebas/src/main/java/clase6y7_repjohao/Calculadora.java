package clase6y7_repjohao;

public class Calculadora {
	
	double sumar (double a, double b) {
		return a+b;
	}
	
	double restar (double a, double b) {
		return a-b;
	}
	double multiplicar (double a, double b) {
		return a*b;
		
	}
	//precondiciones b=!0
	//postcondicion= a/0
	
	double dividir (double a, double b) {
		if (b!=0) {
			return a/b;	
		}
		else {
			System.out.println("No se puede dividir entre cero. ");
			return 0;
		}
	}

}

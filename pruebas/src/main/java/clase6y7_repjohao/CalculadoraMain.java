package clase6y7_repjohao;

public class CalculadoraMain {

	public static void main(String[] args) {
		
		//crear una calculadora
		// usar alguna de sus funciones
		
		//creando un objeto de la clase calculadora
		Calculadora miCalculadora = new Calculadora();
		
		//ahora ejecuto cualqueira de sus funciones
		int a=10;
		int b=30;
		
			
		double suma = miCalculadora.sumar(a, b);
		System.out.println("La suma de "+ a +"y"+ b +" es "+ suma);

	}

}

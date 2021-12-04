package laboratorios_casa;

public class Laboperadores {

	public static void main(String[] args) {
		
		//Con el numero ingresado calcule el No de semanas,días y horas
		// Contemplar semanas de 7 días, días de 24 horas y meses de 4 semanas.
		
		int valor_dias = 1501;
		
		int semanas=valor_dias/7;
		int residuodias= (valor_dias%7);
		int cantidad_horas=valor_dias*24;
		
		System.out.println("la cantidad en semanas son:"+semanas);
		System.out.println("los días restantes son:"+residuodias);
		System.out.println("El total de horas son:"+cantidad_horas);
		
		// Ejercicio asignacion basica
		
		System.out.println("A");
		int x = 10;
		int y=20;
		System.out.println(x);
		System.out.println(y);
		System.out.println("B");
		x = x + 5;
		y = y + 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println("C");
		x = x- 5;
		y = y - 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println("D");
		x = x* 3;
		y = y *5;
		System.out.println(x);
		System.out.println(y);
		System.out.println("E");
		x = x/ 2;
		y = y /4;
		System.out.println(x);
		System.out.println(y);

		
		
		
	}

}

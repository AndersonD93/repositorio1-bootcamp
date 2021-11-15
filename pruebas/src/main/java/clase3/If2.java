package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		//Ingrese contraseña y usuario
		//si contraseña ="1234" y usuarios =admin =>"ok"
		//de lo contrario "fail"
		
		String usuario;
		String contrasenia;
		
		usuario =  "jose";
		contrasenia = "12345";
		
		if(usuario=="admin" && contrasenia=="1234") {
			System.out.println("Ok");
		}else {
			System.out.println("fail");
		}
		
		// forma anidada
		if (usuario=="admin") {
				if (contrasenia=="1234") {
					System.out.println("Ok");
				}else {
					System.out.println("fail");
				}
		}else {
			System.out.println("fail");
		}
		
		teclado.close();

}
}
	

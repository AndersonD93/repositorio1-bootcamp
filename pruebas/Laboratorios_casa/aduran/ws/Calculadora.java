package aduran.ws;

import javax.jws.*;

@WebService
public interface Calculadora {
	@WebMethod
	public double operacion(int opcion,int valor1, int valor2 ); 
}

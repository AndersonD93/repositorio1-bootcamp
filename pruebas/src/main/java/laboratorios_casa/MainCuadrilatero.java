package laboratorios_casa;

import javax.swing.JOptionPane;

public class MainCuadrilatero {

	public static void main(String[] args) {
		
		AreaPerimetroCuadrilatero c1;
		float lado1;
		float lado2;
		
		lado1= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 1"));
		lado2= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado 2"));
		
		//En caso de ser cuadrado
		if (lado1==lado2) {
			c1= new AreaPerimetroCuadrilatero(lado1);
		// En caso de ser cuadrilatero =! de cuadrado	
		}else {
			c1= new AreaPerimetroCuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perimetro del cuadrilatero es : "+ c1.getPerimetro());
		System.out.println("Eñ Areañ del cuadrilatero es : " +c1.getArea());
		
	}

}

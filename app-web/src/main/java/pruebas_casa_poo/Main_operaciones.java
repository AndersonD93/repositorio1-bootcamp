package pruebas_casa_poo;

import javax.swing.JOptionPane;

public class Main_operaciones {

	public static void main(String[] args) {
		
		int numero_1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		int numero_2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
		
		Operaciones op = new Operaciones ();
		
		op.sumar(numero_1, numero_2);
		op.restante(numero_1, numero_2);
		op.dividir(numero_1, numero_2);
		op.mostraresultados();
		

	}

}

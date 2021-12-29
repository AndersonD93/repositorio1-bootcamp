package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class interf1 extends JFrame {
	
	public interf1() {
		setSize(600,600); //establece tamaño de ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// cierra el programa al cerrar la ventana
		setTitle("El titulo de la ventana"); // coloca titulo a la ventana
		setLocationRelativeTo(null);// coloca en el medio la ventana
		//setBounds(100,200,500,500);// establece (x,y,alto,ancho) ventana
		setMinimumSize(new Dimension(200,200));//establecemos el tamaño minimo
		this.getContentPane().setBackground(Color.BLACK);
		iniciarComponentes();
	}

private void iniciarComponentes(){
	JPanel panel= new JPanel();
	
	//panel.setBackground(Color.GREEN);// Cambiamos el color del panel
	panel.setLayout(null); //desactivamos el diseño por defecto del panel
	this.getContentPane().add(panel);//agregamos el panel a la ventana
	
	JLabel etiqueta = new JLabel();// creamos etiqueta
	etiqueta.setText("MUNDIAL 2022");// establecemos el texto en la etiqueta.
	panel.add(etiqueta);//adicionamos la etiqueta al panel
	etiqueta.setBounds(10,10,550,50); //asigno posiciones y tamaños de la etiqueta.
	//etiqueta.setForeground(Color.WHITE);// Cambio el color de las letras de la etiqueta
	etiqueta.setOpaque(true);// desactivamos el diseño de defecto del fondo de la etiqueta
	etiqueta.setBackground(Color.RED);// asignamos un nuevo color al fondo de la etiqueta
	etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // damos ubicación al texto de la etiqueta en el centro (tambien se puede manejar directamente en constructor)
	etiqueta.setFont(new Font("cooper black",Font.BOLD,40));// cambiamos el estilo de letra (nombre,tipo,tamaño)
	
	//crear etiqueta tipo imagen
	
	JLabel etiqueta2=new JLabel(new ImageIcon("C:\\Users\\johao\\git\\repositorio1-bootcamp\\pruebas\\Laboratorios_casa\\interfacesGraficas\\logomundial.jpg.png"));
	etiqueta2.setBounds(40,40,500,500);
	panel.add(etiqueta2);
	
		
	
}


}

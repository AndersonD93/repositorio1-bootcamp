package interfacesGraficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class interf1 extends JFrame {
	
	JPanel panel;
	
public interf1() {
		setSize(600,600); //establece tama�o de ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);// cierra el programa al cerrar la ventana
		setTitle("Nueva Polla Mundial 2022"); // coloca titulo a la ventana
		setLocationRelativeTo(null);// coloca en el medio la ventana
		//setBounds(100,200,500,500);// establece (x,y,alto,ancho) ventana
		setMinimumSize(new Dimension(200,200));//establecemos el tama�o minimo
		this.getContentPane().setBackground(Color.BLACK);
		iniciarComponentes();
	}

private void iniciarComponentes(){
	
	establecerPanel();
	establecerEtiqueta();
	crearBotones();
}


private void establecerPanel() {	
	
	panel= new JPanel();
	
	//panel.setBackground(Color.GREEN);// Cambiamos el color del panel
	panel.setLayout(null); //desactivamos el dise�o por defecto del panel
	this.getContentPane().add(panel);//agregamos el panel a la ventana	
		
}
private void establecerEtiqueta() {
	JLabel etiqueta = new JLabel();// creamos etiqueta
	etiqueta.setText("MUNDIAL 2022");// establecemos el texto en la etiqueta.
	panel.add(etiqueta);//adicionamos la etiqueta al panel
	etiqueta.setBounds(10,10,550,50); //asigno posiciones y tama�os de la etiqueta.
	//etiqueta.setForeground(Color.WHITE);// Cambio el color de las letras de la etiqueta
	etiqueta.setOpaque(true);// desactivamos el dise�o de defecto del fondo de la etiqueta
	etiqueta.setBackground(Color.RED);// asignamos un nuevo color al fondo de la etiqueta
	etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // damos ubicaci�n al texto de la etiqueta en el centro (tambien se puede manejar directamente en constructor)
	etiqueta.setFont(new Font("bauhaus 93",Font.BOLD,40));// cambiamos el estilo de letra (nombre,tipo,tama�o)
	
	//crear etiqueta tipo imagen
	
	JLabel etiqueta2=new JLabel(new ImageIcon("C:\\Users\\johao\\git\\repositorio1-bootcamp\\pruebas\\Laboratorios_casa\\interfacesGraficas\\logomundial.jpg.png"));//crear etiqueta con constructor trayendo la direcci�n de imagen
	etiqueta2.setBounds(40,20,500,500);// Ubicacion de imagen
	panel.add(etiqueta2);//adicionar la etiqueta al panel	
}

private void crearBotones() {
	
	//BOT�N No.1 TEXTO
	JButton boton1= new JButton("Inicia la polla");// crear boton con constructor que trae String
	boton1.setBounds(225,450,150,50);//dar ubicaci�n al bot�n
	boton1.setEnabled(true);//false desabilita las funciones del bot�n 
	boton1.setMnemonic('a');
	boton1.setBackground(Color.RED);
	boton1.setFont(new Font("bauhaus 93",Font.BOLD,15));
	panel.add(boton1);//adicionar el bot�n al panel
	
	//BOT�N No.2 IMAGEN
	JButton boton2= new JButton();
	boton2.setBounds(225,500,150,50);
	ImageIcon clic= new ImageIcon("C:\\Users\\johao\\git\\repositorio1-bootcamp\\pruebas\\Laboratorios_casa\\interfacesGraficas\\CLICK.jfif");
	boton2.setIcon(new ImageIcon(clic.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(), Image.SCALE_SMOOTH)));
	panel.add(boton2);
	
	
	
}

}

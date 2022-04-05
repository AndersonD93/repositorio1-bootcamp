
package ar.com.educacionit.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import ar.com.educacionit.dao.exceptions.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException {
		
		
		String url = "jdbc:postgresql://ec2-44-192-245-97.compute-1.amazonaws.com:5432/ddi29eq5bimvm8?sslmode=require";
		String user = "oiacpggohxysnd";
		String password = "bee22944e8dbc42686616c0d2f0d6621dfaab8c300516dd843c49893e04b683d";
		String diverName  = "org.postgresql.Driver";
		
		/*
		String url = "jdbc:mysql://127.0.0.1:3306/bootcamp_protalento?serverTimezone=UTC&userSSL=false";
		String user = "root";
		String password = "root";
		String diverName  = "com.mysql.cj.jdbc.Driver";
		*/
		
		
		try {
			//com.mysql.cj.jdbc.Driver.class.newInstance();
			Class.forName(diverName);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception  e) {
			throw new GenericException("Error oteniendo conexion: " + e.getMessage(),e);
		} 
	}
	
	public static void main(String[] args) {
		
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {			
			System.out.println("Conexion obtenida");
		}catch (Exception e) {			
			e.printStackTrace();
		}
	}
}

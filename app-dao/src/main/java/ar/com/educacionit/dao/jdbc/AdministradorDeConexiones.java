package ar.com.educacionit.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import ar.com.educacionit.dao.exceptions.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException {
		String url = System.getenv("DATABASE_URL"); //"jdbc:mysql://127.0.0.1:3306/bootcamp_protalento?serverTimezone=UTC&userSSL=false";
		String user = System.getenv("SPRING_DATASOURCE_USERNAME");
		String password = System.getenv("SPRING_DATASOURCE_PASSWORD");
		String diverName  = System.getenv("SPRING_DATASOURCE_DRIVER");
		
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

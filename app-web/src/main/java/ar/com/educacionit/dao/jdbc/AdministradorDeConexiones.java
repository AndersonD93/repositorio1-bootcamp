package ar.com.educacionit.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import ar.com.educacionit.dao.exceptions.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException {
		String url = "postgres://cqeakkblvyntsz:44e1b9253a268f6e9cc92e8edae05ffaa3aa0d398b56f4086213a7938765b80b@ec2-3-222-204-187.compute-1.amazonaws.com:5432/da65a538i5e4vj";
		String user = "cqeakkblvyntsz";
		String password = "44e1b9253a268f6e9cc92e8edae05ffaa3aa0d398b56f4086213a7938765b80b";
		String diverName  = "com.mysql.cj.jdbc.Driver";
		
		
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

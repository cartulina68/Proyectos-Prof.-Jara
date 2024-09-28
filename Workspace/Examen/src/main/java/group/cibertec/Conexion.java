package group.cibertec;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private static Connection con = null;
	private static final String URL = "jdbc:mysql://localhost:3306/BD1_Apellido";
	private static final String USER = "root";
	private static final String PWD = "mysql";
	
	public static Connection conectar() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Conexión exitosa con Maven");
		} catch (Exception e) {
			System.out.println("Error al abrir Conexión: " + e.getMessage());
		}
		return con;
	}
	
	public static void main(String[] args) {
		conectar();
	}
}

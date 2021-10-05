package controlador;

import java.sql.*;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class conexion {
	Connection cn;
	
public Connection conexionbd() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			cn=DriverManager.getConnection("jdbc:mysql://localhost/baseproyecto","root","");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	return cn;
}
}

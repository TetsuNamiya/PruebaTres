package modelo;

import java.sql.*;
import java.sql.PreparedStatement;

import controlador.conexion;

public class UsuariosDAO {
	
	conexion con=new conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	
	public boolean insertarusuario(UsuariosDTO us) {
		int r;
		boolean dat=false;
		try {
			ps=cnn.prepareStatement("INSERT INTO usuarios values(?,?,?,?,?)");
			ps.setLong(1,us.getCedulausuario());
			ps.setString(2,us.getEmailusuario());
			ps.setString(3,us.getNombreusuario());
			ps.setString(4,us.getPassword());
			ps.setString(5,us.getUsuario());
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return dat;
	}
	
	
	
	
}

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionClientes {
	private String url="jdbc:mysql://localhost:3306/libros";
	private String user ="root";
	private String pwd = "root";
	private String driver ="com.mysql.jdbc.Driver";
	
	//aprovechamos el constructor para realizar la carga del
	//driver
	public GestionClientes(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//A partir de un usuario y una contrase�a dice
	//si est� en la bbdd o no
	public boolean autenticar(String usuario, String password){
		boolean res= false;
		
		try (Connection cn = DriverManager.getConnection(url, user, pwd)){
			String sql = "select * from clientes where usuario=? and password=?";
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			res = rs.next();
		}
		catch (SQLException ex){
			ex.printStackTrace();
		}
		return res;
	}
}

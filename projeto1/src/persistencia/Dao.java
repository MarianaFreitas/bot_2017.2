package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection conn;
	PreparedStatement stmt; // responsável pela atualização
	//(inclusão, exclusão, atualização)
	ResultSet rs;
	
	public void abrirConexao()throws Exception{
		//definir a classe que atua como drive
		//de conexão entre o java e o mysql
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto1","root","");
	}
	
	public void fecharConexao()throws Exception{
		conn.close();
	}
	
	public static void main(String[] args) {
		//criar variável do tipo Dao
		Dao d = new Dao();
		try {
			d.abrirConexao();
			d.fecharConexao();
			System.out.println("Conectei!...");
		} catch (Exception e) {
			System.out.println("Deu Ruim!...");
			e.printStackTrace();
		}
	}
	
	
}

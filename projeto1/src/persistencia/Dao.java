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
		Class.forName("com.mysql.jbdc.Driver");
		conn = DriverManager.getConnection("jbdc:mysql//localhost:3306/projeto1",root,"");
	}
	
}

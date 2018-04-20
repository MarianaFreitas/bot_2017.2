package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  abstract class DAO{

	private static final String URL = "jdbc:mysql://localhost/aula08";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public DAO() {
		 /*
		  *try-catch: Tratamento de exceção do java,  
		  * utilizamos quando precisamos controlar um
		  * possível erro.
		  * */
		try {
			//drive de conexão
			Class.forName("com.mysql.Driver");
		} catch (ClassNotFoundException e) {
			// saída de mensagem
			e.printStackTrace();
			System.out.println("Erro ao selecionar o driver: "+ e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws SQLException {
		//contém uma conexão com o banco de dados
		Connection conn;
		//DriverManager: abre conexão com o banco
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//retorna a conexão a quem de direito
		return conn;
	}
}

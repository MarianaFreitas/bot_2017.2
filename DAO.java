package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO {

	private static final String URL = "jdbc:mysql://localhost/aula08";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public DAO() {
		/*
		 * try-catch: Tratamento de exce��o do Java,
		 * utilizamos quando precisamos controlar um 
		 * poss�vel erro. 
		 * */
		try {
			// driver de conexao
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Detalha o erro
			e.printStackTrace();
			// Sa�da da mensagem de erro
			System.out.println("Erro ao selecionar o driver: " + e.getMessage());
		}
	}
	
	protected Connection abrirConexao() throws SQLException {
		// Cont�m uma conex�o com o banco de dados
		Connection conn;
		// DriverManager: abre a conex�o com o banco
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		// retorna a conex�o a quem de direito
		return conn;
	}
}

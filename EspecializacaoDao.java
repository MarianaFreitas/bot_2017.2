package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Especializacao;

// C.R.U.D - Especializacao
public class EspecializacaoDAO extends DAO {
	
	private Connection conn;
	
	public EspecializacaoDAO() {
		try {
			conn = abrirConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexao: " + e.getMessage());
		}
	}
	public void gravar(Especializacao e) throws SQLException {
		// ele prepara contexto de instrução SQL para ser enviado para o SGBD
		PreparedStatement stmt = null;
		
		try {
			stmt = conn.prepareStatement("insert into especializacao values (null, ?,?)");
			
			stmt.setString(1, e.getTitulo());
			stmt.setString(2, e.getProfessor().getId());
			
			// retorna "0" caso ocorra uma falha
			int flag = stmt.executeUpdate();
			
			if(flag == 0)
				throw new SQLException("Erro ao gravar no banco");
		} finally {
			if(stmt != null)
				stmt.close();
			
			if(conn != null)
				conn.close();
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
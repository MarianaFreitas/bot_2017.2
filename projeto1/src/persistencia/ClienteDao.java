package persistencia;

import entidade.Cliente;

public class ClienteDao extends Dao{
	//m�todo para inserir
	public void inserir(Cliente c) throws Exception{
		//abrir o banco de dados 
		abrirConexao();
		stmt = conn.prepareStatement("insert into cliente values(null,?,?,?,?)");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getSexo());
		stmt.setString(4, c.getEstadoCivil());
		
		//gravar 
		stmt.execute();
		stmt.close();
		
		//fechar conex�o com banco de dados
		fecharConexao();
	}
	
	//m�todo para lista
	//m�todo para excluir
	
	
}

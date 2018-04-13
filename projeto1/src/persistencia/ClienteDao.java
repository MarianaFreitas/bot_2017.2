package persistencia;

import entidade.Cliente;

public class ClienteDao extends Dao{
	//método para inserir
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
		
		//fechar conexão com banco de dados
		fecharConexao();
	}
	
	//método para lista
	//método para excluir
	
	
}

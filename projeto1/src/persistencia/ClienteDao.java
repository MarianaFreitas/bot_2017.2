package persistencia;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Cliente> consultarCliente()throws Exception{
		
		abrirConexao();
		
		stmt = conn.prepareStatement("select * from cliente");
		rs = stmt.executeQuery();
		List<Cliente> lista = new ArrayList<Cliente>();
		
		while (rs.next()) {
			lista.add(new Cliente(rs.getInt("id"),
								  rs.getString("nome"),
								  rs.getString("email"),
					              rs.getString("sexo"),
					              rs.getString("estcivil")));
			
		}
	
		rs.close();
		stmt.close();
		fecharConexao();
		return lista;
		
	}
	
	//método para excluir
}

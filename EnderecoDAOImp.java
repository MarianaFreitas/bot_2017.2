package implement;

import java.sql.SQLException;

import entity.Endereco;
import persist.EnderecoDAO;

public class EnderecoDAOImp {

	private EnderecoDAO dao;
	
	public EnderecoDAOImp() {
		dao = new EnderecoDAO();
	}
	
	public boolean gravar(Endereco e) {
		try {
			dao.save(e);
			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false;
	}
	public Endereco buscarPorId(int id) {
		try{
			return dao.localizaEndereco(id);
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return new Endereco();
		}
	}
}

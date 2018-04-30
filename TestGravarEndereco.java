package test;

import entity.AlunoGra;
import entity.Endereco;
import implement.EnderecoDAOImp;

public class TestGravarEndereco {
	public static void main(String[] args) {
		EnderecoDAOImp daoImp = new EnderecoDAOImp();
		
		Endereco endereco = new Endereco();
		
		endereco.setLogradouro("Rua 1, nº 136");
		endereco.setBairro("Centro");
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("21000-000");
		
		endereco.setPessoa(new AlunoGra());
		endereco.getPessoa().setId(1);

		if(daoImp.gravar(endereco))
			System.out.println("Endereço gravado");
	}
}

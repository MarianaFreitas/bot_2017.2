package test;

import entity.Professor;
import entity.Especializacao;
import implement.EspecializacaoDAOImp;

public class TestGravarEspecializacao {
	public static void main(String[] args) {
		
		Especializacao especializacao = new Especializacao();
		
		especializacao.setTitulo("Mestrado em ...");
		especializacao.setProfessor(new Professor());
		especializacao.getProfessor().setId(1);

			
			EspecializacaoDAOImp daoImp = new EspecializacaoDAOImp();
			imp.gravar(especializacao);
	
	if(daoImp.gravar(especializacao))
			System.out.println("Especializacao gravado");
	}
}
}
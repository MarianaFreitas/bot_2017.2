package test;

import entity.AlunoTec;
import entity.Endereco;

public class TestaAlunoTec {
	public static void main(String[] args) {

		AlunoTec aluTec = new AlunoTec();
		
		aluTec.setNome("Rose França");
		aluTec.setEmail("rfranca@gmail.com");
		aluTec.setMatricula("atec001");
		aluTec.setModulo(5);
		aluTec.setTurno("Manhã");
		aluTec.setNota01(7.9);
		aluTec.setNota02(10.);
		
		// Atribuindo a instancia de endereço ao obj de prof
		aluTec.setEndereco(new Endereco());
		
		aluTec.getEndereco().setId(123);
		aluTec.getEndereco().setLogradouro("Rua 0");
		aluTec.getEndereco().setBairro("Centro");
		aluTec.getEndereco().setCidade("Rio de Janeiro");
		aluTec.getEndereco().setCep("21000-000");
		
		System.out.println(aluTec);
	}
}

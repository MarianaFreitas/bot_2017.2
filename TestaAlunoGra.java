package test;

import entity.AlunoGra;
import entity.Endereco;

public class TestaAlunoGra {
	public static void main(String[] args) {

		AlunoGra aluGra = new AlunoGra();
		
		aluGra.setNome("Daniel Luna");
		aluGra.setEmail("dluna@gmail.com");
		aluGra.setMatricula("agra001");
		aluGra.setPeriodo(2);
		aluGra.setTurno("Manhã");
		aluGra.setNota01(10.);
		aluGra.setNota02(9.8);
		
		// Atribuindo a instancia de endereço ao obj de prof
		aluGra.setEndereco(new Endereco());
		
		aluGra.getEndereco().setId(123);
		aluGra.getEndereco().setLogradouro("Rua 0");
		aluGra.getEndereco().setBairro("Centro");
		aluGra.getEndereco().setCidade("Rio de Janeiro");
		aluGra.getEndereco().setCep("21000-000");
		
		System.out.println(aluGra);
	}
}

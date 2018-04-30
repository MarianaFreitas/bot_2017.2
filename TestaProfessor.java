package test;

import entity.Endereco;
import entity.Especializacao;
import entity.Professor;

public class TestaProfessor {
	public static void main(String[] args) {

		Professor prof = new Professor();
		Especializacao esp = new Especializacao();
		
		prof.setNome("Luis Paulo");
		prof.setEmail("lpjunior@gmail.com");
		prof.setMatricula("prf001");
		prof.setSalario(1000000.);
		prof.setTurno("Manhã|Noite");
		
		// Definindo a especialização no obj da classe Especialização
		esp.setTitulo("Mestrando Eng. Computação");
		
		// associando a classe professor
		prof.setEspecializacao(esp);

		// Atribuindo a instancia de endereço ao obj de prof
		prof.setEndereco(new Endereco());
		
		prof.getEndereco().setId(123);
		prof.getEndereco().setLogradouro("Rua 0");
		prof.getEndereco().setBairro("Centro");
		prof.getEndereco().setCidade("Rio de Janeiro");
		prof.getEndereco().setCep("21000-000");
		
		System.out.println(prof);
		
		Professor prof2 = new Professor();
		prof2.setNome("João");
		System.out.println(prof2);
	}
}

package aplication;

import entity.Especializacao;
import entity.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		Especializacao esp = new Especializacao();
		
		prof.setNome("Luis Paulo");
		prof.setEmail("lpjunior@g,ail.com");
		prof.setMatricula("prf001");
		prof.setSalario(100000.);
	    prof.setTurno("Manh�/Noite");
		
		esp.setTitulo("Mestrando Eng. Computa��o");
		
		prof.setTitulo(esp);
		
		System.out.println(prof);
	}
}

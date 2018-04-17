package aplication;

import entity.AlunoGra;

public class TestaAlunoGra {

	public static void main(String[] args) {
		
		AlunoGra alung = new AlunoGra();

		alung.setNota1(6.0);
		alung.setNota2(7.0);
		alung.setPeriodo(2);
		alung.setTurno("Manhã");
		
		System.out.println(alung);
	}
}

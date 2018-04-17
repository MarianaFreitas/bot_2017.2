package aplication;

import entity.AlunoTec;

public class TestaAlunoTec {

		public static void main(String[] args) {
			
			AlunoTec aluntec = new AlunoTec();
		
			aluntec.setMatricula(001);
			aluntec.setNome("Ana");
			aluntec.setNota1(9.0);
			aluntec.setNota2(8.0);
			aluntec.setTurno("Manhã");
			aluntec.setModulo(3);
			
			System.out.println(aluntec);
		
		}
	}


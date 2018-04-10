package exemplo;

//import Aluno.java;

public class alunoAplicacao {

	public static void main(String[] args) {
		
		//criação da referencia do objeto
		Aluno joao;
		
		//criação da instancia do objeto
		joao = new Aluno();//utilizado o construtor sem argumanto(vazio)
		
		/*Forma simplificada de criar a referencia e instancia é:
		 * 
		 *Aluno joao = new Aluno();
		 * */
		
		joao.setMatricula(12345);
		joao.setNome("João da Silva");
		joao.setEmail("joao@senac.com");
		
		System.out.println(joao.getMatricula());
		System.out.println(joao.getNome());
		System.out.println(joao.getEmail());
		System.out.println(joao);
		
		//criação da referencia e instancia utilizando o construtor com argumentos(cheio)
		Aluno maria = new Aluno(1234, "Maria da Silva", "maria@gmail.com");
		
		//imprimindo os dados usando o toString
		System.out.println(maria);
	}
	
}

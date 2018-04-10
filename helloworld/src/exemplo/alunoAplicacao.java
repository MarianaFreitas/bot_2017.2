package exemplo;

//import Aluno.java;

public class alunoAplicacao {

	public static void main(String[] args) {
		
		//cria��o da referencia do objeto
		Aluno joao;
		
		//cria��o da instancia do objeto
		joao = new Aluno();//utilizado o construtor sem argumanto(vazio)
		
		/*Forma simplificada de criar a referencia e instancia �:
		 * 
		 *Aluno joao = new Aluno();
		 * */
		
		joao.setMatricula(12345);
		joao.setNome("Jo�o da Silva");
		joao.setEmail("joao@senac.com");
		
		System.out.println(joao.getMatricula());
		System.out.println(joao.getNome());
		System.out.println(joao.getEmail());
		System.out.println(joao);
		
		//cria��o da referencia e instancia utilizando o construtor com argumentos(cheio)
		Aluno maria = new Aluno(1234, "Maria da Silva", "maria@gmail.com");
		
		//imprimindo os dados usando o toString
		System.out.println(maria);
	}
	
}

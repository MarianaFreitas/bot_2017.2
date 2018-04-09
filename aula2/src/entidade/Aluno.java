package entidade;

public class Aluno {

	//atributos da classe aluno
	String nome;
	int idade;
	double nota1;
	double nota2;
	
	//as funcionalidades de uma classe são definidas através de métodos 
	public double calcularMedia() {
		
		double media = 0;
		media = (this.nota1 + this.nota2)/2;
		return media;
		
	}
	
	public void verificarSituação(double media){
		
		if (media >= 7) {
			System.out.println(nome + " - Aluno Aprovado!");
		} else if (media > 6) {
			System.out.println(nome + " - Aluno em Recuperação!");
		}else{
			System.out.println(nome + " - Aluno Reprovado!");
		}
	}
}

package entidade;

public class PrincipalAluno {
	
	//uma classe de execução requer o método de execução
	public static void main(String[] args) {
		
		Aluno x = new Aluno();
		
		x.nome = "André";
		x.idade = 15;		
		x.nota1 = 10;
		x.nota2 = 5;
		
		System.out.println("Nome: "+x.nome);
		
		//executando o método calcular média
		System.out.println("Média: "+x.calcularMedia());
		
		x.verificarSituação(x.calcularMedia());
		
		System.out.println("----------------------");
		
		Aluno x1 = new Aluno();
		x1.nome = "Rose";
		x1.idade = 16;
		x1.nota1 = 8;
		x1.nota2 = 6; 
		
		System.out.println("Nome: "+x1.nome);
		
		x1.verificarSituação(x1.calcularMedia());
		
		System.out.println("Média: "+x1.calcularMedia());
	}

}

package entidade;

public class PrincipalAluno {
	
	//uma classe de execu��o requer o m�todo de execu��o
	public static void main(String[] args) {
		
		Aluno x = new Aluno();
		
		x.nome = "Andr�";
		x.idade = 15;		
		x.nota1 = 10;
		x.nota2 = 5;
		
		System.out.println("Nome: "+x.nome);
		
		//executando o m�todo calcular m�dia
		System.out.println("M�dia: "+x.calcularMedia());
		
		x.verificarSitua��o(x.calcularMedia());
		
		System.out.println("----------------------");
		
		Aluno x1 = new Aluno();
		x1.nome = "Rose";
		x1.idade = 16;
		x1.nota1 = 8;
		x1.nota2 = 6; 
		
		System.out.println("Nome: "+x1.nome);
		
		x1.verificarSitua��o(x1.calcularMedia());
		
		System.out.println("M�dia: "+x1.calcularMedia());
	}

}

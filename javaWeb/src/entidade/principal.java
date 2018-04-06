package entidade;

public class principal {
	
	public static void main(String[] args){
		// crio objeto de instancia aluno
		Aluno a = new Aluno();
		
		// entrada de dados no objeto aluno
		a.nome = "Ana";
		a.idade = 15;
		a.endereco = "Rua A.";
		a.cpf = 123456789;
		
		Aluno b = new Aluno();
		
		b.nome = "Pedro";
		b.idade = 20;
		b.endereco = "Rua F.";
		b.cpf = 222222222;
		
	    // saída de dados	
	     System.out.println("Nome: "+a.nome);
	     System.out.println("Idade: "+a.idade);
	     System.out.println("Endereço: "+a.endereco);
	     System.out.println("CPF: "+a.cpf);
	     System.out.println("-----------------");
	     System.out.println("Nome: "+b.nome);
	     System.out.println("Idade: "+b.idade);
	     System.out.println("Endereço: "+b.endereco);
	     System.out.println("CPF: "+b.cpf);
	}
}

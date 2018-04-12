package exercicio;

//import exemplo.Aluno;

public class ProdutoAplicacao {


	public static void main(String[] args) {
		
		Produto  queijo;
		
		queijo = new Produto();
		
		queijo.setNomeProduto("Queijo");
		queijo.setPreco(10);
		queijo.setQuantidade("um");
		queijo.setDescricao("Queijo Bola");
		
		System.out.println(queijo);
		
	}
	
}


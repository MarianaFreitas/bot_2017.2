package exercicio;

public class Produto {


			private String nomeProduto;
			private Float preco;
			private String quantidade;
			private String descricao;
			
			//definir o(s) contrutor(es) de classe e sobrecarga de construtores
			public Produto(){
				/*sem argumentos e corpo (construtor padrão)
				*esse construtor é implementado
				*automaticamente quando não for definido
				*nenhum construtor
				**/
			}

			public Produto(String nomeProduto, Float preco, String quantidade, String descricao) {
				//com argumentos, os argumentos são definidos pelo programador
				
				this.nomeProduto = nomeProduto;
				this.preco = preco;
				this.quantidade = quantidade;
				this.descricao = descricao;
			}
			
			
			public String getNomeProduto() {
				return nomeProduto;
			}

			public void setNomeProduto(String nomeProduto) {
				this.nomeProduto = nomeProduto;
			}

			public Float getPreco() {
				return preco;
			}

			public void setPreco(float i) {
				this.preco = i;
			}

			public String getQuantidade() {
				return quantidade;
			}

			public void setQuantidade(String quantidade) {
				this.quantidade = quantidade;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}
			
			
			//definir os métodos sobreescritos
			@Override
			public String toString() {
				return "Dados do Produto:\nNome Produto: "+ nomeProduto + "\nPreço: " + preco + "\nQuantidade: "+ quantidade + "\nDescrição: " + descricao;
			}
}

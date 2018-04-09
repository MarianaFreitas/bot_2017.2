package entidade;

public class Carro {

	/*Classe carro representa uma entidade
	 * Esse tipo de classe deve seguir um padrão camado Javabean.
	 * Desta forma, não deve ser permitido o acesso direto aos atributos.
	 * 
	 * 
	 * 
	 * ENCAPSULAMENTO -- Garantir a integridade dos dados armazenados em um
	 * atributo limitando o acesso a ele . Os atributos serão privados 
	 * e serão criados métodos de acesso públicos*/


	/*Modificadores de acesso
	 * public - acesso permitido para qualquer arquivo do programa.
	 * private - acesso permitodo somente para o proprio.
	 * protected - acesso peritido desde que haja herança...*/
	
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Carro(){
	}
	
	public  Carro(String modelo, int ano, String cor, double preco) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.preco = preco;
	}
	
	public  Carro(String modelo, int ano) {
		super();
		this.modelo = modelo;
		this.ano = ano;
	}	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + ", preco=" + preco + "]";
	}
	
}

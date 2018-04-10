package exemplo;

public class Aluno {

	//definir os atributos da classe entidade
		private Integer matricula;
		private String nome;
		private String email;
		
		//definir o(s) contrutor(es) de classe e sobrecarga de construtores
		public Aluno(){
			/*sem argumentos e corpo (construtor padr�o)
			*esse construtor � implementado
			*automaticamente quando n�o for definido
			*nenhum construtor
			**/
		}

		public Aluno(Integer matricula, String nome, String email) {
			//com argumentos, os argumentos s�o definidos pelo programador
			
			this.matricula = matricula;
			this.nome = nome;
			this.email = email;
			
		}
		
		//definir o encapsulamento (gets e sets)
		public void setMatricula(Integer matricula) {
			this.matricula = matricula;
		}
		
		public Integer getMatricula() {
			return matricula;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getEmail() {
			return email;
		}
		
		//definir os m�todos sobreescritos
		@Override
		public String toString() {
			return "Dados do aluno:\nMatricula: "+ matricula + "\nNome: " + nome + "\nEmail: "+ email;
		}
}

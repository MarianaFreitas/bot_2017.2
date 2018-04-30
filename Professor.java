package entity;

public class Professor extends Pessoa {

	private Double salario;
	// Agregação
	private Especializacao especializacao;

	public Professor() {

	}

	public Professor(Integer id, String matricula, String nome, String email, String turno, Double salario,
			Especializacao especializacao) {
		super(id, matricula, nome, email, turno);
		this.salario = salario;
		this.especializacao = especializacao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Especializacao getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	protected String geraPerfil() {
		return super.geraPerfil() + 
				"\nSalário: " + salario + 
				"\nEspecialização: " + especializacao;
	}
}

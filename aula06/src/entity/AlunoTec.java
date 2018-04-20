package entity;

public class AlunoTec extends Aluno {

	private Integer modulo;

	public AlunoTec() {

	}
	
	public AlunoTec(Integer id, String matricula, String nome, String email, String turno, Double nota01, Double nota02,
			Integer modulo) {
		super(id, matricula, nome, email, turno, nota01, nota02);
		this.modulo = modulo;
	}

	public Integer getModulo() {
		return modulo;
	}

	public void setModulo(Integer modulo) {
		this.modulo = modulo;
	}

	@Override
	protected String geraPerfil() {
		// TODO Auto-generated method stub
		return super.geraPerfil() + "\nModulo: " + modulo;
	}
}

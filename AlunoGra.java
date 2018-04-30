package entity;

public class AlunoGra extends Aluno {

	private Integer periodo;

	public AlunoGra() {

	}

	public AlunoGra(Integer id, String matricula, String nome, String email, String turno, Double nota01, Double nota02,
			Integer periodo) {
		super(id, matricula, nome, email, turno, nota01, nota02);
		this.periodo = periodo;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	@Override
	protected Double getMedia() {
		return ((nota01 * 1) + (nota02 * 2)) / (1 + 2);
	}
	
	@Override
	protected String geraPerfil() {
		// TODO Auto-generated method stub
		return super.geraPerfil() + "\nPeriodo: " + periodo;
	}
}

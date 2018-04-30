package entity;

import java.text.DecimalFormat;

public abstract class Aluno extends Pessoa {

	protected Double nota01;
	protected Double nota02;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer id, String matricula, String nome, String email, String turno, Double nota01, Double nota02) {
		super(id, matricula, nome, email, turno);
		this.nota01 = nota01;
		this.nota02 = nota02;
	}

	public Double getNota01() {
		return nota01;
	}

	public void setNota01(Double nota01) {
		this.nota01 = nota01;
	}

	public Double getNota02() {
		return nota02;
	}

	public void setNota02(Double nota02) {
		this.nota02 = nota02;
	}

	protected Double getMedia() {
		return (nota01 + nota02) / 2;
	}

	@Override
	protected String geraPerfil() {
		DecimalFormat df = new DecimalFormat("0.00");
		return super.geraPerfil() + "\nMédia: " + df.format(getMedia());
	}
	
	
}

package entity;

public abstract class Aluno extends Pessoa{

	private Double nota1;
	private Double nota2;
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	
public Aluno(Integer id,String matricula,String nome,String email,String turno,Double nota1, Double nota2) {
		super(id, matricula, nome, email, turno);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

public String geraPerfil() {
		
		return "Os dados são:\n"
				+ "\nMatricula: " + matricula
				+ "\nNome: " + nome
				+ "\nEmail: " + email
				+ "\nNota1: "+ nota1
				+ "\nNota2: "+ nota2
				+ "\nTurno: "+ turno;
	}

	@Override
	public String toString() {
		return geraPerfil();
	}
}

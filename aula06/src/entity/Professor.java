package entity;

public class Professor extends Pessoa{

	private Double salario;
	//agregação
	private Especializacao titulo;
	
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double i) {
		this.salario = i;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public Especializacao getTitulo() {
		return titulo;
	}


	public void setTitulo(Especializacao titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String geraPerfil() {
		return super.geraPerfil()
				+ "\nSalário: " + salario
				+ "\nTurno: " + getTurno()
				+ "\nEspecialização: " + titulo;
	}


	@Override
	public String toString() {
		return geraPerfil();
	}
	
	
}

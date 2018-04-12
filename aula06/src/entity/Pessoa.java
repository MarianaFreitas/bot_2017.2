package entity;

//classes abstratas não podem ser instanciadas (não funciona new pessoa)
public abstract class Pessoa {

	protected Integer id;
	protected String matricula;
	protected String nome;
	protected String email;
	
	
	public Pessoa() {
	
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (email != null) {
			if (other.email != null) 
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != null) {
			if (other.id != null) 
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (matricula != null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}	

	//método personalizado
	public String geraPerfil() {
		
		return "Os dados são:\n"
				+ "Matricula: " + matricula
				+ "\nNome: " + nome
				+ "\nEmail: " + email;
	}

	@Override
	public String toString() {
		return geraPerfil();
	}
}

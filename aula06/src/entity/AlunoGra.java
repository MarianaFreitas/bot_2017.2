package entity;

public class AlunoGra extends Aluno{

	private int periodo;
	private static Double nota2;
	private static Double nota1;
	private static double Media;

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public String geraMedia() {
		return super.geraMedia()
				+ "\nNota1: " + getNota1()
				+ "\nNota2: " + getNota2()
				+ "\nTurno: " + getTurno();
	}
	
	public static void Media(String[] args) {
	 nota1 = null;
	 nota2 = null;
	 
	Media((nota1 + nota2) / 2);
	}
	
	private static void Media(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return geraMedia();
	}

	public static double getMedia() {
		return Media;
	}

	public static void setMedia(double media) {
		Media = media;
	}

	public void setNota1(double d) {
		// TODO Auto-generated method stub
		
	}

}

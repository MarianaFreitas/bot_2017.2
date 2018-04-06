package exemplo;

public class estruturaTres {

	public static void main(String[] args) {
		
		String materia = "Java";
		
		if(materia  == "PHP") {
			System.out.println("Disciplina do 4 modulo");
		} else if (materia == "Banco de Dados") {
			System.out.println("Dsiciplina do 3 modulo");
		} else if (materia == "Java") {
			System.out.println("Disciplina do 5 modulo");
		} else {
			System.out.println("Disciplina não é dos modulos de programação");
		}
		
	}
}

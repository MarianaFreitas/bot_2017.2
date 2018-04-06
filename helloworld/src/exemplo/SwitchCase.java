package exemplo;

public class SwitchCase {
  
	public static void main(String[] args) {
		
		String opcao;
		
		opcao = "Java";
		
		switch (opcao) {
		case "WEB2":
		case "Web2":
		case "WEB02":	
		case "Web02":
			System.out.println("Desenvolvimento do sites resposivos, templates e jquery, ajax");
			break;
		case "PHP":	
		case "Php":	
		case "php":
			System.out.println("Criação de sites informativos, sistemas interligados a um SGBD");
			break;
		case "Java":
		case "JAVA":
		case "java":
			System.out.println("Criação de sistemas robustos, muito utilizados por bancos");
			break;
		default:
			System.out.println("Nenhuma das opções acima...");
			break;
		}
		
	}
}

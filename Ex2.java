package ex;

public class Ex2 {

	public static void main(String[] args) {
		
		double pedro = 1.50; 
		double mauro = 1.10; 
		int anos = 0; 
		
		while (mauro < pedro) { 
		pedro += 0.2; 
		mauro += 0.3; 
		anos++; 
		} 
		
		if (mauro == pedro) {
			System.out.printf("\nTerão o mesmo tamanho com %d anos e Mauro será maior que Pedro no decorrer do ano %d", anos, anos+1); 
		}else {
			System.out.printf("\nTerão o mesmo tamanho no decorrer do ano %d e Mauro será maior que Pedro com %d anos", anos-1, anos); 
			return; 
		}
	}

}
package aula04;

import java.util.Scanner;

public class leituraTeclado {
	
	public static void main(String[] args) {
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.println("\nN�mero lido: " + numero);
	}

}

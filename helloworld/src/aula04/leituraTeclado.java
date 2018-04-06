package aula04;

import java.util.Scanner;

public class leituraTeclado {
	
	public static void main(String[] args) {
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.println("\nNúmero lido: " + numero);
	}

}

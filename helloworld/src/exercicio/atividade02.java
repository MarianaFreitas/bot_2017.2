package exercicio;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		
		int i = 0;
		int x = i++;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		x = teclado.nextInt();
		teclado.close();
		
		
		System.out.println("\nPrimeiro N�mero: " + x);
		
		
		
	}
}

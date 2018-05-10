package ex;

import java.util.Scanner;

public class Ex3 {

	private static Scanner scan;
	private static Scanner scan1;

	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		int num1 = scan.nextInt();
		if(num1 == 0){
			System.exit(0);
		}
		
		
        scan1 = new Scanner(System.in);
		
		System.out.println("Informe o segundo número");
		int num2 = scan1.nextInt();
		if(num2 == 0){
			System.exit(0);
		}
		
		System.out.println("Soma :" +(num1 + num2));
		System.out.println("Número 1: "+ num1);
		System.out.println("Número 2: "+ num2);
		System.out.println("O maior entre Número 1 e Número 2 é: " + Math.min(num1, num2));
		System.out.println("O menor entre Número 1 e Número 2 é: " + Math.max(num1, num2));
		System.out.println("Média: "+ (num1 + num2)/2);
	}

}

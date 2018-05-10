package ex;

import java.util.Scanner;

public class Ex6 {

	private static Scanner scan;
	

	public static void main(String[] args) {
		
		int[] array = new int[10];
		int maior = array[0];
		
		scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++){
		System.out.println("Digite um número: ");
			array[i] = scan.nextInt();
			
			if(array[i] == 0){
				System.exit(0);
			}
			
			System.out.println("\n----Posições Vetor----\n");
			for(int i1 = 0; i1 < array.length; i1++){
				System.out.println("Posição: "+i1+" - Valor: " +array[i1]);
			}
			
			System.out.println("-----------------------------");
			
			int x = array.length;
			for(int i1 = x - 1 ; i1 >= 0; i1 --){
				System.out.println("Posição: "+i1+ " - Valor : "+array[i1]);
			}
			
			if(array[i] > maior){ 
				maior = array[i];
			}
			
			
	}    
		
		int menor = array[0];
		
		 for (int j = 1; j < array.length; j++) {  
	            if(array[j] < menor){  
	                menor = array[j];  
	            }  
	}
		
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
} }
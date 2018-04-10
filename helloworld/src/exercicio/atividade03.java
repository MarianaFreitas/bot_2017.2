package exercicio;

import java.util.Scanner;

public class atividade03 {
	  public static void main(String[] args){
	       
		  Scanner ent = new Scanner(System.in);
	        
	        double num, soma = 0;
	        int cont = 0;
	        
	        do{
	            System.out.println("Digite um número");
	            num = ent.nextDouble(); 
	            
	            if(num >= 0){ 
	                soma = num + soma; 
	                cont++; 
	            }
	        } while(num > 0); 
	        
	        System.out.println("A soma é " + soma); // soma
	      
	    }
	}


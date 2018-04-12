package exercicio;

import java.util.Scanner;

public class atividade03 {
	  private static Scanner ent;
	  private static int cont;

	public static void main(String[] args){
	       
		  ent = new Scanner(System.in);
	        
	        double num, soma = 0;
	        setCont(0);
	        
	        do{
	            System.out.println("Digite um número");
	            num = ent.nextDouble(); 
	            
	            if(num >= 0){ 
	                soma = num + soma; 
	                setCont(getCont() + 1); 
	            }
	        } while(num > 0); 
	        
	        System.out.println("A soma é " + soma); 
	      
	    }

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		atividade03.cont = cont;
	}
}


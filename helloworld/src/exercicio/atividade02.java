package exercicio;
/*
* Entrada: 3 notas
* Sa�da: m�dia das notas e o conceito
* 
* caso 0 <= m�dia < 4 -> Nota E
* caso 4 <= m�dia < 5 -> Nota D
* caso 5 <= m�dia < 7 -> Nota C
* caso 7 <= m�dia < 8 -> Nota B
* caso 8 <= m�dia <= 10 -> Nota A
*/

import java.util.Scanner;

public class atividade02 {

	private static Scanner ent;

	public static void main(String[] args) {
		 ent = new Scanner(System.in);
	        int nota1, nota2, nota3;
	        int media, i, contAluno = 0;
	        
	        for(i = 0; i < 3; i++){
	            
	            contAluno++;
	            // recebe a 1� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 1� nota");
	            nota1 = ent.nextInt();
	            
	            // recebe a 2� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 2� nota");
	            nota2 = ent.nextInt();
	            
	            // recebe a 3� nota
	            System.out.println("Aluno " + contAluno + ", digite sua 3� nota");
	            nota3 = ent.nextInt();
	            
	            // calcula a m�dia
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A m�dia do aluno " + contAluno + " � " + media);
	            
	            // mostra a nota do aluno
	            if( (media >= 0) && (media <4) ){
	                System.out.println("Aluno Reprovado!");
	            } else if(media < 5){
	                System.out.println("Aluno em Recupera��o!");
	            } else if(media < 7){
	                System.out.println("Aluno Aprovado!");
	            } else if(media < 8){
	                System.out.println("Aluno Aprovado!");
	            } else if(media <= 10){
	                System.out.println("Aluno Aprovado!");
	            }
	        }       
	    }
		
		
	}

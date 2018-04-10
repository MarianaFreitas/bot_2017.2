package exercicio;
/*
* Entrada: 3 notas
* Saída: média das notas e o conceito
* 
* caso 0 <= média < 4 -> Nota E
* caso 4 <= média < 5 -> Nota D
* caso 5 <= média < 7 -> Nota C
* caso 7 <= média < 8 -> Nota B
* caso 8 <= média <= 10 -> Nota A
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
	            // recebe a 1º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
	            nota1 = ent.nextInt();
	            
	            // recebe a 2º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
	            nota2 = ent.nextInt();
	            
	            // recebe a 3º nota
	            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
	            nota3 = ent.nextInt();
	            
	            // calcula a média
	            media = (nota1 + nota2 + nota3) / 3;
	            System.out.println("A média do aluno " + contAluno + " é " + media);
	            
	            // mostra a nota do aluno
	            if( (media >= 0) && (media <4) ){
	                System.out.println("Aluno Reprovado!");
	            } else if(media < 5){
	                System.out.println("Aluno em Recuperação!");
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

package ex;

import java.util.Calendar;
import java.util.Scanner;

public class Ex4 {

	private static Scanner scan;

	public static void main(String[] args) {
			Calendar c1 = Calendar.getInstance();
			int hora = c1.get(Calendar.HOUR_OF_DAY);
			
			scan = new Scanner(System.in);
			System.out.println("Digite seu Nome: ");
			String nome = scan.next();
			System.out.println();
			
			System.out.println(c1.get(Calendar.HOUR_OF_DAY));
			System.out.println(c1.get(Calendar.MINUTE));
			
	if(hora > 6 && hora < 12){
				System.out.println("Bom Dia");
			}else if(hora > 12 && hora < 18){
				System.out.println("Boa Tarde");
			}else{
				System.out.println("Boa Noite");
			}
	
			System.out.println(""+nome);
		}
	}
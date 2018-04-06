package aula04;

import javax.swing.JOptionPane;

public class estruturaDoWhile {
  
	public static void main(String[] args) {
		
		String senha;
		
		do {
		//interface prompt do swing/ awt
			senha = JOptionPane.showInputDialog("informe a senha: ");
		}while(!senha.equals("Senha123"));
	}
}

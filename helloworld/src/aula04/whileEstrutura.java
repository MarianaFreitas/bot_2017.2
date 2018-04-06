package aula04;

import javax.swing.JOptionPane;

public class whileEstrutura {

	public static void main(String[] args) {
		
		String senha;
		
		do {
			senha = JOptionPane.showInputDialog("Informe a senha: ");
		}while(!senha.equals("Senha123"));
		
		JOptionPane.showMessageDialog(null, "Senha Correta!");
	}
}

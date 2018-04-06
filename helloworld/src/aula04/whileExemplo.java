package aula04;

import javax.swing.JOptionPane;

public class whileExemplo {

		public static void main(String[] args) {
			
			String senha;
			
			do {
				senha = JOptionPane.showInputDialog("Informe a senha: ");
				
				if(senha == null)
					break;
				
			}while(!senha.equals("Senha123"));
			
			if(senha != null) {
			
			JOptionPane.showMessageDialog(null, "Senha Correta!");
		}
	}
}
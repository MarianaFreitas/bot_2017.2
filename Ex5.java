package listaEx1;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		String aux1 = JOptionPane.showInputDialog(null,"Forneça o primeiro número: ");
		
		if(aux1 == null)
			System.exit(0);
		
		String aux2 = JOptionPane.showInputDialog(null,"Forneça o segundo número: ");
		
		if(aux2 == null)
			System.exit(0);
		
		String aux3 = JOptionPane.showInputDialog(null,"Menu Calculadora: 1- soma , 2- subtração, 3- multiplicação, 4- divisão, 5- resto da divisão, 6- média e 0 - encerrar programa");
		if(aux3 == null)
			System.exit(0);
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
			String aux31 = "1";
			int es1 = num1 + num2;
			if((es1 + "").equals(aux31)) {
				JOptionPane.showMessageDialog(null, "Soma = " + es1);
			}
		}catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux32 = "2";
		int es2 = num1 - num2;
		if((es2 + "").equals(aux32)) {
			JOptionPane.showMessageDialog(null, "Subtração = " + es2);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
		
		String aux33 = "3";
		int es3 = num1 * num2;
		if((es3 + "").equals(aux33)) {
			JOptionPane.showMessageDialog(null, "Multiplicação = " + es3);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
			
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux34 = "4";
		int es4 = num1 / num2;
		if((es4 + "").equals(aux34)) {
			JOptionPane.showMessageDialog(null, "Divisão = " + es4);
		}	
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux35 = "5";
		int es5 = (num1 % num2);
		if((es5 + "").equals(aux35)) {
			JOptionPane.showMessageDialog(null, "Divisão = " + es5);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux36 = "6";
		int es6 = (num1 + num2)/2;
		if((es6 + "").equals(aux36)) {
			JOptionPane.showMessageDialog(null, "Divisão = " + es6);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores númericos","Erro",JOptionPane.ERROR_MESSAGE);
		}

		System.exit(0);

	}

}
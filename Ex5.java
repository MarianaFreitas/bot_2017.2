package listaEx1;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		String aux1 = JOptionPane.showInputDialog(null,"Forne�a o primeiro n�mero: ");
		
		if(aux1 == null)
			System.exit(0);
		
		String aux2 = JOptionPane.showInputDialog(null,"Forne�a o segundo n�mero: ");
		
		if(aux2 == null)
			System.exit(0);
		
		String aux3 = JOptionPane.showInputDialog(null,"Menu Calculadora: 1- soma , 2- subtra��o, 3- multiplica��o, 4- divis�o, 5- resto da divis�o, 6- m�dia e 0 - encerrar programa");
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
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux32 = "2";
		int es2 = num1 - num2;
		if((es2 + "").equals(aux32)) {
			JOptionPane.showMessageDialog(null, "Subtra��o = " + es2);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
		
		String aux33 = "3";
		int es3 = num1 * num2;
		if((es3 + "").equals(aux33)) {
			JOptionPane.showMessageDialog(null, "Multiplica��o = " + es3);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
			
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux34 = "4";
		int es4 = num1 / num2;
		if((es4 + "").equals(aux34)) {
			JOptionPane.showMessageDialog(null, "Divis�o = " + es4);
		}	
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux35 = "5";
		int es5 = (num1 % num2);
		if((es5 + "").equals(aux35)) {
			JOptionPane.showMessageDialog(null, "Divis�o = " + es5);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			
		String aux36 = "6";
		int es6 = (num1 + num2)/2;
		if((es6 + "").equals(aux36)) {
			JOptionPane.showMessageDialog(null, "Divis�o = " + es6);
		}
		} catch (NumberFormatException Erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas valores n�mericos","Erro",JOptionPane.ERROR_MESSAGE);
		}

		System.exit(0);

	}

}
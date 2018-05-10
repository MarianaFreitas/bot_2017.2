package listaEx1;

import javax.swing.JOptionPane;

public class Ex1 {
	
	public static void main(String[] args) throws NumberFormatException {
	String aux1 = JOptionPane.showInputDialog(null,"Digite o primeiro número:");
	
	if(aux1 == null)
		System.exit(0);
	
	String aux2 = JOptionPane.showInputDialog(null,"Digite o segundo número:");
	
	if(aux2 == null)
		System.exit(0);
	
	try {
		int num1 = Integer.parseInt(aux1);
		int num2 = Integer.parseInt(aux2);
		
		if(num1 >= 100 & num2 <= 200) {
			JOptionPane.showMessageDialog(null,"Números entre 100 e 200");
		}
		
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null,"Número menor que 100 e 200");

	}
	
	System.exit(0);
}
}
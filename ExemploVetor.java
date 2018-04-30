package exemplo;

public class ExemploVetor {
	public static void main(String[] args) {
		int[] numeros = new int[3];
		numeros[0] = 29;
		numeros[1] = 30;
		numeros[2] = 31;
		
		for (int i = 0; i < 3; i++){
			System.out.println(numeros[i]);
		}
		
		for (int i = 0; i < numeros.length; i++){
			System.out.println(i);
		}
		
		for (int i : numeros){
			System.out.println(i);
		}
	}
	
}
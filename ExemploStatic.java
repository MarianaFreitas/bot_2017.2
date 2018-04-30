package exemplo;

public class ExemploStatic {
	final static String nome = "Valor";
	String var1;
	String var2;

	public static void main(String[] args) {
		
		ExemploStatic es1 = new ExemploStatic();
		ExemploStatic es2 = new ExemploStatic();
		
//		es1.nome = "Test";
		es1.var1 = "TestTest";
		es1.var2 = "TestTestTest";
		
//		es2.nome = "Test2";
		es2.var1 = "TesteTeste";
		es2.var2 = "TesteTesteTeste";
		
		System.out.println(es1.nome);
		System.out.println(es1.var1);
		System.out.println(es1.var2);
		
		System.out.println(es2.nome);
		System.out.println(es2.var1);
		System.out.println(es2.var2);
	}
}

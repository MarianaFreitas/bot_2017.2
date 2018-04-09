package entidade;

public class PrincipalCarro {
 
	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.setAno(2018);
		c.setModelo("BMW");
		
		System.out.println("Ano: "+ c.getAno());
		System.out.println("Modelo: " + c.getModelo());
		System.out.println("-------------------------");
		
		Carro c1 = new Carro("Honda",2018,"Azul",20000.00);
		System.out.println(c1);
	}

}

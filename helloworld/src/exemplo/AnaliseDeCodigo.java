package exemplo;

public class AnaliseDeCodigo {

	public static void main(String[] args) {
		
		Integer x = 5;
		Integer y = x;
		Integer z = 0;
		Integer a = ++y;
		z = x + y;
		Integer j = x++;
		Integer w = (x + y + z) * a;
		Integer k = ++w - x++ * z;
		
		System.out.println(x.equals(k));
		System.out.println(y == a);
		System.out.println((z + 6) - 6 == 11);
		System.out.println(a == (3 * 2));
		System.out.println(j == w);
		System.out.println((4 + (w / 2))== k);
		System.out.println(k.equals(73));
		
	}
}

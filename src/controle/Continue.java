package controle;

public class Continue {

	public static void main(String[] args) {
		System.out.println("Somente Pares:");
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------");
		System.out.println("Somente Impares:");
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

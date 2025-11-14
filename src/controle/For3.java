package controle;

public class For3 {

	public static void main(String[] args) {
		
//		int a = 0;
//		for (; a < 10; a++) {
//			System.out.println(a);
//		}
//		
//		System.out.println("Saiu do for...");
//		System.out.println(a);
		
		
		//For duplo
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d, %d]%n", i, j);
			}
			System.out.println();
		}
		
	}

}

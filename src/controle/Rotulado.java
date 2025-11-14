package controle;

public class Rotulado {
	
	// Nao use isso por favor!!!
	
	public static void main(String[] args) {
		
		// Rotulando o break
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				if(i==1) {
					break externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim");
		
		// Rotulando Continue
		externo: for (int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				if(i==1) {
					continue externo;
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim");
	}
}

package controle;

public class DesafioFor {

	public static void main(String[] args) {
		String va = "#";
		for (int i = 0; i <= 5; i++) {
			System.out.println(va);
			va += "#";
		}
		
		// Versao do Desafio
		// Nao pode usar valor numerico para controlar o laco
		String valor = "#";
		String valorFinal = "#";
		String contar = "valor";
		for (String letra : contar.split("")) {
			System.out.println(valorFinal);
			valorFinal += valor;
		}
		
		//Versao correta
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}

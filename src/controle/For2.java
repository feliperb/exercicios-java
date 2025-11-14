package controle;

public class For2 {

	public static void main(String[] args) {
		
		//laco for decrescente, que diminui de 2 em 2 a partir de 10, mostra o zero e sai
		//Valor inicial ; condicao de saida ; o que ocorre no laco
		for (int i = 10; i != 0; i=i-2) {
			System.out.println(i);
		}
		for (int i = 10; i >= 0; i-=2) {
			System.out.println(i);
		}
	}

}

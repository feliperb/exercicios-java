package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class InterfaceSupplier {

	public static void main(String[] args) {
		
		//Sem parametro + Com retorno
		Supplier<String> saudacao = () -> "Oi, meu chapa!";
		System.out.println(saudacao.get());
		
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana", "Bia", "Mia", "Lia");
		
		System.out.println(umaLista.get());
		
	}
}

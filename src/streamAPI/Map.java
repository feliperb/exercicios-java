package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> imprimir = System.out::print;
		
		List<String> marcas = Arrays.asList("Honda ", "Nissan ", "BMW ", "Fiat ");
		
		marcas.stream().map((cada) -> cada.toUpperCase()).forEach(imprimir);
		
//		UnaryOperator<String> maiuscula = cada -> cada.toUpperCase();
//		UnaryOperator<String> primeiraLetra = cada -> cada.charAt(0) + "";
//		UnaryOperator<String> grito = cada -> cada + "!!!";
		
		System.out.println("\n\nUsando Composicao:");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(imprimir);
		
		
		// Composicao em um UNICO DADO
//		String mostre = Utilitarios.maiuscula
//				.andThen(Utilitarios.primeiraLetra)
//				.andThen(Utilitarios.grito)
//				.apply("BMW");
//		System.out.println(mostre);
	}
}

package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {

	public static void main(String[] args) {
		Produto p1 = new Produto("TV", 1500, 0);
		Produto p2 = new Produto("SOM", 1000, 0);
		Produto p3 = new Produto("PC", 3000, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		Function<Produto, String> produtoPreco = produto -> produto.nome + " - " + produto.preco;
		Consumer<String> imprimeProdutos = System.out::println;
		produtos.stream().map(produtoPreco).forEach(imprimeProdutos);
		
		
		/*
		 * 1. Numero para string binaria... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
//		String binario = Integer.toBinaryString(numero);
//		String invertida = new StringBuilder(texto).reverse().toString();
//		int numero = Integer.parseInt(binario, 2);
		
		Consumer<Integer> imprimir = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> toBinario = num -> Integer.toBinaryString(num);
		Function<String, String> inverterString = palavra -> new StringBuilder(palavra).reverse().toString();
		Function<String, Integer> binarioToInteger = bin -> Integer.parseInt(bin, 2);
		
		
		
		nums.stream()
			.map(toBinario)
			.map(inverterString)
			.map(binarioToInteger)
			.forEach(imprimir);
		
		//System.out.println(a.toList());
		
		Integer result = toBinario
				.andThen(inverterString)
				.andThen(binarioToInteger)
				.apply(6);
		
		System.out.println("Um so: " + result);
		
	}
	
}

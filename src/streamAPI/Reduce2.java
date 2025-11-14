package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 1500, 0.10);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0.15);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0.5);
		Produto p6 = new Produto("Celular", 1250, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> temDesconto = produto -> produto.desconto > 0;
		Function<Produto, Double> produtoPreco = produto -> produto.preco;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		Consumer<Double> imprimeProdutos = System.out::println;
		
		produtos.stream()
				.filter(temDesconto)
				.map(produtoPreco)
				.reduce(somatorio)
				.ifPresent(imprimeProdutos);
		
	}
}

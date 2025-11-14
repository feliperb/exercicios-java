package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 1500, 0);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0);
		Produto p6 = new Produto("Celular", 1250, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> filtreCaros = produto -> produto.preco >= 1000;
		Function<Produto, String> produtoPreco = produto -> produto.nome + " - " + produto.preco;
		Consumer<String> imprimeProdutos = System.out::println;
		
		//Filtre todos os produtos acima de 1000 reais
		//Entao imprima "[Produtos] Voces estao caros demais!"
		
		produtos.stream()
			.filter(filtreCaros)
			.map(produtoPreco)
			.forEach(imprimeProdutos);
		
	}
}

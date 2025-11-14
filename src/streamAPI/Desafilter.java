package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafilter {

	public static void main(String[] args) {
		
		/*
		 * 1. Criar 2 funcoes lambda para 2 filtros diferentes
		 * (2 predicates)
		 * Depois 1 MAP (ajeitar uma string resposta
		 * Finalizar imprimindo com foreach
		 * */
		
		Produto p1 = new Produto("TV", 1500, 0.10);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0.15);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0.5);
		Produto p6 = new Produto("Celular", 1250, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> temDesconto = produto -> produto.desconto > 0;
		Predicate<Produto> maisCaros = produto -> produto.preco >= 1000;
		Function<Produto, String> produtoPreco = produto -> produto.nome + " - R$ " + produto.preco + ", descontinho de " + produto.desconto *100 + "%";
		Consumer<String> imprimeProdutos = System.out::println;
		
		produtos.stream()
			.filter(temDesconto)
			.filter(maisCaros)
			.map(produtoPreco)
			.forEach(imprimeProdutos);
		
	}
}

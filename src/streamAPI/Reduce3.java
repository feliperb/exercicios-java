package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		// Calcule a Media dos precos dos produtos com desconto
		
		Produto p1 = new Produto("TV", 1500, 0.10);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0.15);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0.5);
		Produto p6 = new Produto("Celular", 1250, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> temDesconto = produto -> produto.desconto > 0;
		Function<Produto, Double> produtoPreco = produto -> produto.preco;
		BiFunction<Reduce3Media, Double, Reduce3Media> calcularMedia = 
				(media, preco) -> media.add(preco);
		BinaryOperator<Reduce3Media> combinarMedia = 
				(m1, m2) -> Reduce3Media.combinar(m1, m2);
		
		Reduce3Media media = produtos.stream()
			.filter(temDesconto)
			.map(produtoPreco)
			.reduce(new Reduce3Media(), calcularMedia, combinarMedia);
		
		System.out.println("Media dos precos: " + media.getMedia());
	}
}

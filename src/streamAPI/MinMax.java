package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 1500, 0.10);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0.15);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0.5);
		Produto p6 = new Produto("Celular", 1250, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		// Obrigatorio ter Comparator para usar MIN e MAX
		Comparator<Produto> maisCaro = (prod1, prod2) -> {
			if (prod1.preco > prod2.preco) return 1;
			if (prod1.preco < prod2.preco) return -1;
			return 0;
		};
		
		System.out.println(produtos.stream().max(maisCaro).get());
		System.out.println(produtos.stream().min(maisCaro).get());
		
		
	}
}

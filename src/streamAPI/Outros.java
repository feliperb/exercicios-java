package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("TV", 1500, 0.10);
		Produto p2 = new Produto("SOM", 300, 0);
		Produto p3 = new Produto("PC", 3000, 0.15);
		Produto p4 = new Produto("PS4", 2000, 0);
		Produto p5 = new Produto("Cadeira", 500, 0.5);
		Produto p6 = new Produto("Celular", 1250, 0.20);
		Produto p7 = new Produto("PS4", 2000, 0);
		Produto p8 = new Produto("Cadeira", 500, 0.5);
		Produto p9 = new Produto("Celular", 1250, 0.20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);

		System.out.println("Normal...");
		produtos.stream().forEach(System.out::println);
		
		System.out.println("\n Distinct...");
		produtos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\n Skip/Limit:");
		produtos.stream().distinct().skip(2).limit(1).forEach(System.out::println);
	
		System.out.println("\n TakeWhile:"); 
		//Ele para o stream ao encontrar o primeiro elemento que NÃO satisfaz a condição
		produtos.stream().distinct().takeWhile(a -> a.preco >= 300).forEach(System.out::println);
	
	}
}

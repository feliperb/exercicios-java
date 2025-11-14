package lambdas;

import java.util.function.Predicate;

//Interfaces Funcionais - REDICATE: recebe boolean e retorna boolean
public class InterfacePredicate {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				producto -> (producto.preco * (1-producto.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3500.99, 0.15);
		System.out.println(isCaro.test(produto));
		
		
	}
}

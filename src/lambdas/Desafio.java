package lambdas;

import java.util.function.Function;

//Desafio Composicao de Funcoes
public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto, calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500, aplicar (8,5%) de desconto/ < 2500 (Isento)
		 * 3. Frete: 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */
		
		Produto prod = new Produto("Playstation 5", 3235.89, 0.13);
		
		Function<Produto, Double> calcularPrecoReal = 
				produto -> produto.preco * (1 - produto.desconto);
		
		Function<Double, Double> aplicarImpostoMunicipal =
				preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;
		
		Function<Double, Double> calcularFrete =
				preco -> preco >= 3000.00 ? preco + 100.00 : preco + 50.00;
				
		Function<Double, String> formatando = 
				precoFinal -> String.format("O preco final eh R$ %.2f", precoFinal);
				
		String precoFinal = calcularPrecoReal
				.andThen(aplicarImpostoMunicipal)
				.andThen(calcularFrete)
				.andThen(formatando)
				.apply(prod);

		String precoFinal2 = formatando
				.compose(calcularFrete)
				.compose(aplicarImpostoMunicipal)
				.compose(calcularPrecoReal)
				.apply(prod);
		
		System.out.println(precoFinal);
		System.out.println(precoFinal2);
	}
	
}

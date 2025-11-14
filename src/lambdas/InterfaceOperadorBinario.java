package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

//Ambos os parametros + retorno sao do mesmo tipo
// Composicao de Funcoes
public class InterfaceOperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media =
				(a, b) -> (a + b) / 2;
				
		System.out.println(media.apply(9.7, 3.7));
		
		BiFunction<Double, Double, String> aprovados =
			(a, b) -> {
				double notaFinal = (a + b) / 2;
				return notaFinal >= 7 ? "Aprovado!!!" : "Reprovado!!!";
		};
		
		System.out.println(aprovados.apply(9.7, 3.7));
		
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		String resultado = conceito.apply(media.apply(9.7, 3.7));
		String resultado2= media.andThen(conceito).apply(9.7, 4.7);
				
		System.out.println(resultado);
		System.out.println(resultado2);
	}
}

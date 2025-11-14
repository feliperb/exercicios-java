package lambdas;

import java.util.function.Function;

public class InterfaceFuncao {

	public static void main(String[] args) {
		
		//1 parametros + 1 retorno
		Function<Produto, String> pegueNome = p -> {return p.nome;};
		
		Produto p1 = new Produto("Caneta", 12.35, 0.09);
		System.out.println(pegueNome.apply(p1));
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado eh: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
		Function<String, String> duvidoso = 
				valor -> valor + "???";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(50);
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvidoso)
				.apply(50);
		
		System.out.println(resultadoFinal);
		System.out.println(resultadoFinal2);
	}
}

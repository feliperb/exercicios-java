package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		// NAO: int -> Double
		//Double a = 1;
		// double -> Double
		//Double b = 1.0;
		
		BinaryOperator<Double> calcular = (x, y) -> { return x + y; };
		System.out.println(calcular.apply(2.0, 3.0));
		
		calcular = (x, y) -> x * y;
		System.out.println(calcular.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calculando = (x, y) -> { return x + y; };
		System.out.println(calculando.apply(2, 3));
		
		calcular = (x, y) -> x * y;
		System.out.println(calculando.apply(2, 3));
		
	}
}

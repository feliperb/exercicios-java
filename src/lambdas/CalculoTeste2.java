package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		//COM chaves tem return
		//Pode ter bloco com varias sentencas
		Calculo calculo = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calculo.executar(2, 3));
		
		//SEM chaves nao tem return
		//So pode ter 1 sentenca de codigo
		calculo = (x, y) -> x * y;
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.massa());
	}
}

package classe;

public class AreaCircunferencia {

	double raio;
	final static double PI = 3.14; // Static deixara o atributo em ITALICO!
	
	public AreaCircunferencia(double raioInicial) {
		raio = raioInicial;
	}
	
	double calcularAreaCirc() {
		return PI * Math.pow(raio, 2); // pi*raio^2
	}
	
}

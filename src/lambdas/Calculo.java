package lambdas;

//Dependencia principal
//java.util.function

//Interface Funcional so pode ter 1 metodo abstrato
@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);
	
	default double legal() {
		return executar(2, 2);
	}
	
	static String massa() {
		return "Massa demais, doido!";
	}
}

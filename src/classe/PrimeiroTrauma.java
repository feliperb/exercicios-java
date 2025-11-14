package classe;

public class PrimeiroTrauma {
	
	int a = 3;// nao pode mexer nessa linha
	static int b = 4;
	
	public static void main(String[] args) {
		
		// pode mexer somente dentro do main
		PrimeiroTrauma d1 = new PrimeiroTrauma();
		System.out.println(d1.a);
		System.out.println(b);
	}
}

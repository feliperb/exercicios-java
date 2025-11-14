package streamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	//Privado ninguem pode fazer "NEW Utilitarios"
	private Utilitarios() {
		
	}

	public final static UnaryOperator<String> maiuscula = cada -> cada.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = cada -> cada.charAt(0) + "";
	public final static UnaryOperator<String> grito = cada -> cada + "!!!";
	
	public final static String grito(String n) {
		return n + "!!!";
	}
	
	
	
	
}

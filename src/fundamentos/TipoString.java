package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Oi meu chapa!".charAt(1));
		
		String s = "Boa taRde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Felipe %s";
		var sobrenome = "Ribeiro";
		
		String nomeCompleto = String.format(nome, sobrenome);
		
		System.out.println(nomeCompleto);
		
	}
	
	
}

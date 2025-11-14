package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String te = "texto";
		te = te.toUpperCase();
		System.out.println(te);
		
		//Wrappers sao a versao objeto dos tipos primitivos
		int a = 123;
		System.out.println(a);
		
		// 8 tipos primitivos em JAVA:
		//Tipos:    Byte, short, int, long, boolean, char, 
		//Wrappers: BYTE, Short, Integer, Long, Boolean,
		
		//Scanner entrada = new Scanner(System.in);
		
		//Wrappers:
		Byte b = 100;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next()); //int
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.booleanValue());
		//Sem wrapper: boolean bo = true;
		
		Character c = '#';
		System.out.println(c + "...");
		
		
		//entrada.close();
	}
}

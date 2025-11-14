package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Lia", "Bia", "Mia");
		
		System.out.println("Com Foreach:");
		for (String cada : aprovados) {
			System.out.println(cada);
		}
		
		System.out.println("\nCom Iterator:");
		Iterator<String> listaIterator = aprovados.iterator();
		while (listaIterator.hasNext()) {
			System.out.println(listaIterator.next());
		}
		
		System.out.println("\nCom Stream:");
		Stream<String> listaStream = aprovados.stream();
		listaStream.forEach(System.out::println); // Laco interno!!!
		
		
		
	}
}

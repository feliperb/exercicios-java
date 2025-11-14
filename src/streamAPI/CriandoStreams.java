package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		//Recebe 1 param + Nao retorna nada
		Consumer<String> imprimir = System.out::print;
		Consumer<Integer> imprimirln = System.out::println;
		
		Stream<String> linguagens = Stream.of("Red ", "Blue ", "Green\n");
		linguagens.forEach(imprimir);
		
		String[] maisLinguagens = {"Gold ", "Silver ", "Crystal\n"};
		
		Stream.of(maisLinguagens).forEach(imprimir);
		Arrays.stream(maisLinguagens).forEach(imprimir);
		Arrays.stream(maisLinguagens, 0, 3).forEach(imprimir);
		
		List<String> outrasListas = Arrays.asList("Ruby ","Saphire ","Emerald\n");
		outrasListas.stream().forEach(imprimir);
		outrasListas.parallelStream().forEach(imprimir);
		
		Stream.generate(() -> "a").forEach(imprimir); //Usa Interface Supplier
		
		// Gera a partir do zero e incrementa e imprime infinitamente
		Stream.iterate(0, n -> n + 1).forEach(imprimirln);
	}
}

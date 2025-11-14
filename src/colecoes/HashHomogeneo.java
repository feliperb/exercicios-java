package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashHomogeneo {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("Felipe");
		listaAprovados.add("Ana Luiza");
		listaAprovados.add("Naylyne");
		listaAprovados.add("Nadine");
		listaAprovados.add("Melissa");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato); //desordenados
		}
		
		System.out.println("======== ordenados ==========");
		
		SortedSet<String> ordenados = new TreeSet<>();
		ordenados.add("Felipe");
		ordenados.add("Ana Luiza");
		ordenados.add("Naylyne");
		ordenados.add("Nadine");
		ordenados.add("Melissa");
		
		for (String candidato : ordenados) {
			System.out.println(candidato); //ordem alfabetica
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(3);
		nums.add(2);
		nums.add(120);
		nums.add(5);

		for (Integer num : nums) {
			System.out.println(num); //por algum motivo ele ordena Integr
		}
	}
}

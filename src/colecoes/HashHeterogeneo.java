package colecoes;

import java.util.HashSet;
import java.util.Set;

public class HashHeterogeneo {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // ctrl+1 = Suppres warning main()
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);		// double -> Double
		conjunto.add(true); 	// boolean -> Boolean
		conjunto.add("Teste");
		conjunto.add(1); 		// int -> Integer
		conjunto.add('x');		// char -> Character
		
		System.out.println("Tamanho: " + conjunto.size());
		
		conjunto.add(1.2);
		conjunto.add("Teste");
		
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println("Removeu? "+conjunto.remove("Teste"));
		
		System.out.println("Tamanho: " + conjunto.size());
		
		System.out.println("Contains? "+ conjunto.contains("Teste"));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.err.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		System.out.println(conjunto); // nao add 1
		
		conjunto.retainAll(nums); //tirei addAll pra isso funcionar
		System.out.println(conjunto);
	}
}

package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> somaTudo = (ac, i) -> ac + i;
		
		Integer total = nums.stream().reduce(somaTudo).get();
		System.out.println(total);
		
		// Ele soma cada valor +100 e depois soma com o proximo
		Integer total2 = nums.parallelStream().reduce(100, somaTudo);
		System.out.println(total2);
		
		// Resultado foi um Optional<Integer>
		nums.stream()
			.filter(n -> n>5)
			.reduce(somaTudo).ifPresent(System.out::println);
		
		
		
	}
}

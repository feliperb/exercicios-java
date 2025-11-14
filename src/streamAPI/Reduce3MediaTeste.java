package streamAPI;

public class Reduce3MediaTeste {

	public static void main(String[] args) {
		
		Reduce3Media m1 = new Reduce3Media().add(7.9).add(6.6);
		Reduce3Media m2 = new Reduce3Media().add(8.3).add(6.7);
		
		System.out.println(m1.getMedia());
		System.out.println(m2.getMedia());
		
		Reduce3Media result = Reduce3Media.combinar(m1, m2);
		System.out.println(result.getMedia());
	}
}

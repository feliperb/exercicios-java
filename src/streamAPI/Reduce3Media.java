package streamAPI;

public class Reduce3Media {

	private double total;
	private int quantidade;
	
	public Reduce3Media add(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
//	public void adicionar(double valor) {
//		total += valor;
//		quantidade++;
//	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static Reduce3Media combinar(Reduce3Media m1, Reduce3Media m2) {
		Reduce3Media resultante = new Reduce3Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}

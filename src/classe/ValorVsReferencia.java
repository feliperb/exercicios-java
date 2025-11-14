package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuicao por valor (copia do valor)
		
		System.out.println(a + " - " + b);
		a++;
		b--;
		System.out.println(a + " - " + b);
		
		Produto d1 = new Produto("Bone", 10, false);
		Produto d2 = d1; // atribuicao por referencia (o apontamento sera o mesmo) 
		
		System.out.println(d1.nome);
		System.out.println(d2.nome);
		
		d1.nome = "Chapeu";
		
		System.out.println(d1.nome);
		System.out.println(d2.nome);
		
		d2.nome = "Chapelao";
		
		System.out.println(d1.nome);
		System.out.println(d2.nome);
		
		d1 = new Produto("Turbante", 20, false);
		
		System.out.println(d1.nome);
		System.out.println(d2.nome);
	}
}

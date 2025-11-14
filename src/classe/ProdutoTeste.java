package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89, false);
		
		//System.out.println(Produto.desconto);
		
		var p2 = new Produto("Caneta Preta", 12.56, true) ;
		
		//System.out.println(Produto.desconto);
		
		System.out.println(p1.nome + " - " + p1.precoComDesconto() + " - " + p1.desconto);
		System.out.println(p2.nome + " - " + p2.precoComDesconto(0.1) + " - " + p2.desconto);
		//System.out.println(Produto.desconto);
		
	}
}

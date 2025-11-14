package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "Joao";
		compra.adicionarItens("Caneta", 20, 7.5);
		compra.adicionarItens("Borracha", 12, 3.7);
		compra.adicionarItens("Caderno", 3, 18);
		
		System.out.println(compra.itens.size());
		System.out.println(compra.obterValorTotal());
		
		System.out.println(compra.itens.get(0).preco);
	}
}

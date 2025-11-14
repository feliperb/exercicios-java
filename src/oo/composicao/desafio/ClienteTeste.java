package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Felipe");
		
		Produto prod1A = new Produto("Mesa", 200);
		Item item1A = new Item(2, prod1A);
		
		Produto prod1B = new Produto("Cadeira", 25);
		Item item1B = new Item(4, prod1B);
		
		Compra compra1 = new Compra();
		compra1.itens.add(item1A);
		compra1.itens.add(item1B);
		
		
		Produto prod2A = new Produto("TV", 2200);
		Item item2A = new Item(1, prod2A);
		
		Produto prod2B = new Produto("PS4", 1850);
		Item item2B = new Item(2, prod2B);
		
		Compra compra2 = new Compra();
		compra2.itens.add(item2A);
		compra2.itens.add(item2B);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	}
}

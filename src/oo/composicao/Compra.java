package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItens(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item){
		itens.add(item);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.preco * item.quantidade;
		}
		
		return total;
	}
}

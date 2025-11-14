package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens;
	
	Compra() {
		this.itens = new ArrayList<>();
	}
	
	double obterValorTotalDaCompra() {
		double valorTotal = 0;
		for (Item item : itens) {
			valorTotal += item.quantidade * item.produto.preco;
		}
		return valorTotal;
	}
}

package oo.composicao.desafio;

public class Item {
	
	int quantidade;
	Produto produto; //tem o preco
	
	public Item(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
}

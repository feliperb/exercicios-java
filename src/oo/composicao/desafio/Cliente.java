package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras;
	
	Cliente(String nome) {
		this.nome = nome;
		this.compras = new ArrayList<>();
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for (Compra compra : compras) {
			valorTotal += compra.obterValorTotalDaCompra();
		}
		return valorTotal;
	}
}

package classe;

public class Produto {

	String nome;
	double preco;
	double desconto = 0.25;
	
	Produto(String nome, double preco, boolean festividade) {
		this.nome = nome;
		this.preco = preco;
		if(festividade) this.desconto = 0.35;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
	
}

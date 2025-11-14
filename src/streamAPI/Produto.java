package streamAPI;

import java.util.Objects;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		//double precoFinal = preco * (1-desconto);
		return "Nome: " + nome + ", Preco: " + preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(desconto, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Double.doubleToLongBits(desconto) == Double.doubleToLongBits(other.desconto)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
}

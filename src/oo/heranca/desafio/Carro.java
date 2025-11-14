package oo.heranca.desafio;

public abstract class Carro {

	private final int VELOCIDADE_MAX;
	private int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima) { //protected para o filho chamar o super
		VELOCIDADE_MAX = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += 5;			
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual eh " + velocidadeAtual;
	}
}

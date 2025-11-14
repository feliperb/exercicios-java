package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	public Ferrari() {
		super(315);
		delta = 15;
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
	}

	@Override
	public void desligarTurbo() {
		delta = 15;
	}
	
//	@Override
//	public void acelerar() {
//		velocidadeAtual += delta;
//	}
}

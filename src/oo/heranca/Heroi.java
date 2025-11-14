package oo.heranca;

public class Heroi extends Jogador{
	
	public Heroi(int x, int y){
		super(x,y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean atk1 = super.atacar(oponente);
		boolean atk2 = super.atacar(oponente);
		boolean atk3 = super.atacar(oponente);
		return atk1 || atk2 || atk3;
	}
	
	
}

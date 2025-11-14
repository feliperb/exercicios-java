package oo.heranca.jogo;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Vilão;

public class JogadorTeste {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);
		
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.LESTE);
		heroi.andar(Direcao.SUL);
		heroi.andar(Direcao.OESTE);
		
		System.out.println("Heroi: X=" + heroi.x + ", Y=" + heroi.y + ", HP="+ heroi.vida);
		
		Vilão vilao = new Vilão(10, 11);
		
		System.out.println("Vilão: X=" + vilao.x + ", Y=" + vilao.y + ", HP="+ vilao.vida);
		System.out.println("ATACAR!");
		heroi.atacar(vilao);
		System.out.println("Heroi: X=" + heroi.x + ", Y=" + heroi.y + ", HP="+ heroi.vida);
		System.out.println("Vilão: X=" + vilao.x + ", Y=" + vilao.y + ", HP="+ vilao.vida);
		heroi.atacar(vilao);
		System.out.println("Heroi: X=" + heroi.x + ", Y=" + heroi.y + ", HP="+ heroi.vida);
		System.out.println("Vilão: X=" + vilao.x + ", Y=" + vilao.y + ", HP="+ vilao.vida);
		
		vilao.andar(Direcao.NORTE);
		
	}
}

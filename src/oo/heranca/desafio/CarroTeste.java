package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Kicks kicks = new Kicks(150);
		
		kicks.acelerar();
		System.out.println(kicks);
		kicks.acelerar();
		System.out.println(kicks);
		kicks.acelerar();
		System.out.println(kicks);
		
		Ferrari ferrari = new Ferrari();
		
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeDoAr());
		ferrari.frear();
		System.out.println(kicks);
		ferrari.acelerar();
		System.out.println(kicks);
		ferrari.acelerar();
		System.out.println(kicks);
	}
}

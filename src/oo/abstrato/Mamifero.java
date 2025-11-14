package oo.abstrato;

public abstract class Mamifero extends Animal {

	@Override
	public String mamar() {
		return "Com leite";
	}
	
	public abstract String mover();
}

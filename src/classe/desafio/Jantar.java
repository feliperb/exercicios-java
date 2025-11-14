package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("feijao", 0.3);
		Comida c2 = new Comida("arroz", 0.2);
		
		Pessoa p1 = new Pessoa("Felipe", 75);
		
		System.out.println(p1.nome + " -Normal- " + p1.peso);
		p1.comer(c1);
		System.out.println(p1.nome + " -Feijao- " + p1.peso);
		p1.comer(c2);
		System.out.println(p1.nome + " -Arroz- " + p1.peso);
	}

}

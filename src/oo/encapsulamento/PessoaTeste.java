package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Ribeiro", -30);
		//p1.idade = 50; //alterar
		p1.setIdade(230);
		
		System.out.println(p1.getIdade()); //ler
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());
		
		
	}
}

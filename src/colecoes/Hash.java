package colecoes;

import java.util.HashSet;

public class Hash { // Perquisa ais rapido que LIST!!!

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Felipe"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Naylyne"));
		
		boolean result = usuarios.contains(new Usuario("Felipe"));
		System.out.println(result); //ele acha, deixe o hashcode gerado pelo Eclipse
	}
}

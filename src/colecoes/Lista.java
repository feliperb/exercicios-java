package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		//ArrayList ou List = tanto faz
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Felink");
		lista.add(u1);
		lista.add(new Usuario("Zelda"));
		lista.add(new Usuario("Zora"));
		lista.add(new Usuario("Hilda"));
		
		System.out.println(lista.toString());
		
		lista.remove(2);
		lista.remove(new Usuario("Hilda"));
		System.out.println(lista.contains(new Usuario("Zelda")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}
}

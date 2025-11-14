package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.add("Iliada");
		pilha.add("Odisseia");
		pilha.add("Eneida");
		pilha.add("Lusiadas");
		
		for (String livro : pilha) {
			System.out.println(livro); //ordem de cima pra baixo
		}
		
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		
		System.out.println(pilha.poll()); //null se vazio
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.isEmpty());
		//System.out.println(pilha.pop()); //Exception se vazio
	
//		pilha.size();
//		pilha.clear();
//		pilha.contains("O Hobbit");
		
		
	
	}
}

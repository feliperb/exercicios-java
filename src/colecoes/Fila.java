package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionar elementos na fila
		// Quando fila esta cheia
		fila.add("Ana"); // return false
		fila.offer("Bia"); //lanca exception
		fila.add("Lia");
		fila.offer("Mia");
		fila.add("Tia");
		
		// Peek e Element -> apenas ler o primeiro
		//Quando fila vazia
		System.out.println(fila.peek()); //se vazia, return false
		System.out.println(fila.element()); // se vazia, exception
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll()); //ler o primeiro ja removendo
		System.out.println(fila.size());
		System.out.println(fila.remove());//se vazio, exception
		System.out.println(fila.size());
		System.out.println(fila.contains("Ana"));
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		
	}
}

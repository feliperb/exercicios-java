package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.println(" Dia!");
		
		System.out.printf("Megasena: %d %n", 2, 5); //n pula linha
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s tem %d anos.%n", nome, idade);
		entrada.close();
	}
}

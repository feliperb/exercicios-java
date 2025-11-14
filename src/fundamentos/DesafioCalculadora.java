package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + ou - ou * ou / ou %
		// operacao recebendo esses 3 do usuario
		
		String num1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero: ");
		
		String num2 = JOptionPane.showInputDialog(
				"Digite o segundo numero: ");
		
		String operador = JOptionPane.showInputDialog(
				"Digite o operador[+, -, *, /, %]: ");
		
		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
		
		double result = switch (operador) {
			case "+" -> valor1 + valor2;
			case "-" -> valor1 - valor2;
			case "*" -> valor1 * valor2;
			case "/" -> valor1 / valor2;
			case "%" -> valor1 % valor2;
			default -> throw new IllegalArgumentException("Unexpected value: " + operador);
		};
		
		JOptionPane.showMessageDialog(null, "Resultado: " + result);
		System.out.println("Resultado: " + result);
	}
}

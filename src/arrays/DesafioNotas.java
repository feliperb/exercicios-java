package arrays;

import javax.swing.JOptionPane;

public class DesafioNotas {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog(
				"Digite quantas notas: ");
		int tamanhoArray = Integer.parseInt(entrada);
		
		double[] notas = new double[tamanhoArray];
		
		for (int i = 0; i < tamanhoArray; i++) {
			String mensagem = String.format("Digite nota %d: ", i+1);
			String nota = JOptionPane.showInputDialog(
					mensagem);
			notas[i] = Double.parseDouble(nota);
		}
		
		double somaNotas = 0;
		for (double cadaNota : notas) {
			somaNotas += cadaNota;
		}
		
		String result = String.format("Media das Notas: %.2f",  somaNotas / tamanhoArray);
		JOptionPane.showMessageDialog(null, result);
		
	}
}

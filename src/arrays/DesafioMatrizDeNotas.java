package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DesafioMatrizDeNotas {
	public static void main(String[] args) {
		
		//Media das notas da turma inteira
		
		String entradaAlunos = JOptionPane.showInputDialog(
				"Digite quantos alunos: ");
		int tamanhoArrayAlunos = Integer.parseInt(entradaAlunos);
		
		double[][] alunos = new double[tamanhoArrayAlunos][];
			
		String entradaNotas = JOptionPane.showInputDialog(
				"Digite quantas notas cada um tem: ");
		int tamanhoArrayNotas = Integer.parseInt(entradaNotas);
		
		double somaNotas = 0;
		for (int i = 0; i < tamanhoArrayAlunos; i++) {
			double[] notas = new double[tamanhoArrayNotas];
			
			for (int j = 0; j < tamanhoArrayNotas; j++) {
				String mensagem = String.format("Digite nota %d do aluno %d: ", j+1, i+1);
				String nota = JOptionPane.showInputDialog(
						mensagem);
				notas[j] = Double.parseDouble(nota);
				somaNotas += notas[j];
			}
			alunos[i] = notas;
		}
		
		String result = String.format("Media das Notas da Turma: %.2f",  somaNotas / (tamanhoArrayAlunos*tamanhoArrayNotas));
		JOptionPane.showMessageDialog(null, result);
		
		for (double[] ds : alunos) {
			System.out.println(Arrays.toString(ds));
		}
	}
}
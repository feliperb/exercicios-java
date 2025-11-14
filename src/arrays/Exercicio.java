package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println(totalA / notasAlunoA.length);
		
		//----------------------------------------------
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };

		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalB = 0;
		for (double notaB : notasAlunoB) {
			totalB += notaB;
		}
		System.out.println(totalB / notasAlunoB.length);
		
	}
}

package controle;

import javax.swing.JOptionPane;

public class If {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog(
				"Informe a media: ");
		double media = Double.parseDouble(entrada);
		
		if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else if (media <= 5.0) {
			JOptionPane.showMessageDialog(null, "Reprovado!");
		} else {
			JOptionPane.showMessageDialog(null, "Em Recuperacao!");
		}
	}
}
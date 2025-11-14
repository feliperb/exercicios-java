package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito = "";
		String entrada = JOptionPane.showInputDialog(
				"Digite sua nota: ");
		int nota = Integer.parseInt(entrada);
		
		switch (nota) {
			case 10: 
				conceito = "A";
				break;
			case 9: 
				conceito = "B";
				break;
			case 8: 
				conceito = "C";
				break;
			case 7: 
				conceito = "D";
				break;
			case 6:
			case 5:
			default:
				conceito = "E";
		}
		
		JOptionPane.showMessageDialog(null, "Vc tirou: " + conceito);
		
	}
}

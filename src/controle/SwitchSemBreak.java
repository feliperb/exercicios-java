package controle;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...
		String faixa = JOptionPane.showInputDialog(
				"Digite sua faixa: ");
		
		List<String> result = new ArrayList<>();

        switch (faixa.toLowerCase()) {
            case "preta":
                result.add("Bassai-Dai");
            case "marrom":
                result.add("Tekki Shodan");
            case "roxa":
                result.add("Heian Godan");
            case "verde":
                result.add("Heian Yodan");
            case "laranja":
                result.add("Heian Sandan");
            case "vermelha":
                result.add("Heian Nidan");
            case "amarela":
                result.add("Heian Shodan");
                break;
            default:
                result.add("APANHAR!");
        }
		
		JOptionPane.showMessageDialog(null, "Vc sabe: " + result);
		
				
	}
}

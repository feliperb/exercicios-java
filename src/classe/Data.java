package classe;

public class Data {

	int dia = 1;
	int mes = 1;
	int ano = 1970;
	
	Data(){
		// Valores padrao
		//int => 0
		//double => 0.0
		//char => /u0000 (tabela unicode)
		//boolean => false
		//String e Objetos => null
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.err.println(String.format("%d/%d/%d", dia, mes, ano));
	}
}

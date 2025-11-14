package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(21, 06, 1990);
		
		var d2 = new Data();
		d2.imprimirDataFormatada();
		
		d2.dia = 04;
		d2.mes = 11;
		d2.ano = 2025;
		
		System.out.printf(d1.obterDataFormatada());
		System.out.println();
		d2.imprimirDataFormatada();
	}

}

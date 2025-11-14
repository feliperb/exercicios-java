package classe;

public class AreaCircunferenciaTeste {

	public static void main(String[] args) {
		
		AreaCircunferencia area = new AreaCircunferencia(10);
		//area.PI = 10; //Errado, a chamada so pode ser acessada via statica (via classe, nao instancia)
		//AreaCircunferencia.PI = 0; //"final" nao deixa mudar o valor
		System.out.println(area.calcularAreaCirc());
		System.out.println(area.PI); // forma errada
		System.out.println(AreaCircunferencia.PI); //forma correta
	}
}

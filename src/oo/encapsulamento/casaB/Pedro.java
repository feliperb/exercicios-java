package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	Ana anaMae = new Ana();

	void testeAcessos() {
		//System.out.println(anaMae.segredo);
		//System.out.println(anaMae.facoDentroDeCasa);
		//System.out.println(anaMae.formaDeFalar);//Heranca nao permite acessar via composicao
		System.out.println(formaDeFalar); //Somente via heranca
		System.out.println(anaMae.todosSabem);
		
	}
	
	
}

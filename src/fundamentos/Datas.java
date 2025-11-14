package fundamentos;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		//Deprecated
		//Date d = new Date();
		//int dia = d.getDay();
		
		Date d = new Date();
		LocalDate localDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		int dia = localDate.getDayOfMonth();
		Month mes = localDate.getMonth();
		int ano = localDate.getYear();
		int diaDoAno = localDate.getDayOfYear();
		int valorMes = localDate.getMonthValue();
		System.out.println(dia);
		System.out.println(mes);
			System.out.println(valorMes); //Da no mesmo
			System.out.println(mes.getValue()); //Numero do Mes
		System.out.println(mes.maxLength()); //Quantos dias tem o Mes
		System.out.println(ano);
		System.out.println(diaDoAno);
		System.out.println(localDate);
		
	}
}
package br.com.jdev.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simple.parse("12/08/2023");
		
		Date dataAtual = simple.parse("13/08/2023");
		
		/*Se a data 1 for maior que a data 2*/
		if (dataVencimentoBoleto.before(dataAtual)) { /*Posterior ou maior ou depois da data atual*/
			System.out.println("Bolet vencido - URGENTE");
		} else {
			System.out.println("Boleto não vencido");
		}
		
	}

}

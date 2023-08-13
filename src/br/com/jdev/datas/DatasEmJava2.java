package br.com.jdev.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava2 {
	
	public static void main(String[] args) throws ParseException {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias de uma até hoje*/
		
		System.out.println("Possuí " + dias + " entre a faixa de data");
		
	}
	
}

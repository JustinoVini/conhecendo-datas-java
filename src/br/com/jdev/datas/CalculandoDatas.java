package br.com.jdev.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculandoDatas {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); /* pega a data atual */
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("13-08-2023"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println("Somando o dia do mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mês " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando o ano " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}

package br.com.jdev.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava4 {
	
	public static void main(String[] args) {
		
		/*API java para time*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("A data atual é: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("A hora atual é: " + horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e Hora atual: " + dataAtualHoraAtual);
		
	}
	
}

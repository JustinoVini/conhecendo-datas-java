package br.com.jdev.datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DatasEmJava6 {
	
	public static void main(String[] args) throws ParseException, InterruptedException {
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant iFinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Duração em nanosegundos" + duracao.toNanos());
		
		System.out.println("Duração em minutos" + duracao.toMinutes());
		
		System.out.println("Duração em horas" + duracao.toHours());
		
		System.out.println("Duração em milisegundos" + duracao.toMillis());

		System.out.println("Duração em dias" + duracao.toDays());
	}
	
}

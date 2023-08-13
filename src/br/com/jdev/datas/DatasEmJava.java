package br.com.jdev.datas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) {
    	
    	Calendar calendar = Calendar.getInstance();
    	
        Date date = new Date();

        System.out.println("Datas em milisegundos " + date.getTime());

        System.out.println("Dia do mês " + date.getDate());

        System.out.println("Dia da semana " + date.getDay());

        System.out.println("hora do dia " + date.getHours());

        System.out.println("Minuto da hora " + date.getMinutes());

        System.out.println("Segundos da hora " + date.getSeconds());

        System.out.println("Ano " + (date.getYear() + 1900));
        
        System.out.println("=======================================================");
        
        System.out.println("Datas em milisegundos do Calendar " + calendar.getTimeInMillis());
        
        System.out.println("Dia do mês do Calendar " + calendar.get(Calendar.DAY_OF_MONTH));
        
        System.out.println("Dia da semana do Calendar " + calendar.get(Calendar.DAY_OF_WEEK - 1));
        
        System.out.println("hora do dia do Calendar " + calendar.get(Calendar.HOUR_OF_DAY));
        
        System.out.println("Minuto da hora do Calendar " + calendar.get(Calendar.MINUTE));
        
        System.out.println("Segundos da hora do Calendar " + calendar.get(Calendar.SECOND));
        
        System.out.println("Ano do Calendar " + calendar.get(Calendar.YEAR));
        
        /*Simple date format*/
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // passando um padrão para o simple date format para salvar em bd

        System.out.println(simpleDateFormat.format(date));
        
        System.out.println("Calendar hora formatada " + simpleDateFormat.format(calendar.getTime()));
        
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // formato padrão banco de dados
        
        System.out.println("Data em formato de banco de dados: " + simpleDateFormat.format(date));
        
        
    }

}

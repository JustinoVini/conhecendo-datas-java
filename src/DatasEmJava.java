import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Datas em milisegundos " + date.getTime());

        System.out.println("Dia do mês " + date.getDate());

        System.out.println("Dia da semana " + date.getDay());

        System.out.println("hora do dia " + date.getHours());

        System.out.println("Minuto da hora " + date.getMinutes());

        System.out.println("Segundos da hora " + date.getSeconds());

        System.out.println("Ano " + (date.getYear() + 1900));

    }

}

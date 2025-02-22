package crud.primeiro.javaweb.introducao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        DayOfWeek diaAtual = LocalDate.now().getDayOfWeek();
        String mensagem = "";

        switch (diaAtual) {
            case MONDAY -> mensagem = "Olá, Segunda-feira!";
            case TUESDAY -> mensagem = "Olá, Terça-feira!";
            case WEDNESDAY -> mensagem = "Olá, Quarta-feira!";
            case THURSDAY -> mensagem =  "Olá, Quinta-feira";
            case FRIDAY -> mensagem = "Olá, Sexta-feira!";
            case SATURDAY -> mensagem = "Olá, Sábado";
            case SUNDAY -> mensagem = "Olá, Domingo!";
            default -> mensagem = "Algo deu errado";
        }
        System.out.println(mensagem);
    }
}

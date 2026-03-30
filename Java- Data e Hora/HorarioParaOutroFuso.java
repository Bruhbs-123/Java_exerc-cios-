/*
Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália. Como os horários variam de acordo com o fuso horário, você precisa de um sistema que converta automaticamente o horário local para o horário de Sydney.

Crie um programa que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney (Australia/Sydney) e exiba apenas as horas e os minutos. Dica: Utilize o método withZoneSameInstant() para realizar a conversão.
 */

import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalTime;

public class HorarioParaOutroFuso {
    public static void main (String []args){
        ZonedDateTime horarioSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horarioSydneyFormatado = horarioSydney.format(formatter);
        LocalTime horarioAtual = LocalTime.now();
        String horarioAtualFormatado = horarioAtual.format(formatter);

        System.out.println("Horário atual no sistema: " + horarioAtualFormatado);
        System.out.println("Horário atual em Sydney: " + horarioSydneyFormatado);
    }
}

/*
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horário atual no sistema: " + horarioSistema.format(formatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatter));
    }
}
 */
/*
Você trabalha no setor administrativo de uma empresa e precisa de um sistema para acompanhar os horários de entrada e saída dos funcionários. O sistema deve calcular o horário de saída com base na hora de entrada e na carga horária diária.

Além disso, para controle de banco de horas, o sistema deve calcular quantas horas um funcionário trabalhou a mais ou a menos, caso o expediente tenha durado mais ou menos que o previsto.

O programa deve:

    Capturar o horário de entrada.
    Adicionar a carga horária diária para calcular o horário de saída previsto.
    Capturar o horário real de saída
    Calcular a diferença entre o tempo trabalhado e a carga horária.
    Exibir as informações formatadas corretamente.
 */

import java.time.Duration;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class ControleDeExpediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHorariaDiaria = scanner.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHorariaDiaria);

        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída prevista: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}

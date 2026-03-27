/*Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento. Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:

    Receba dois horários representando o início e o término de uma atividade.
    Calcule a diferença em horas e minutos entre esses dois horários.    Exiba o resultado formatado.

*/


import java.time.LocalTime;
import java.time.Duration;

public class DiferençaEntreHoras {
    public static void main(String[] args) {
        LocalTime horarioInicio = LocalTime.of(19, 30, 0);
        LocalTime horarioTermino = LocalTime.of(23, 20, 0);

        Duration duracao = Duration.between(horarioInicio, horarioTermino);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");
    }
}

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

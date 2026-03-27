import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDateEHora {
    public static void main(String[] args) {
    LocalDate dataAtual = LocalDate.now();
    LocalTime horaAtual = LocalTime.now();

    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH-mm");

    String dataFormatada = dataAtual.format(formatoData);
    String horaFormatada = horaAtual.format(formatoHora);

    System.out.println("Data formatada: " + dataFormatada);
    System.out.println("Hora formatada: " + horaFormatada);
    }
}
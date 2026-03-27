import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class dataVencimento {
    public static void main (String []args){
        LocalDate dataVencimento = LocalDate.of(2026, 8, 15);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite em quantos meses deseja pagar a fatura. ");
        int meses = scanner.nextInt();

        LocalDate dataAjustada = dataVencimento.plusMonths(meses);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataAjustada.format(formatter);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }

}


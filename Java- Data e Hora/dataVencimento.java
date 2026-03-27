/*   
Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar o vencimento das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento, e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.

Crie um programa que:

    Receba uma data de vencimento original.
    Adicione um número de meses ao vencimento.
    A data ajustada deve ser exibida no formato dd-MM-yyyy.
*/
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


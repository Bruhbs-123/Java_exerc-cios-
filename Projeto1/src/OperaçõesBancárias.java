import java.util.Scanner;
public class OperaçõesBancárias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String conta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("\nDados iniciais do cliente");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("\n***********************\n");
        String menu = """
                Digite sua opção
                
                
                1- Consultar saldos
                2- Transferir valor
                3- Receber valor
                4- Sair                                              
                """;


        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("O seu saldo é " + saldo);
            } else if (opcao == 2) {
                System.out.println("\n Qual o valor que deseja transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("\n Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
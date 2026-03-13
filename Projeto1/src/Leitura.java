import java.util.Scanner;
public class Leitura {
    public static void main (String [] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade");
        int idade = leitura.nextInt();
    }
}

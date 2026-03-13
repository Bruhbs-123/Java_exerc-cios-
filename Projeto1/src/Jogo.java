import java.util.Random;
import java.util.Scanner;
public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Jogo da adivinhação: Tente acertar o número entre 0 e 100 em até 5 tentativas:\n  ");
            int random = new Random().nextInt(100);
            int numero = 0;


            for (int i = 1; i < 6; i++) {
                System.out.print("Tentativa " + i + "  \n");
                numero = scanner.nextInt();

                        if (numero > random) {
                            System.out.print("O número " + numero + " é maior que o número escolhido  \n");
                        } else if (numero < random) {
                            System.out.print("O número " + numero + " é menor que o número escolhido  \n");
                        } else if (numero == random) {
                            System.out.print("Parabéns! Você acertou! ");
                            break;

                        }



                } System.out.println("Você perdeu! O número sorteado era " + random);
            }
        }
    }













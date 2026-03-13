import java.util.Scanner;

public class Loop {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        double media = 0;
        double nota = 0;

        for (int i=0; i < 3 ; i++) {
            System.out.println("Avalie o filme");
            nota = scanner.nextDouble();
            media = scanner.nextDouble();

        }
        System.out.println("Média das avaliações" + media/3);
    }

}

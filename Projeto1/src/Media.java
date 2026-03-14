import java.util.Scanner;
public class Media {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite uma nota (0 a 10): ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite outra nota (0 a 10) : ");
        double nota2 = scanner.nextDouble();
        if (nota1 > 10 && nota2 > 10){
            System.out.println("Nota inválida ");
        }
        double media = (nota1 + nota2)/2;
        System.out.println("A média do estudante é "+ media);

        if (media >= 7.0) {
            System.out.println("Estudante aprovado ");
        }else if (5 < media && media < 6.9) {
            System.out.println("Estudante de recuperação ");
        }else
            System.out.println("Estudante reprovado ");
    }

}

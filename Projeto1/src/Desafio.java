public class Desafio {
    //Questão 1
    public static void main (String [] args) {
        double nota1 = 5.2;
        double nota2 = 7.9;
        double media = (nota1 + nota2)/2;
        String mensagem = String.format("A média das notas %f e %f é de %2f", nota1, nota2, media);
        System.out.println(mensagem);

        //Questão 2

        double variavel1 = 4.2;
        int numeroInt = (int) variavel1;
        System.out.println(numeroInt);

        //Questao 3

        char letra = 'A';
        String palavra = "bacaxi";
        System.out.println(letra + palavra);

        //Questão 4

        double precoProduto = 20.5;
        int quantidade = 4;
        double valor = precoProduto * quantidade;
        System.out.print("O valor total é " + valor + " reais");

        //Questão 5

        double valorEmDolares = 1.99;
        double valorEmReal = valorEmDolares * 4.94;
        System.out.println("A conversão de " + valorEmDolares + " dolares em reais é de "+ valorEmReal);

        //Questão 6

        double precoOriginal = 66.2;
        double percentualDesconto = 20.0;








    }

}

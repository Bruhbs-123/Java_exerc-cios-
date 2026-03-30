/*
Você deseja analisar as notas dos alunos e alunas em uma disciplina para entender melhor o desempenho da turma. Além da média, você também quer saber a menor e a maior nota para ter um panorama completo. Para isso, você deve criar um programa que seja capaz de:

    Criar uma lista contendo as notas dos alunos.
    Utilizar reduce() para calcular a soma total das notas.
    Calcular a média das notas.
    Determinar a menor e a maior nota da lista. Dica: use a função max e min da classe Stream.
    Exibir os resultados no console.
 */
import java.util.List;

public class CalculandoNotas {
    public static void main (String []args){
        List <Double> notas = List.of(7.5, 80.0, 6.5, 9.0, 10.0);
        double somaTotal = notas.stream()
                .reduce(0.0, Double::sum);
        double media = somaTotal / notas.size();
        double menorNota = notas.stream().min(Double::compare).get();
        double maiorNota = notas.stream().max(Double::compare).get();

        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);


    }

}

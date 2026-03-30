/*
Você está trabalhando no sistema de gestão de uma escola, garantindo que a lista de estudantes esteja sempre correta. Durante uma revisão nos cadastros, percebeu que um nome foi adicionado incorretamente: “Pedro”. Para evitar confusões na emissão de certificados e registros, você precisa corrigir essa informação imediatamente.

Sua tarefa é remover o nome “Pedro” da lista. Considere que a lista inicial possui os seguintes nomes: Joana, Lucas, Pedro e Antônio.
 */

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main (String []args){
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Joana");
        estudantes.add("Lucas");
        estudantes.add("Pedro");
        estudantes.add("Antônio");

        System.out.println("Lista inicial: " + estudantes);

        estudantes.remove("Pedro");

        System.out.println("Lista após a exclusão: " + estudantes);
    }
}

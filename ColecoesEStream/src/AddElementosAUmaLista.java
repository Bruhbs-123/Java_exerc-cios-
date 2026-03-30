/*
Você está desenvolvendo um sistema para gerenciar os nomes dos funcionários de uma empresa de tecnologia. O sistema precisa permitir que novos funcionários sejam adicionados a uma lista de nomes.

Sua tarefa é criar uma lista de strings e adicionar os nomes dos funcionários "João", "Maria", " Vitor" e “Ana” a essa lista. Depois, imprima a lista para verificar se os nomes foram adicionados corretamente.
 */

import java.util.ArrayList;
import java.util.List;

public class AddElementosAUmaLista {
    public static void main (String []args ){
        List <String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println(funcionarios);
    }
}

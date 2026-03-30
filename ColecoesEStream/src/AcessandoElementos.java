/*
Você faz parte da equipe de tecnologia de uma empresa que precisa garantir que o cadastro de funcionários esteja sempre atualizado. Hoje, você recebeu uma solicitação para manter o controle de acesso à empresa. Para isso, seu código deve ser capaz de:

    Verificar quantos funcionários estão registrados
    Descobrir o nome do segundo funcionário da lista
 */
import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {
    public static void mian(String []args){
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionários: " + funcionarios.size());
    }
}

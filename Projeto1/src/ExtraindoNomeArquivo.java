import java.util.Scanner;
public class ExtraindoNomeArquivo {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1){
            String nomeSemExtensao = arquivo.substring(0,posicaoPonto );
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
            scanner.close();

        }


    }


}

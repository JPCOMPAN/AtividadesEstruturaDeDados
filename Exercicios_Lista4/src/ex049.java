import java.util.Scanner;

public class ex049 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o nome numero %d:%n", i + 1);
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Digite o nome para procurarmos na lista: ");
        String nomeProcurado = scanner.nextLine();
        int posicaoNome = 1;
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                posicaoNome = i + 1;
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.printf("O nome %s foi encontrado na posição %d!", nomeProcurado, posicaoNome);
        } else {
            System.out.print("-1");
        }
    }
}

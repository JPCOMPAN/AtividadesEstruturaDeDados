
// PROGRAMA QUE LÊ O VALOR DA TAXA FIXA E ACRESCENTA 20% DE GORJETA E IMPRIME O VALOR //

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        double totalInicial, totalFinal;
        int porcetagem;
        porcetagem = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da conta para aplicarmos a taxa: ");
        totalInicial = scanner.nextDouble();
        totalFinal = totalInicial + (totalInicial * porcetagem / 100);
        System.out.printf("O valor da conta com a taxa: R$%.2f ", totalFinal);
    }
}

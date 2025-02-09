// PROGRAMA QUE RECEBE UM VALOR EM REAIS QUE O USUARIO POSSUI E CONVERTE PARA QUATRO MOEDAS DIFERENTES //

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        double carteira, europa, canada, eua, argentina;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo em reais que você possui na sua carteira: ");
        carteira = scanner.nextDouble();
        europa = carteira / 5.99;
        canada = carteira / 4.24;
        eua = carteira / 5.81;
        argentina = carteira * 162;
        System.out.printf("Valores do seu saldo convertido nas seguintes localidades: %n");
        System.out.printf("Saldo: R$%.2f%n", carteira);
        System.out.printf("Europa: €%.2f %n" , europa);
        System.out.printf("Canadá: C$%.2f%n", canada);
        System.out.printf("Estados Unidos: $%.2f %n", eua);
        System.out.printf("Argentina: AR$%.2f%n", argentina);
    }
}

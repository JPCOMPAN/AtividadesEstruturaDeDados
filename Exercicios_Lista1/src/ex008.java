import java.util.Scanner;

public class ex008 {
    public static void main (String[]args) {
        double mercado1, mercado2, mercado3, mercado4, mercado5, precoMedio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço dos produtos presentes nos 5 mercados para calcurlarmos a média: ");
        mercado1 = scanner.nextDouble();
        mercado2 = scanner.nextDouble();
        mercado3 = scanner.nextDouble();
        mercado4 = scanner.nextDouble();
        mercado5 = scanner.nextDouble();
        precoMedio = (mercado1 + mercado2 + mercado3 + mercado4 + mercado5) / 5;
        System.out.printf("A média de preços dos produtos é: R$%.2f ", precoMedio);

    }
}

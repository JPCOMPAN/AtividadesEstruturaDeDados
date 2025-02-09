import java.util.Scanner;

public class EstruturaSelecao_exemplo {
    public static void main(String[]args)  {
        Scanner scanner = new Scanner(System.in);
        double saldo, valorTransferido;
        System.out.println("Digite o seu saldo em conta: ");
        saldo = scanner.nextDouble();
        System.out.println("Digite o valor que você quer transferir: ");
        valorTransferido = scanner.nextDouble();
        if ( saldo >= valorTransferido) {
            saldo = saldo - valorTransferido;
            System.out.printf("Você transferiu R$ %.2f", saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }

    }
}

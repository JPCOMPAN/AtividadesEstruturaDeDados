import java.util.Scanner;

public class ex037 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int bagagemAtual = 0;
        double pesoTotal = 0, mediaPeso, precoBagagem;
        while(true){
            System.out.printf("Digite o peso da bagagem %d (OU DIGITE O NUMERO 0 PARA CANCELAR): ", (bagagemAtual + 1));
            double pesoBagagens = scanner.nextDouble();
            if(pesoBagagens == 0){
                break;
            }
            bagagemAtual++;
            pesoTotal += pesoBagagens;
        }
        mediaPeso = pesoTotal / bagagemAtual;
        precoBagagem = (pesoTotal / 10) * 10;
        System.out.printf("\nMedia de peso das bagagens: %.2fkg\nPeso total das bagagens: %.2fkg\nPreço a ser pago: R$%.2f", mediaPeso, pesoTotal, precoBagagem);

    }
}
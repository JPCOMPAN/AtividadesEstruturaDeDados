import java.util.Scanner;

public class ex032 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int pontuacaoVencedora = 0;
        while(true){
            System.out.println("Digite a quantidade de pontos do jogador 1: ");
            int pontuacaoJogador = scanner.nextInt();
            if (pontuacaoJogador <= -1) {
                break;
            }
            pontuacaoVencedora += pontuacaoJogador;
        }
        System.out.printf("A pontuação vencedora é: %d pontos", pontuacaoVencedora);
    }
}

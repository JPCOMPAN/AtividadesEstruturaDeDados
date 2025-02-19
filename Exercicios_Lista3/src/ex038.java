import java.util.Scanner;

public class ex038 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int jogadores = 6, valorMaior = Integer.MIN_VALUE, jogadorMaiorJogada = 0;

        for(int i = 1; i <= jogadores; i++){
            System.out.printf("Digite o valor do jogador do jogador %d:", i);
            int valor = scanner.nextInt();

            if (valor > valorMaior){
                jogadorMaiorJogada = i;
                valorMaior = valor;
            }
        }
        System.out.printf("Jogador: %d\nPontuação: %d pontos", jogadorMaiorJogada, valorMaior);
    }
}

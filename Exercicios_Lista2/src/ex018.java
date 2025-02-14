//JOGO DE TABULEIRO

import java.util.Scanner;

public class ex018 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int dadoJogador1, dadoJogador2;
        System.out.println("Digite o número no dado de 6 lados do jogador 1:");
        dadoJogador1 = scanner.nextInt();
        System.out.println("Digite o número no dado de 6 lados do jogador 2:");
        dadoJogador2 = scanner.nextInt();
         if (dadoJogador1 < 1 || dadoJogador1 > 6 || dadoJogador2 < 1 || dadoJogador2 > 6)   {
            System.out.print("Número invalido");
        } else if (dadoJogador1 > dadoJogador2) {
            System.out.printf("O número do dado do jogador 1: (%d) é superior ao numero " +
            "do dado do jogador 2: (%d)", dadoJogador1,dadoJogador2);
            System.out.print("\nÉ a vez do jogador 1");
        } else if (dadoJogador2 > dadoJogador1) {
            System.out.printf("O número do dado do jogador 2: (%d) é superior ao numero " +
            "do dado do jogador 1: (%d)", dadoJogador2,dadoJogador1);
            System.out.print("\nÉ a vez do jogador 2");
        }  else {
             System.out.print("O número de ambos jogadores foram iguais nenhum dos jogadores joga!");
         }
    }
}

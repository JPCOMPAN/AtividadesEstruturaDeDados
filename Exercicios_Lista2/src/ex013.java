//PROGRAMA QUE RECEBE VALORES JOGADOS EM UM JOGO DE PAR OU IMPAR E VERIFICA SE O VALOR DE CADA JOGADOR É PAR OU IMPAR

import java.util.Scanner;

class ex013 {
    public static void main(String[]args){
        int jogador1, jogador2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dedos o jogador 1 jogou: ");
        jogador1 = scanner.nextInt();
        System.out.println("Quantos dedos o jogador 2 jogou: ");
        jogador2 = scanner.nextInt();
        if (jogador1 + jogador2 <= 20) {
           if ((jogador1 + jogador2) % 2 == 0) {
               System.out.printf("O jogador 1 jogou %d dedos e o jogador 2 %d dedos o resultado é par", jogador1, jogador2);
           } else {
               System.out.printf("O jogador 1 jogou %d dedos e o jogador 2 %d dedos o resultado é impar", jogador1, jogador2);
           }
        }
        else {
            System.out.print("Não é possivel 2 jogadores possuirem mais de 20 dedos");
            }

    }
}

//PROGRAMA QUE RECEBE VALORES JOGADOS EM UM JOGO DE PAR OU IMPAR E VERIFICA SE O VALOR DE CADA JOGADOR É PAR OU IMPAR

import java.util.Scanner;

class ex013 {
    public static void main(String[]args){
        int jogador1, jogador2, divisor = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dedos o jogador 1 jogou: ");
        jogador1 = scanner.nextInt();
        System.out.println("Quantos dedos o jogador 2 jogou: ");
        jogador2 = scanner.nextInt();
        if (jogador1 + jogador2 <= 20)
            if (jogador1 % divisor == 0 && jogador2 % divisor == 0) {
                System.out.print("O número de dedos que ambos jogadores jogaram é par!");
            } else if (jogador1 % divisor != 0 && jogador2 % divisor != 0){
                System.out.println("O número de dedos que ambos jogadores jogaram é ímpar!");
            } else if (jogador1 % divisor == 0) {
                System.out.print("O número de dedos que o jogador 1 jogou é par " +
                "e o número de dedos que o jogador 2 jogou é impar !");
            } else {
                System.out.print("O número de dedos que o jogador 1 jogou é ímpar " +
                "e o número de dedos que o jogador 2 jogou é par !"); }
        else {
            System.out.print("Não é possivel 2 jogadores possuirem mais de 20 dedos");
            }

    }
}

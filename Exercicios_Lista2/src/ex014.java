// PROGRAMA QUE RECEBE A NOTA DE TRÊS AVALIAÇÕES CALCULA A MEDIA E VERIFICA SE A MEDIA É CAPAZ DE SER APROVADO

import java.util.Scanner;

public class ex014 {
    public static void main(String[]args) {
        double avaliacao1, avaliacao2, avaliacao3, media = 7.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua nota nas três avaliações: ");
        avaliacao1 = scanner.nextDouble();
        avaliacao2 = scanner.nextDouble();
        avaliacao3 = scanner.nextDouble();
        if ( ((avaliacao1 + avaliacao2 + avaliacao3) / 3) >= media){
            System.out.println("Você está aprovado!");
        }
        else {
            System.out.println("Você está reprovado!");
        }
    }
}

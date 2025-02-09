//PROGRAMA QUE CALCULA A VELOCIDADE MEDIA COM BASE NA DISTANCIA EM METROS PERCORRIDA E NO TEMPO EM SEGUNDOS//

import java.util.Scanner;

public class ex009 {
    public static void main(String[]args){
        double distancia, tempo, velocidadeMedia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em metros: ");
        distancia = scanner.nextDouble();
        System.out.println("Digite o tempo em segundos: ");
        tempo = scanner.nextDouble();
        velocidadeMedia = distancia / tempo;
        System.out.printf("Velocidade média percorrida: %.2fm/s", velocidadeMedia);

    }
}

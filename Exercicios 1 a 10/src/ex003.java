
// PROGRAMA QUE LÊ QUANTOS METROS DE LARGURA E ALTURA E IMPRIME A ÁREA TOTAL EM METROS QUADRADOS //

import java.util.Scanner;

public class ex003 {
    public static void main(String [] args){
        double area, largura, comprimento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento do terreno em metros: ");
        comprimento = scanner.nextDouble();
        System.out.println("Digite a largura do terreno em metros: ");
        largura = scanner.nextDouble();
        area = largura * comprimento;
        System.out.println("A área total do terreno é: " + area + "m²");
    }
}

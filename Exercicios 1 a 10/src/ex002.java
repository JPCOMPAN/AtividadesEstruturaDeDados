import java.util.Scanner;

// Programa que recebe a altura e o peso do usuario e calcula seu IMC //

public class ex002 {
    public static void main(String [] args){
        double peso, altura, imc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura:");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu imc é: %.2f", imc);
    }
}

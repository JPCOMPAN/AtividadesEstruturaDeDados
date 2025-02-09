// PROGRAMA QUE LÊ O VALOR TOTAL DA CONTA E QUANTAS PESSOAS ESTÃO PRESENTES (PORÉM UMA DELAS NÃO PAGA) //

import java.util.Scanner;

public class ex007 {
    public static void main(String[]args){
        double conta, pessoas, valorFinal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total da conta: ");
        conta = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas presentes: ");
        pessoas = scanner.nextDouble();
        valorFinal = (conta) / (pessoas - 1);
        System.out.printf("O valor a ser pago por cada pessoa é: R$%.2f ", valorFinal);
    }
}

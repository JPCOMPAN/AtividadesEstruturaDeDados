// PROGRAMA QUE RECEBE QUADRADOS DE UMA ÁREA A SER PINTADA CONSIDERANDO UM NUMERO EXPECIFICO DE TINTA E O PREÇO //


import java.util.Scanner;

public class ex010 {
    public static void main(String[]args) {
        double litrosNecessarios, precoLatas, precoGaloes, precoMistura, restante;
        int latas, galoes, latasMistura, galoesMistura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();
        scanner.close();
        area *= 1.1;
        litrosNecessarios = area / 6;
        latas = (int) Math.ceil(litrosNecessarios / 18);
        precoLatas = latas * 80;
        galoes = (int) Math.ceil(litrosNecessarios / 3.6);
        precoGaloes = galoes * 25;
        latasMistura = (int) (litrosNecessarios / 18);
        restante = litrosNecessarios - (latasMistura * 18);
        galoesMistura = (int) Math.ceil(restante / 3.6);
        precoMistura = (latasMistura * 80) + (galoesMistura * 25);
        System.out.println("A. Comprando apenas latas de 18L o total de tinta será: " + latas + " latas e o preço: R$" + precoLatas);
        System.out.println("B. Comprando apenas galões de 3,6L o total da tinta será: " + galoes + " galões e o preço R$" + precoGaloes);
        System.out.println("C. Misturando para obter o melhor preço teremos " + latasMistura + " latas e " + galoesMistura + "galões e o preço R$" + precoMistura);
    }
}

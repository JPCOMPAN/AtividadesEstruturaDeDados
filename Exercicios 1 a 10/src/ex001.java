import java.util.Scanner;

// Programa que recebe o preço e a quantidade e calcula o total da compra //

public class ex001 {
    public static void main(String[]args){
        double preco, total;
        int quantidade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do produto:");
        preco = scanner.nextDouble();
        System.out.println("Digite a quantiade de produtos vendidos:");
        quantidade = scanner.nextInt();
        total = preco * quantidade;
        System.out.println("O total da venda é: " + total);
    }
}

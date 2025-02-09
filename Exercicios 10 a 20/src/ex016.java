import java.util.Scanner;

public class ex016 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double totalVenda, desconto;
        System.out.println("Digite o total da venda:");
        totalVenda = scanner.nextDouble();
        if (totalVenda <= 50){
            desconto = 0.05;
        } else if (totalVenda <=100){
            desconto = 0.10;
        } else if (totalVenda <=200){
            desconto = 0.20;
        } else if (totalVenda < 500){
            desconto = 0.25;
        } else {
            desconto = 0.30;
        }
        double totalComDesconto = totalVenda - totalVenda * desconto;
        System.out.printf("O total da compra após o desconto de %.0f%% é R$%.2f", (desconto * 100), totalComDesconto);
    }
}

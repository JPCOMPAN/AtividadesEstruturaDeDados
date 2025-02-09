import java.util.Scanner;

public class ExemploOperadorLogico {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double totalVenda, desconto = 0;
        String metodoPagamento = "";
        System.out.println("Digite o meio de pagamento:");
        metodoPagamento = scanner.next();
        System.out.println("Digite o total da venda: ");
        totalVenda = scanner.nextDouble();
        if ( totalVenda <= 200) {
            desconto = 0.05;

        } else if ( totalVenda <= 550) {
            desconto = 0.10;
        } else if (totalVenda <= 1000) {
            desconto = 0.15;
        } else {
            desconto = 0.20;
        }

        if (metodoPagamento.equals("PIX")) {
            desconto = desconto + 0.05;
        }
        double totalComDesconto = totalVenda - totalVenda * desconto;
        System.out.printf("O total da venda era R$%.2f, mas você ganhou %.0f%%" +
        " de desconto e o total agora é R$%.2f", totalVenda, (desconto*100), totalComDesconto);



        // até 200 reais -> 5% (totalVenda <= 200)
        // 200 até 550 -> 10% (totalVenda > 200 && totalVenda <= 550)
        // 550 até 1000 - > 15% (totalVenda > 550 && totalVenda <= 1000)
    }
}

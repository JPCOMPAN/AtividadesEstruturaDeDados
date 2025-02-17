import java.util.Scanner;

public class ex031 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double precoTotal = 0;

        while(true){
            System.out.println("Digite o preço do produto (digite 0 para cancelar e mostrar o total): ");
            double precoProduto = scanner.nextDouble();
            if (precoProduto == 0){
                break;
            }
            precoTotal += precoProduto;
        }
        System.out.printf("O preco total dos produtos é: R$%.2f ", precoTotal);
    }
}

import java.util.Scanner;

public class ex039 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int produtos = 6, produtoPrecoMenor = 0;

        double valorMinimo = Integer.MAX_VALUE, valorTotal = 0;

        for(int i = 1; i <= produtos; i++){
            System.out.printf("Digite o preço do produto %d:", i);
            double valorProduto = scanner.nextDouble();

            if (valorProduto < valorMinimo ){
                valorMinimo = valorProduto;
                produtoPrecoMenor = i;
            }
            valorTotal += valorProduto;
        }
        System.out.printf("Media de preço: R$%.2f\nMenor preço: R$%.2f\nProduto: %d ", (valorTotal / produtos), valorMinimo, produtoPrecoMenor);
    }
}

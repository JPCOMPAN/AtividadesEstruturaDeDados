import java.util.Scanner;

public class ex046 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int produtos = 5;
        double[] precos = new double[produtos];
        double precoTotal = 0;
        for(int i = 0; i < produtos; i++){
            System.out.printf("Digite o preço do produto %d:%n", i + 1);
            precos[i] = scanner.nextDouble();
        }

        for (double i : precos){
            precoTotal += i;
        }

        System.out.printf("O total da sua compra foi de:%nR$%.2f ", precoTotal);

    }
}

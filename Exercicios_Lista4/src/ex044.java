import java.util.Scanner;

public class ex044 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int quantPrecos = 10;

        double[] precos = new double[quantPrecos];

        for(int i = 0; i < quantPrecos; i++){
            System.out.printf("Digite o preço %d: ", i + 1);
            precos[i] = scanner.nextDouble();
        }
        double menorPreco = precos[0];
        for(int i = 0; i < quantPrecos; i++ ){
            if (precos[i] < menorPreco){
                menorPreco = precos[i];
            }
        }
        System.out.println("Preços digitados: ");

        for(double preco : precos){
            System.out.printf("R$ %.2f %n", preco);
        }
        System.out.println("\nMenor preço encontrado: ");
        System.out.printf("R$ %.2f", menorPreco);

    }
}

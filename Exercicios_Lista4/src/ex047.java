import java.util.Scanner;

public class ex047 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int quantCambio = 5;
        double[] precosDolar = new double[quantCambio];
        double totalPrecos = 0;
        for(int i = 0; i < quantCambio; i++){
            System.out.printf("Digite o preço %d:%n", i + 1);
            precosDolar[i] = scanner.nextDouble();
        }
        System.out.println("Preços do dolar: ");
        for (double precoDigitados : precosDolar){
            System.out.printf("$%.2f%n", precoDigitados);
        }

        for(double i : precosDolar){
            totalPrecos += i;
        }
        System.out.printf("Media de preços: $%.2f", (totalPrecos / quantCambio));

    }
}

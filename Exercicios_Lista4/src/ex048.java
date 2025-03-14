import java.util.Scanner;

public class ex048 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int quantValores = 10;
        double[] valores = new double[quantValores];

        for(int i = 0; i < quantValores; i++){
            System.out.printf("Digite o numero %d:%n", i + 1);
            valores[i] = scanner.nextDouble();
        }
        System.out.println("Numeros digitados: ");
        for (double valor : valores){
          System.out.println(valor);
        }

        int n = valores.length;
        for (int i = 0; i < n - 1; i++) {
             boolean trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    double temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        System.out.println("Numeros em ordem crescente: ");
        for (double i : valores){
            System.out.print(i + "\n");
        }
    }
}

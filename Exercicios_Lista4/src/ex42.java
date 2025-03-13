import java.util.Scanner;

public class ex42 {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      int quantCambio = 5;

      double[] taxaCambio = new double[quantCambio];
      System.out.println("Digite as taxas de cambio do dolar em sequencia: ");
      for(int i = 0; i < quantCambio; i ++){
          System.out.print("Taxa " + (i + 1) + ": ");
          taxaCambio[i] = scanner.nextDouble();
      }

      System.out.println("Taxas de cambio: ");

      for(double taxaCambios: taxaCambio){
        System.out.println(taxaCambios);
      }
    }
}

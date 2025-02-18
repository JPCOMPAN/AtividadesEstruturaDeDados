import java.util.Scanner;

public class ex035 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double mediaTotalPrecos = 0;
         for(int precos = 1; precos <= 6; precos++){
             System.out.printf("Digite o preço %d:%n", precos);
             double mediaPreco = scanner.nextDouble();
             mediaTotalPrecos += mediaPreco;
         }
         System.out.printf("A media total de todos os preços é: R$%.2f", (mediaTotalPrecos / 6));
    }
}

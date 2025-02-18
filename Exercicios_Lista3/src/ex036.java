import java.util.Scanner;

public class ex036 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double mediaTemperaturaTotal = 0;

        for(int i = 1; i <= 7; i++){
            System.out.printf("Digite a maxima temperatura do dia %d em graus: ", i);
            double temperatura = scanner.nextDouble();
            mediaTemperaturaTotal +=  temperatura;
        }
        System.out.printf("A media de temperatura dessa semana é: %.1f°", (mediaTemperaturaTotal/7));
    }
}

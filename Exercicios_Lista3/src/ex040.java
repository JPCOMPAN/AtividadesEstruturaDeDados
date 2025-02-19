import java.util.Scanner;

public class ex040 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double temperaturaMinima = Integer.MAX_VALUE, temperaturaMaxima = Integer.MIN_VALUE;
        int diaSemanaMin = 0, diaSemanaMax = 0, semana = 7;

        for(int i = 1; i <= semana; i++){
            System.out.printf("Digite a temperatura maxima do dia %d:", i);
            double valorDiaMax = scanner.nextDouble();
            System.out.printf("Digite a temperatura minima do dia %d:", i);
            double valorDiaMin = scanner.nextDouble();

            if (valorDiaMax > temperaturaMaxima){
                diaSemanaMax = i;
                temperaturaMaxima = valorDiaMax;
            }
            if (valorDiaMin < temperaturaMinima){
                diaSemanaMin = i;
                temperaturaMinima = valorDiaMin;
            }
        }
        System.out.printf("\nDia da semana que ocorreu a maxima: %d\nMaxima: %.1f°\nDia da semana que ocorreu a minima: %d\nMinima: %.1f°\n",
                diaSemanaMax, temperaturaMaxima, diaSemanaMin, temperaturaMinima);
    }
}

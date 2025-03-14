import java.util.Scanner;

public class ex045 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int diasSemana = 7;
        double[] temperaturas = new double[diasSemana];

        for(int i = 0; i < diasSemana; i++){
            System.out.printf("Digite a temperatura do dia %d: %n", i + 1);
            temperaturas[i] = scanner.nextDouble();
        }

        double maiorTemperatura = temperaturas[0];
        int diaSemana = 1;
        for(int i = 0; i < diasSemana; i++){
            if (temperaturas[i] > maiorTemperatura){
                maiorTemperatura = temperaturas[i];
                diaSemana = (i + 1);
            }
        }
        System.out.println("Temperaturas:");

        for(double temperatura: temperaturas){
            System.out.printf("%.1f°%n", temperatura);
        }
        System.out.printf("Maior temperatura encontrada: %ndia %d: %.1f°", diaSemana, maiorTemperatura);

    }
}

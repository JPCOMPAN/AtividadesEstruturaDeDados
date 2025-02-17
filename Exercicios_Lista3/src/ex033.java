import java.util.Scanner;

public class ex033 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double mediaTotal = 0;
        for(int bimestre = 1; bimestre <= 4; bimestre++){
            System.out.printf("Digite a %dº bimestre: ", bimestre);
            double mediaBimestre = scanner.nextDouble();
            mediaTotal += mediaBimestre;
        }
        System.out.printf("A media total de todos os bimestres é: %.2f", (mediaTotal / 4));
    }
}

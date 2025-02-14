import java.util.Scanner;

public class ex019 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 13: ");
        int numeroUsuario = scanner.nextInt();
        if (numeroUsuario < 1 || numeroUsuario > 13) {
            System.out.print("Numero invalido!");
        } else {
            if (numeroUsuario == 1) {
                System.out.print("O numero um corresponde a carta Ás");
            } else if (numeroUsuario == 11) {
                System.out.print("O numero onze corresponde a carta Jalete");
            } else if (numeroUsuario == 12) {
                System.out.print("O numero doze corresponde a carta Rainha");
            } else if (numeroUsuario == 13) {
                System.out.print("O numero treze corresponde a carta Rei");
            } else {
                System.out.printf("O número escolhido foi %d", numeroUsuario);
            }
        }
    }
}

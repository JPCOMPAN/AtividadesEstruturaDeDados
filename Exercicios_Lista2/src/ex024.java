import java.util.Scanner;

public class ex024 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numeroSorteado, numeroUsuario;
        System.out.println("Digite o número de 1 a 30 que você escolheu para o sorteio:");
        numeroUsuario = scanner.nextInt();
        numeroSorteado = (int) (Math.random() * 30) + 1;
        if (numeroUsuario < 30 && numeroUsuario >= 1){
            if (numeroUsuario == numeroSorteado){
                System.out.printf("Parabens o seu numero (%d) você foi sorteado!", numeroSorteado);
            }
            else {
                System.out.printf("Infelizmente o numero sorteado foi %d :(", numeroSorteado);
            }
        }
        else {
            System.out.printf("O numero %d não é valido", numeroUsuario);
        }

    }
}

import java.util.Scanner;

public class ex028 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero para saber a tabuada: ");
        int numeroUsuario = scanner.nextInt();
        for(int numero = 0; numero <= 10; numero ++){
            System.out.printf("%d x %d = %d\n", numeroUsuario, numero, (numero*numeroUsuario) );
        }
    }
}

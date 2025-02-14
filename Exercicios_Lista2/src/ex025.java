import java.util.Scanner;

public class ex025 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int tomBase = 128, valorUsuario;
        System.out.println("Digite o nivel de cinza para calculamos se é tom claro ou escuro:");
        valorUsuario = scanner.nextInt();
        if (valorUsuario <= 255 && valorUsuario >= 1){
            if (valorUsuario <= tomBase) {
                System.out.println("O tom é claro!");
            }
            else {
                System.out.println("O tom é escuro");
            }
        }
        else {
        System.out.println("Tom invalido!");
        }
    }
}

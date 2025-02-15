//PROGRAMA QUE LÊ UM ANO E DIZ SE ELE É BISSEXTO OU NÃO


import java.util.Scanner;

public class ex021 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano para saber se é bissexto ou não:");
        int anoUsuario = scanner.nextInt();
        if (anoUsuario % 4 == 0 && anoUsuario % 100 != 0 || anoUsuario % 400 == 0){
            System.out.printf("O ano %d é bissexto!", anoUsuario);
        } else {
            System.out.printf("O ano %d não é bissexto!", anoUsuario);
        }
    }
}

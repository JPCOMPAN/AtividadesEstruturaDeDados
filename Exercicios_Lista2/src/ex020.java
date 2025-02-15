// PROGRAMA QUE LÊ UMA LETRA E RETORNA SE É UMA VOGAL OU NÃO
import java.util.Scanner;

public class ex020 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        System.out.println("Digite uma letra do alfabeto");
        letra = scanner.next().toUpperCase().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.printf("A letra %c é uma vogal!", letra);
        } else if (Character.isLetter(letra)) {
            System.out.printf("A letra %c é uma consoante", letra);
        } else {
            System.out.printf("%c não é uma letra do alfabeto!", letra);
        }
    }
}

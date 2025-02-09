// PROGRAMA QUE LÊ A TEMPERATURA E EXIBE UMA MENSAGEM INDIVIDUAL SE FOR MENOR OU IGUAL A 17 GRAUS OU MAIOR QUE 17 GRAUS


import java.util.Scanner;

public class ex012 {
    public static void main(String[]args){
        double temperatura;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite a temperatura da sua cidade em graus celcius:");
        temperatura = scanner.nextDouble();
        if (temperatura <= 17) {
            System.out.print("Frio da moléstia");
        }
        else {
            System.out.print("Tudo normal nas de Cuçumarim");
        }
    }
}

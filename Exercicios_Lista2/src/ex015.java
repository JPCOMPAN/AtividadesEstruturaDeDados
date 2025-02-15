import java.util.Scanner;

public class ex015 {
    public static void main(String[]args) {
    String genero;

    double horarioLimite = 22, horarioAtual;
    Scanner scanner = new Scanner(System.in);
    System.out.println("O cliente é Homem ou Mulher? :");
    genero = scanner.next();
    System.out.println("Digite horario atual: ");
    horarioAtual = scanner.nextDouble();
    if (horarioAtual <= horarioLimite && genero.equalsIgnoreCase("mulher")){
        System.out.print("A torcedora não precisa pagar o ingresso está liberada!");
    } else if (horarioAtual >= horarioLimite && genero.equalsIgnoreCase("mulher") ){
        System.out.print("A torcedora terá que pagar metade do ingresso!");
    } else if (horarioAtual <= horarioLimite && genero.equalsIgnoreCase("homem") ){
        System.out.print("O torcedor deverá pagar apenas 70% do ingresso!");
    } else
        System.out.print("O torcedor deverá pagar o ingresso integral!");
    }
}

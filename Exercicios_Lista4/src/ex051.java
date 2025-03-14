import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class ex051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo: ");
        String entrada = scanner.nextLine();
        char[] codigo = entrada.toCharArray();

        if (entrada.length() != 18) {
            System.out.println("Codigo invalido!!");
            return;
        }

        if (!entrada.startsWith("COD")) {
            System.out.println("Codigo invalido!!");
            return;
        }


        char[] isolarData = Arrays.copyOfRange(codigo, 3, 11);
        String dataIsolada = new String(isolarData);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        try {
            LocalDate data = LocalDate.parse(dataIsolada, formatter);
        } catch (DateTimeException e) {
            System.out.println("Codigo invalido!!");
            return;
        }

        char[] parteNumerica = Arrays.copyOfRange(codigo, 11, 18);
        for (char c : parteNumerica) {
            if (!Character.isDigit(c)) {
                System.out.println("Codigo invalido!!");
                return;
            }
        }
        System.out.println("O codigo: " + entrada + " é valido!!");
    }
}
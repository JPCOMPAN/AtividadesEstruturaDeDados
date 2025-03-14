import java.util.*;

public class ex043 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a letra da sua musica favorita: ");
        String entrada = scanner.nextLine();
        List<String> palavras = new ArrayList<>();

        for(String palavra: entrada.split(" ") ){
            palavras.add(palavra);
        }
        Collections.reverse(palavras);
        String palavrasInvestidas = String.join(" ", palavras);
        System.out.println(palavrasInvestidas);

    }
}

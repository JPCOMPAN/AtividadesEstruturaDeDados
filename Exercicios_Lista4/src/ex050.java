import java.util.Scanner;

public class ex050 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra de no maximo 10 letras: ");
        String entrada = scanner.nextLine();

        if(entrada.length() > 10){
            System.out.println("A palavra deve ter no maximo 10 letras!");
        } else {
            char[] palavra = entrada.toCharArray();

            for(int i = 0; i < palavra.length; i++){
                char caractere = palavra[i];

                if (caractere >= 'a' && caractere <= 'z'){
                    char novoCaractere = (char) (caractere + i);

                    if(novoCaractere > 'z'){
                        novoCaractere = (char) (novoCaractere - 26);
                    }

                    palavra[i] = novoCaractere;
                }
                else if(caractere >= 'A' && caractere <= 'Z') {
                    char novoCaractere = (char) (caractere + i);

                    if(novoCaractere > 'Z'){
                        novoCaractere = (char) (novoCaractere - 26);
                    }

                    palavra[i] = novoCaractere;
                }
            }
            System.out.println("Nova palavra: ");
            for (char percorrerPalavra: palavra){
                System.out.print(percorrerPalavra);
            }
        }

    }
}

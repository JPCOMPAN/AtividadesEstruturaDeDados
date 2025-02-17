public class ex029 {
    public static void main(String[]args){
        char as = '*', espaco = ' ';
        int numero;
        int tamanho = 13;
        for (numero = 1; numero <= tamanho; numero++){
            String espacoVazio = String.valueOf(espaco).repeat(tamanho - numero);
            String partesArvore = String.valueOf(as).repeat(numero);
            System.out.print(espacoVazio + partesArvore + "\n");
        }

    }
}

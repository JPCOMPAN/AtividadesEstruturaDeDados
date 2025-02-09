import java.util.Scanner;

public class ex017 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean todosOsValoresAbaixoDaMedia = true;
        double media, preco1, preco2, preco3, preco4, preco5;
        System.out.println("Digite os 5 preços:");
        preco1 = scanner.nextDouble();
        preco2 = scanner.nextDouble();
        preco3 = scanner.nextDouble();
        preco4 = scanner.nextDouble();
        preco5 = scanner.nextDouble();
        media = (preco1 + preco2 + preco3 + preco4 + preco5) / 5;
        System.out.printf("A media de preços é: R$%.2f", media);

        if (preco1 > media){
            System.out.printf("%nR$%.2f: acima da média", preco1);
            todosOsValoresAbaixoDaMedia = false;
        }

        if (preco2 > media) {
            System.out.printf("%nR$%.2f: acima da média", preco2);
            todosOsValoresAbaixoDaMedia = false;

        }
        if (preco3 > media) {
            System.out.printf("%nR$%.2f: acima da média", preco3);
            todosOsValoresAbaixoDaMedia = false;
        }
        if (preco4 > media) {
            System.out.printf("%nR$%.2f: acima da média", preco4);
            todosOsValoresAbaixoDaMedia = false;
        }

        if (preco5 > media) {
            todosOsValoresAbaixoDaMedia = false;
            System.out.printf("%nR$%.2f: acima da média", preco5);
        }
        if (todosOsValoresAbaixoDaMedia) {
            System.out.printf("%nNão foi encontrado nenhum valor acima da média");
        }


    }
}

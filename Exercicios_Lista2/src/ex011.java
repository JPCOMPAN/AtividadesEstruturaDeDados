// PROGRAMA QUE VERIFICA SE O DOIS NUMEROS SÃO SUCESSORES OU ANTECESSORES

import java.util.Scanner;

public class ex011 {
    public static void main(String[]args){
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números para verificar se são sucessor ou antecessor um do outro: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        if (numero2 == numero1 + 1 ){
            System.out.print("O número " + numero2 + " é sucessor do número " + numero1 );
        } else if (numero1 == numero2 + 1) {
            System.out.print("O número " + numero1 + " é sucessor do número " + numero2);
        } else if  (numero2 == numero1 -1) {
            System.out.print("O número " + numero2 + " é antecessor do número " + numero1);
        } else if (numero1 == numero2 - 1) {
            System.out.print("O número " + numero1 + " é antecessor do número " + numero2);
        }
        else {
            System.out.print("Ambos os números não são sucessores ou antecessores um do outro!");
        }


    }
}

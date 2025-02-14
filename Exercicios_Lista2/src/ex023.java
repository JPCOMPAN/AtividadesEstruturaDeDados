import java.util.Scanner;

public class ex023 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int dia, mes;
        System.out.println("Digite o dia e o mês");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        if (dia < 1 || dia > 31) {
            System.out.print("Data invalida");
        } else if (mes < 1 || mes > 12 ){
            System.out.print("Data invalida");
        } else if ((dia >= 20 && mes == 3) || mes == 4 || mes == 5 || (mes == 6 && dia <= 21)) {
            System.out.println("Você está no outono");
        } else if ( (dia >= 22 && mes == 9) || mes ==  10 || mes == 11 || (mes == 12 && dia <=21)){
            System.out.println("Você está na privamera");
        }
        else {
            System.out.println("A data não se passa na primavera nem no outono!");
        }
    }
}

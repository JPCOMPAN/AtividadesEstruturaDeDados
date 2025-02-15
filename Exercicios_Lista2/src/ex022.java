//PROGRAMA QUE VERIFICA SE UMA DATA É VALIDA OU NÃO


import java.util.Scanner;

public class ex022 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int dia,mes,ano;
        System.out.println("Digite o dia, mês e ano para vermos se a data é valida:");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        ano = scanner.nextInt();
        boolean isValida = false;

        if(ano > 0) {
            if(mes>= 1 && mes <=12){
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if (dia >= 1 && dia <= 31) {
                        isValida = true;
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if(dia >= 1 && dia <=30){
                        isValida = true;
                    }
                } else if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                    if (dia >= 1 && dia <= 29){
                        isValida = true;
                    }
                }
            }
        }
        if (isValida) {
            System.out.println("A data é válida!");
        } else {
            System.out.println("Data invalida!");
        }
    }
}
// meses com 31 dias : 01, 03, 05, 07, 08, 10, 12
// meses com 30 dias: 04, 06, 09, 11
// meses com 28 dias: 02
// ano bissexto 29 dias: 02
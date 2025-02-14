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
        if ((dia <= 31 && dia != 0) && (mes <= 12 && mes != 0))   {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
                if (mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                } else if (dia <= 29) {
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                } else {
                    System.out.printf("Sua data %d do mês %d do ano %d não é valida!", dia, mes, ano);
                }
            } else {
                if (mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || 12 == mes) {
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                } else if (dia <= 28) {
                    System.out.printf("Sua data %d do mês %d do ano %d é valida!", dia, mes, ano);
                } else {
                    System.out.printf("Sua data %d do mês %d do ano %d não é valida!", dia, mes, ano);
                }
            }
        } else {
            System.out.printf("Sua data %d do mês %d do ano %d não é valida!", dia, mes, ano);
        }
    }
}
// meses com 31 dias : 01, 03, 05, 07, 08, 10, 12
// meses com 30 dias: 04, 06, 09, 11
// meses com 28 dias: 02
// ano bissexto 29 dias: 02
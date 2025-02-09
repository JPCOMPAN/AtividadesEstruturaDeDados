
// PROGRAMA QUE LÊ OS QUATROS LADOS DE UM TERRENO E CALCULA O PERIMETRO //


import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado1, lado2, lado3, lado4, perimetro;
        System.out.println("Digite quantos metros possui os 4 lados do terreno: ");
        lado1 = scanner.nextDouble();
        lado2 = scanner.nextDouble();
        lado3 = scanner.nextDouble();
        lado4 = scanner.nextDouble();
        perimetro = lado1 + lado2 + lado3 + lado4;
        System.out.println("O perimetro do terreno é: " + perimetro + "m");

    }
}

import java.util.Scanner;

public class ex030 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double areaCasa = 0;
        while(true){
            System.out.println("Digite a área de cada cômodo da casa e para finalizar digite 0:");
            double areaUsuario = scanner.nextDouble();
            if (areaUsuario == 0) {
                break;
            }
            areaCasa += areaUsuario;
        }
        System.out.printf("Area total: %.2fm²",areaCasa );
    }
}

import java.util.Scanner;

public class ex034 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = 25;

        double[]medias = new double[quantidadeAlunos];

        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.println("\nAluno " + (i + 1) + ": ");
            double somaNotas = 0;
            int quantidadeNotas = 4;

            for (int j = 0 ; j < quantidadeNotas; j++){
                System.out.println("Digite a nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / quantidadeNotas;
            medias[i] = media;
        }
        System.out.println("\n Médias dos alunos: ");
        for (int i = 0; i < quantidadeAlunos; i++){
            System.out.printf("Aluno %d: %.2f%n", (i + 1), medias[i]);
        }
    }
}

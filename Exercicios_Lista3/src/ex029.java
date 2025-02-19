public class ex029 {
    public static void main(String[]args){
        int tamanho = 13;
        for (int i = 0; i <= tamanho; i++){
            for(int j = 0; j < tamanho - i; j++){
                System.out.print(" ");
            }

            for(int h = 0; h < (2 *  i + 1); h++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

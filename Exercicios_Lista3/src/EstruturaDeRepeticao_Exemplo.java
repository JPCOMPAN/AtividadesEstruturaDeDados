public class EstruturaDeRepeticao_Exemplo {
    public static void main(String[]args) {
        int cc = 0;
        while (cc <= 10) {
            cc++;
            if (cc == 2 || cc == 4 || cc == 6) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("cambalhota " + cc);
        }
    }
}

public class ex041 {
    public static void main(String[]args){
        double valorReal = 5.685, maiorValor = Double.MIN_VALUE, maiorVariacao = Double.MIN_VALUE, valorAtual;
        int valores = 18;

        for(int i = 1; i<=valores; i++){
            double variacao = Math.random() * 0.20 - 0.10;

            valorAtual = valorReal + variacao;

            if (valorAtual > maiorValor){
                maiorValor = valorAtual;
            }
            if (maiorVariacao > variacao){
                maiorVariacao = variacao;
            }
            System.out.printf("\nValor Atual: R$%.2f\nVariação: %.2f", valorAtual, variacao);
        }
            System.out.printf("\n\nA cotação mais alta: R$%.2f\nMaior variação: %.2f ", maiorValor, maiorVariacao);
    }
}

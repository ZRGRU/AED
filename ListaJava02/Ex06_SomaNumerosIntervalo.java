public class Ex06_SomaNumerosIntervalo {

    public static int processar(int inicio, int fim) {
        int i = 0;
        int soma = 0;

        for (i = inicio; i < fim + 1; i++) {
            soma = soma + i;
        }
        return soma;
    }
    public static void main(String[] args) {
        Util.imprimir("Digite o valor inicial do intervalo: ");
        int inicio = Util.lerValorInteiro();
        Util.imprimir("Digite o valor final do intervalo: ");
        int fim = Util.lerValorInteiro();

        int soma = processar(inicio, fim);

        System.out.println("A soma do intervalo (" + inicio + " - " + fim + ") é " + soma);
    }
}

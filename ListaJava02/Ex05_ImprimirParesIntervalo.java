public class Ex05_ImprimirParesIntervalo {

    public static void processarPares(int inicio, int fim) {
        int i = 0;

        for (i = inicio; i < fim + 1; i++) {
            if (i % 2 == 0) {
                Util.imprimirInteiro(i);
            }
        }
    }

    public static void main(String[] args) {
        Util.imprimir("Digite o valor inicial do intervalo: ");
        int inicio = Util.lerValorInteiro();
        Util.imprimir("Digite o valor final do intervalo: ");
        int fim = Util.lerValorInteiro();

        processarPares(inicio, fim);

        System.out.println("FIM ~_~ !!!");
    }
}

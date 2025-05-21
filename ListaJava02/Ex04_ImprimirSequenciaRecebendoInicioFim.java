public class Ex04_ImprimirSequenciaRecebendoInicioFim {

    public static void processar(int inicio, int fim) {
        int i = 0;
    
        for(i=inicio; i < fim; i++){
            Util.imprimirInteiro(i);
        }
    }

    public static void main(String[] args) {
        Util.imprimir("Digite o valor inicial do intervalo: ");
        int inicio = Util.lerValorInteiro();
        Util.imprimir("Digite o valor final do intervalo: ");
        int fim = Util.lerValorInteiro();

        processar(inicio, fim);
    }
}

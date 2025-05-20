public class Ex03_ImprimirSequenciaFinalDefinido {
    public static void main(String[] args) {
        int inicioSequencia = 0;
        int contador = inicioSequencia;
        Util.imprimir("Defina o fim da sequência com um número maior que 0 (zero): ");
        int fimSequencia = Util.lerValorInteiro();

        while (contador <= fimSequencia) {
            Util.imprimir("Contador é " + contador);
            contador += 1;
        }
        Util.imprimir("Sequência terminada!!! <*,*> ");
    }
}

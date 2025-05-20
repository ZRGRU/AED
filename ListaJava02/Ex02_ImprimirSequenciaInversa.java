public class Ex02_ImprimirSequenciaInversa {
    public static void main(String[] args) {
        int inicioSequencia = 200;
        int fimSequencia = 1;
        int contador = inicioSequencia;

        while (contador >= fimSequencia) {
            Util.imprimir("Contador: " + contador);
            contador -= 1;
        }
        Util.imprimir("A contagem já terminou!");
    }
}

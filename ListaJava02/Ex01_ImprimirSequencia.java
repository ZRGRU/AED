
public class Ex01_ImprimirSequencia {

    public static void main(String[] args) {
        int inicio = 10;
        int fim = 200;
        int contador = inicio;

        while (contador <= fim) {
            Util.imprimir("Contador: " + contador);
            contador++;
        }
        Util.imprimir("Acabou a sequência!");
    }
}
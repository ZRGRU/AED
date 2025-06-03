

import java.text.DecimalFormat;
import java.util.Scanner;

public class Util {

    final static Scanner TECLADO_SCANNER = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor = 0;
        valor = TECLADO_SCANNER.nextInt();
        return valor;
    }

    public static double lerValorReal() {
        double valor = 0;
        valor = TECLADO_SCANNER.nextDouble();
        return valor;
    }

    public static String lerTexto() {
        String texto = null;
        texto = TECLADO_SCANNER.nextLine();
        return texto;
    }

    public static String lerPalavra() {
        String palavra = null;
        palavra = TECLADO_SCANNER.next();
        return palavra;
    }

    public static char lerCharacter() {
        char caracter = ' ';
        caracter = TECLADO_SCANNER.next().charAt(0);
        return caracter;
    }

    public static void imprimirInteiro(int inteiro) {
        System.out.println(inteiro);
    }

    public static void imprimirInteiro(long inteiro) {
        System.out.println(inteiro);
    }
    
    public static void processarPares(int inicio, int fim) {
        int i = 0;

        for (i = inicio; i < fim; i++) {
            if (i % 2 == 0) {
                Util.imprimirInteiro(i);
            }
        }
    }

    public static DecimalFormat df = new DecimalFormat("#0.00");

}

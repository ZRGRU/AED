package ListaJava01;

// import java.util.Locale;
import java.util.Scanner;

public class Ex9_AreaTrapezio {
    public static Scanner tecladoScanner = new Scanner(System.in); // .useLocale(Locale.US);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static double lerValorReal() {
        double valor;
        valor = tecladoScanner.nextDouble();
        return valor;
    }
    public static double calcularAreaTrapezio(double baseMenor, double baseMaior, double altura) {
        double resultado;
        resultado = ((baseMenor + baseMaior) * altura ) / 2;
        return resultado;
    }

    public static void main(String[] args) {
        double baseMenor;
        double baseMaior;
        double altura;
        double areaTrapezio;

        imprimir("Digite um valor positivo para a base menor do trapézio: ");
        baseMenor = lerValorReal();
        imprimir("Digite um número positivo para a base maior do trapézio: ");
        baseMaior = lerValorReal();
        imprimir("Digite a altura do trapézio: ");
        altura = lerValorReal();

        areaTrapezio = calcularAreaTrapezio(baseMenor, baseMaior, altura);
        imprimir("A área do trapézio é: " + areaTrapezio);
    }
}

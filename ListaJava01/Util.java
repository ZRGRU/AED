package ListaJava01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Util {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor = 0;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static double lerValorReal() {
        double valor = 0;
        valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static String lerTexto() {
        String texto = null;
        texto = tecladoScanner.nextLine();
        return texto;
    }

    public static String lerPalavra() {
        String palavra = null;
        palavra = tecladoScanner.next();
        return palavra;
    }

    public static char lerCharacter() {
        char caracter = ' ';
        caracter = tecladoScanner.next().charAt(0);
        return caracter;
    }

    public static double calcularAlturaPredio(double alturaAndares, int qtdAndares) {
        double resultado = 0;
        resultado = alturaAndares * qtdAndares;
        return resultado;
    }

    public static double calcularDollar(double qtdReais, double cotacaoDollar){
        double cotacao = 0;
        cotacao = qtdReais / cotacaoDollar;
        return cotacao;
    }

    public static double calcularReal(double qtdDolares, double cotacaoDollar){
        double cotacao = 0;
        cotacao = qtdDolares * cotacaoDollar;
        return cotacao;
    }

    public static String classificacaoTriangulo(double ladoA, double ladoB, double ladoC){
        String tipoTriangulo = null;
        
        if (ladoA == ladoB && ladoB == ladoC) {
            tipoTriangulo = "Equilátero";
        }   
        else {
            if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                tipoTriangulo = "Escaleno";
            }
            else {
                tipoTriangulo = "Isóceles";
            }
        } 
        return tipoTriangulo;
    }

    public static double mediaKmL(double dististanciaPercorrida, double combustivelGasto){
        double resultado = dististanciaPercorrida / combustivelGasto;
        return resultado;
    }
    
    public static DecimalFormat df = new DecimalFormat("#0.00");

    public static String numeral (int numeral) {
        String tipoNumeral = null;
        if (numeral == 0) {
            tipoNumeral = "zero.";         
        } else {
            if (numeral > 0) {
                tipoNumeral = "positivo.";
            } else {
                tipoNumeral = "Negativo.";
            }
        }
        return tipoNumeral;
    }

    public static String parImpar (int numeral) {
        String ehPar = null;
        if (numeral % 2 == 0) {
            ehPar = "par.";
        } else {
            ehPar = "ímpar.";
        }
        return ehPar;
    }
    
    public static int numeroMaior (int numero1, int numero2, int numero3) {
        int numeroMaior = 0;
        if (numero1 > numero2 && numero2 > numero3) {
            numeroMaior = numero1;
        } else {
           if (numero2 > numero1 && numero2 > numero3) {
                numeroMaior = numero2;
           } else {
                numeroMaior = numero3;
           }
        }
        return numeroMaior;
    }

    
}

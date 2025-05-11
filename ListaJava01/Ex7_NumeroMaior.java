package ListaJava01;

public class Ex7_NumeroMaior {
    public static void main(String[] args) {
        Util.imprimir("Digite o primeiro número: ");
        int numero1 = Util.lerValorInteiro();
        Util.imprimir("Digite o segundo número: ");
        int numero2 = Util.lerValorInteiro();
        Util.imprimir("Digite o terceiro número: ");
        int numero3 = Util.lerValorInteiro();

        Util.imprimir("O maior número é o " + Util.numeroMaior(numero1, numero2, numero3));
    }
}

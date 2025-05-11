package ListaJava01;

public class Ex5_numeral {
    public static void main(String[] args) {
        Util.imprimir("Digite um número: ");
        int numeral = Util.lerValorInteiro();
        
        Util.imprimir("O número digitado é " + Util.numeral(numeral));
    }
}

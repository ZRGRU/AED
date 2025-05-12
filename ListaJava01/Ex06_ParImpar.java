package ListaJava01;

public class Ex06_ParImpar {
    public static void main(String[] args) {
        Util.imprimir("Digite um número inteiro: ");
        int numeral = Util.lerValorInteiro();
        
        Util.imprimir("O número digitado é " + Util.parImpar(numeral));
    }

}

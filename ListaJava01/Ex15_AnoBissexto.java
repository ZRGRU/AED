package ListaJava01;

public class Ex15_AnoBissexto {
    public static void main(String[] args) {
        Util.imprimir("Digite o ano (aaaa): ");
        int ano = Util.lerValorInteiro();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            Util.imprimir("O ano digitado é Bissexto.");
        } else {
            Util.imprimir("O ano digitado não é Bissexto.");
        }
    }
}

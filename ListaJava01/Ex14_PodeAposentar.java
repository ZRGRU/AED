package ListaJava01;

public class Ex14_PodeAposentar {
    public static void main(String[] args) {

        Util.imprimir("Digite sua idade: ");
        int idade = Util.lerValorInteiro();
        Util.imprimir("Digite seu tempo de serviço: ");
        int tempoServico = Util.lerValorInteiro();

        if (idade >= 65 || tempoServico >= 30 || idade >= 60 && tempoServico >= 25) {
            Util.imprimir("Pode se aposentar! ;-)");
        } else {
            Util.imprimir("Não pode se aposentar! :(");
        }
    }
}

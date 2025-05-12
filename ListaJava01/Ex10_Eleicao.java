package ListaJava01;

public class Ex10_Eleicao {
    public static void main(String[] args) {
        Util.imprimir("Digite a sua idade para saber qual sua classificação nas eleições: ");
        int idade = Util.lerValorInteiro();
        Util.imprimir("Sua classificação é: ");
    if (idade < 16) {
        Util.imprimir("Não eleitor.");
    } else {
        if (idade >17 && idade < 66) {
            Util.imprimir("Eleitor obrigatório.");
        } else {
            Util.imprimir("Eleitor facultativo.");
        }
    }


    }
}

package ListaJava01;

public class Ex2_CotacaoDollar {

    public static void main(String[] args) {
        double cotacaoDollar = 0;
        double qtdReais = 0;
        double qtdDollares = 0;

        Util.imprimir(
                "Digite 1 ou 2 para selecionar a operação desejada:\n1. Converter real em dolar\n2. Converter dolar em real");
        if (Util.tecladoScanner.nextInt() == 1) {
            // Converter real para dolar
            Util.imprimir("Digite a quantidade de reais: ");
            qtdReais = Util.lerValorReal();
            Util.imprimir("Digite a cotação do dollar: ");
            cotacaoDollar = Util.lerValorReal();
            qtdDollares = Util.calcularDollar(qtdReais, cotacaoDollar);
            Util.imprimir("Você possuí USD " + Util.df.format(qtdDollares)); 
            // Programa não está parando depois da execução desse bloco.
        } else
            // Converter dolar para real
            Util.imprimir("Digite a quantidade de dolares: ");
            qtdDollares = Util.lerValorReal();
            Util.imprimir("Digite a cotação do dollar: ");
            cotacaoDollar = Util.lerValorReal();
            qtdReais = Util.calcularReal(qtdDollares, cotacaoDollar);
            Util.imprimir("Você possuí R$ " + Util.df.format(qtdReais));
    }
    
}
    

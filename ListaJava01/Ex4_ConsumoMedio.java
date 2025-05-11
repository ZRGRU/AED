package ListaJava01;

public class Ex4_ConsumoMedio {
    public static void main(String[] args) {
        double dististanciaPercorrida = 0;
        double combustivelGasto = 0;
        double mediaKmL = 0;

        Util.imprimir("Digite a distância total percorrida: ");
        dististanciaPercorrida = Util.lerValorReal();
        Util.imprimir("Digite a quantidade de combustível gasto: ");
        combustivelGasto = Util.lerValorReal();

        mediaKmL = Util.mediaKmL(dististanciaPercorrida, combustivelGasto);
        Util.imprimir("Seu consumo médio de combustível é " + Util.df.format(mediaKmL));
    }
}

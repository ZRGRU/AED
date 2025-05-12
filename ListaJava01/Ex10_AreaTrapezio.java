package ListaJava01;

public class Ex10_AreaTrapezio {
    public static void main(String[] args) {

        Util.imprimir("Digite o comprimento da base menor do trapézio: ");
        double baseMenor = Util.lerValorReal();
        Util.imprimir("Digite o comprimento da base maior do trapézio: ");
        double baseMaior = Util.lerValorReal();
        Util.imprimir("Digite a altura do trapézio: ");
        double altura = Util.lerValorReal();
        double areaTrapezio = ((baseMaior+baseMenor)*altura)/2;
        Util.imprimir("A área do trapézio é: " + Util.df.format(areaTrapezio));


    }
}

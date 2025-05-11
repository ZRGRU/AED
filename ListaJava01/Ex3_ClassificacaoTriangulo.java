package ListaJava01;

public class Ex3_ClassificacaoTriangulo {
    public static void main(String[] args) {
        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;
        String tipoTriangulo = null;

        Util.imprimir("Digite o primeiro lado do triangulo: ");
        ladoA = Util.lerValorReal();
        Util.imprimir("Digite o segundo lado do triangulo: ");
        ladoB = Util.lerValorReal();
        Util.imprimir("Digite o terceiro lado do triangulo: ");
        ladoC = Util.lerValorReal();

        tipoTriangulo = Util.classificacaoTriangulo(ladoA, ladoB, ladoC);
        Util.imprimir("Com base nas medidas inseridas, o triângulo é: " + tipoTriangulo);
    }
}

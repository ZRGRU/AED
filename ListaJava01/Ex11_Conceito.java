package ListaJava01;

public class Ex11_Conceito {
    public static void main(String[] args) {
        
        Util.imprimir("Digite a primeira nota: ");
        double nota1 = Util.lerValorReal();
        Util.imprimir("Digite a segunda nota: ");
        double nota2 = Util.lerValorReal();
        Util.imprimir("Digite a terceira nota: ");
        double nota3 = Util.lerValorReal();
        double mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        if (mediaFinal>=9.0) {
            Util.imprimir("Seu conceito é 'A'.");
        } else {
            if (mediaFinal>=7.5) {
                Util.imprimir("Seu conceito é 'B'.");
            } else {
                if (mediaFinal>=6.0) {
                    Util.imprimir("Seu conceito é 'C'.");
                } else {
                    if (mediaFinal>=4.0) {
                        Util.imprimir("Seu conceito é 'D'.");
                    } else {
                        Util.imprimir("Seu conceito é 'E'.");
                    }
                }
            }
        }
    }
}

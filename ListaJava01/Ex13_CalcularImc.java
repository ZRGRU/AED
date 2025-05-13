package ListaJava01;

public class Ex13_CalcularImc {
    public static void main(String[] args) {
        Util.imprimir("Digite sua altura: ");
        double altura = Util.lerValorReal();
        Util.imprimir("Digite seu peso: ");
        double peso = Util.lerValorReal();
        double imc = peso / Math.pow(altura , 2);

        if (imc < 18.6) {
            Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Abaixo do peso.");
        } else {
            if (imc < 25) {
                Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Peso ideal.");
            } else {
                if (imc < 30) {
                    Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Peso em excesso.");
                } else {
                    if (imc < 35) {
                        Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Obesidade Grau I.");
                    } else {
                        if (imc < 40) {
                            Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Obesidade Grau II (severa).");
                        } else {
                            Util.imprimir("Seu IMC é " + Util.df.format(imc) + " - Obesidade Grau III (mórbida).");
                        }
                    }
                }
            }
        }
    }
}

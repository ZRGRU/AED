package ListaJava01;

public class Ex01_AlturaPredio {
   
    public static void main(String[] args) {
        double alturaPredio;
        int qtdAndares;
        double alturaAndares;

        Util.imprimir("Digite a altura dos andares: ");
        alturaAndares = Util.lerValorReal();
        Util.imprimir("Digite a quantidade de andares: ");
        qtdAndares = Util.lerValorInteiro();
        alturaPredio = Util.calcularAlturaPredio(alturaAndares, qtdAndares);
        Util.imprimir("A altura do prédio é: " + alturaPredio + " metros.");
    }
    
}

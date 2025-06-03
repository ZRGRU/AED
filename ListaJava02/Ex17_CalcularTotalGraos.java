public class Ex17_CalcularTotalGraos {
    
    public static long processarTotalGraos() {
        int i;
        long atual = 1;
        long totalGraos = 0;

        for (i = 1; i < 64; i++) {
            atual = atual * 2;
            Util.imprimirInteiro(atual);
        }
        return totalGraos;
    }
    public static void main(String[] args) {
        long totalGraos = processarTotalGraos();

    }
}

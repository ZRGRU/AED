import java.util.Scanner;

public class Aula_Laco_Repeticao {
    
    final static Scanner TECLADO_SCANNER = new Scanner(System.in);

    public static void imprimirInteiro(int inteiro) {
        System.out.println(inteiro);
    }

    public static void processar() {
        int i = 0;

        for(i = 1 /*Valor inicial*/; i < 6 /*Teste boleano*/; i++ /*Incremento*/){
           
            imprimirInteiro(i);
        }
    }
    public static void main(String[] args) {
        processar();
    }
}



package ListaJava01;

public class Ex08_DiaSemana {
    public static void main(String[] args) {
        
        Util.imprimir("Digite um número correspondente ao dia da semana (1-7): ");
        int diaSemana = Util.lerValorInteiro();
        
        switch(diaSemana) {
            case 1:
            Util.imprimir("O dia correspondente é: Domingo.");
            break;
            case 2:
            Util.imprimir("O dia correspondente é: Segunda-feira.");
            break;
            case 3:
            Util.imprimir("O dia correspondente é: Terça-feira.");
            break;
            case 4:
            Util.imprimir("O dia correspondente é: Quarta-feira.");
            break;
            case 5:
            Util.imprimir("O dia correspondente é: Quinta-feira.");
            break;
            case 6:
            Util.imprimir("O dia correspondente é: Sexta-feira.");
            break;
            case 7:
            Util.imprimir("O dia correspondente é: Sábado.");
            break;
        default:
            Util.imprimir("Digite um número válido para o dia da semana.");
        }
    }
}
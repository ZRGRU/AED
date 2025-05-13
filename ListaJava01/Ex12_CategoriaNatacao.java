package ListaJava01;

public class Ex12_CategoriaNatacao {
    public static void main(String[] args) {
        Util.imprimir("Digite a idade do atleta: ");
        int idade = Util.lerValorInteiro();

        if (idade>=18) {
            Util.imprimir("Categoria 'sênior'.");
        } else {
            if (idade>13) {
                Util.imprimir("Categoria 'Juvenil B'.");
            } else {
                if (idade>9) {
                    Util.imprimir("Categoria 'Juvenil A'.");
                } else {
                    if (idade>5) {
                        Util.imprimir("Categoria 'Infantil B'.");
                    } else {
                        if (idade>2) {
                            Util.imprimir("Categoria 'Infantil A'.");
                        } else {
                            Util.imprimir("Erro. Idade fora do intervalo de categorias definidas.");
                        }
                    }
                }
            }
        }
    }
}

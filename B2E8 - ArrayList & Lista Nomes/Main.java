import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Lista lista1 = new Lista();
        final Lista lista2 = new Lista();
        Lista listaUniao = new Lista();
        Lista listaExclusao = new Lista();
        Lista listaIntersecao = new Lista();

        String[] nomesPessoa1 = {"Jorge", "João", "Jose", "Beth", "Carlos", "Michael"};
        String[] nomesPessoa2 = {"Jorge", "Kate", "Carlos", "Michelle", "Ryana"};

        Operations.InsereTodosNaLista(lista1, nomesPessoa1);
        Operations.InsereTodosNaLista(lista2, nomesPessoa2);

        listaUniao = Operations.ListaUniao(lista1, lista2);
        System.out.println("União: ");
        listaUniao.imprime();

        listaExclusao = Operations.ListaExclusao(lista1,lista2);
        System.out.println("Exclusão: ");
        listaExclusao.imprime();

        listaIntersecao = Operations.ListaIntersecao(lista1,lista2);
        System.out.println("Interseção: ");
        listaIntersecao.imprime();
    }
}
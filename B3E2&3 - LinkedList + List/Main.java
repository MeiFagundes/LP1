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

        Operations.insertAll(lista1, nomesPessoa1);
        Operations.insertAll(lista2, nomesPessoa2);

        listaUniao = Operations.ListaUniao(lista1, lista2);
        System.out.println("União: ");
        listaUniao.print();

        listaExclusao = Operations.ListaExclusao(lista1,lista2);
        System.out.println("Exclusão: ");
        listaExclusao.print();

        listaIntersecao = Operations.ListaIntersecao(lista1,lista2);
        System.out.println("Interseção: ");
        listaIntersecao.print();


        System.out.println("------------------------------------------------------\n------------------------------------------------------\n");
        

        String[] nomes = {"Ana", "Maria", "Mei", "Mei", "João", "João", "Letícia", "Marcela"};
        Lista nomesLista = new Lista();
        Operations.insertWithoutDuplicates(nomesLista, nomes);

        String nomeExemplo = "Mei";

        System.out.println("O nome '"+ nomeExemplo + "' existe na lista?: " + nomesLista.searchFromString(nomeExemplo));
        System.out.println("O index de '"+ nomeExemplo + "' é: " + nomesLista.getIndexOf("Maria"));
        
        nomesLista.print();
        nomesLista.remove(nomesLista.getIndexOf(nomeExemplo));
        nomesLista.printReverse();
    }
}
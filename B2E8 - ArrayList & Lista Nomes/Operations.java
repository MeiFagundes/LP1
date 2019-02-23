public class Operations {

    public static void InsereTodosNaLista(Lista lista, String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            lista.insereFim(new Pessoa(nomes[i]));
        }
    }

    public static Lista ListaUniao(Lista lista1, Lista lista2) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        copy(lista1, l1);
        copy(lista2, l2);
        
        for (int i = 0; i < l2.getTamanho(); i++) {
            if (l1.compare(l2.getPessoa(i))) 
            l2.removeAny(i);
        }
        l1.conecta(l2);
        return l1;
    }

    public static Lista ListaExclusao(Lista lista1, Lista lista2) {
        
        Lista listaUni = new Lista();
        Lista listaInt = new Lista();
        listaUni = ListaUniao(lista1,lista2);
        listaInt = ListaIntersecao(lista1,lista2);

        for (int i = 0; i < listaUni.getTamanho(); i++) {
            if (listaInt.compare(listaUni.getPessoa(i))) {
                listaUni.removeAny(i);
            }
        }
        return listaUni;
    }

    public static Lista ListaIntersecao(Lista lista1, Lista lista2) {
        Lista result = new Lista();
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        copy(lista1, l1);
        copy(lista2, l2);
        for (int i = 0; i < l2.getTamanho(); i++) {
            if (l1.compare(l2.getPessoa(i))) {
                result.insereFim(l2.getPessoa(i));
            }
        }
        return result;
    }

    public static void copy(Lista old, Lista nw){
        for (int i = 0; i < old.getTamanho(); i++) {
            nw.insereFim(new Pessoa(old.getPessoa(i).getNome()));
        }
    }
}
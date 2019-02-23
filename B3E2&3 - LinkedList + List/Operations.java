public class Operations {

    public static void insertAll(Lista lista, String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (!lista.searchFromString(str[i]))
                lista.insertTail(new Pessoa(str[i]));
        }
    }

    public static void insertWithoutDuplicates(Lista lista, String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (!lista.searchFromString(str[i]))
                lista.insertTail(new Pessoa(str[i]));
        }
    }

    public static Lista ListaUniao(Lista lista1, Lista lista2) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        copy(lista1, l1);
        copy(lista2, l2);
        
        for (int i = 0; i < l2.size(); i++) {
            if (l1.compareTo(l2.getPessoa(i))) 
            l2.remove(i);
        }
        l1.connect(l2);
        return l1;
    }

    public static Lista ListaExclusao(Lista lista1, Lista lista2) {
        
        Lista listaUni = new Lista();
        Lista listaInt = new Lista();
        listaUni = ListaUniao(lista1,lista2);
        listaInt = ListaIntersecao(lista1,lista2);

        for (int i = 0; i < listaUni.size(); i++) {
            if (listaInt.compareTo(listaUni.getPessoa(i))) {
                listaUni.remove(i);
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
        for (int i = 0; i < l2.size(); i++) {
            if (l1.compareTo(l2.getPessoa(i))) {
                result.insertTail(l2.getPessoa(i));
            }
        }
        return result;
    }

    public static void copy(Lista old, Lista nw){
        for (int i = 0; i < old.size(); i++) {
            nw.insertTail(new Pessoa(old.getPessoa(i).getNome()));
        }
    }
}
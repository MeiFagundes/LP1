public class Operations {

    public static LinkedList ListaUniao(LinkedList lista1, LinkedList lista2) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        copy(lista1, l1);
        copy(lista2, l2);
        
        for (int i = 0; i < l2.length(); i++) {
            if (l1.compareTo(l2.get(i))) {
            l2.remove(i);
            i--;
            }
        }
        l1.connect(l2);
        return l1;
    }

    public static LinkedList ListaExclusao(LinkedList lista1, LinkedList lista2) {
        LinkedList listaUni = new LinkedList();
        LinkedList listaInt = new LinkedList();
        listaUni = ListaUniao(lista1,lista2);
        listaInt = ListaIntersecao(lista1,lista2);

        for (int i = 0; i < listaUni.length(); i++) {
            if (listaInt.compareTo(listaUni.get(i))) {
                listaUni.remove(i);
                i--;
            }
        }
        return listaUni;
    }

    public static LinkedList ListaIntersecao(LinkedList lista1, LinkedList lista2) {
        LinkedList result = new LinkedList();
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        copy(lista1, l1);
        copy(lista2, l2);
        for (int i = 0; i < l2.length(); i++) {
            if (l1.compareTo(l2.get(i))) {
                result.insertTail(l2.getData(i));
            }
        }
        return result;
    }

    public static void copy(LinkedList old, LinkedList nw){
        for (int i = 0; i < old.length(); i++) {
            nw.insertTail(new Data(old.getData(i).GetData()));
        }
    }
}
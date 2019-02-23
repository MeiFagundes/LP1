public class Nodo {
    Data data;
    Nodo nextNodo;
    Nodo prevNodo;

    Nodo( Data data )
    {
        this (null, data, null );
    }


    Nodo(Data obj, Nodo nextNodo )
    {
        this(null, obj, nextNodo);
    }

    Nodo(Nodo prevNodo, Data obj)
    {
        this(prevNodo, obj, null);
    }

    Nodo(Nodo prevNodo, Data obj, Nodo nextNodo )
    {
        data = obj;
        this.prevNodo = prevNodo;
        this.nextNodo = nextNodo;
    }

    Data getData()
    {
        return data;
    }

    Nodo getProx()
    {
        return nextNodo;
    }
}


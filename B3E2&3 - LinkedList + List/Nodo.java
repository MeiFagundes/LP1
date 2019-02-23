public class Nodo {
    Pessoa pessoa;
    Nodo nextNodo;
    Nodo prevNodo;


    Nodo( Pessoa pessoa )
    {
        this (null, pessoa, null );
    }


    Nodo(Pessoa obj, Nodo nextNodo )
    {
        this(null, obj, nextNodo);
    }

    Nodo(Nodo prevNodo, Pessoa obj)
    {
        this(prevNodo, obj, null);
    }

    Nodo(Nodo prevNodo, Pessoa obj, Nodo nextNodo )
    {
        pessoa = obj;
        this.prevNodo = prevNodo;
        this.nextNodo = nextNodo;
    }


    Pessoa getPessoa()
    {
        return pessoa;
    }


    Nodo getProx()
    {
        return nextNodo;
    }
}


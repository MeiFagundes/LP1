public class Nodo {
    Pessoa pessoa;
    Nodo proxNodo;


    Nodo( Pessoa pessoa )
    {
        this ( pessoa, null );
    }


    Nodo( Pessoa obj, Nodo nodo )
    {
        pessoa = obj;
        proxNodo = nodo;
    }


    Pessoa getPessoa()
    {
        return pessoa;
    }


    Nodo getProx()
    {
        return proxNodo;
    }
}


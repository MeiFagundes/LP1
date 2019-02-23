// LinkedList v2 By Mei

public class Lista {
    private Nodo primNodo;
    private Nodo ultNodo;
    private String nome;


    public Lista(){
        this( "Lista Encadeada" );
    }


    public Lista( String listanome ){
        nome = listanome;
        primNodo = ultNodo = null;
    }


    public void insereInicio(Pessoa pessoa ){
        if ( listaVazia() )
            primNodo = ultNodo = new Nodo(pessoa );
        else
            primNodo = new Nodo(pessoa, primNodo );
    }


    public void insereFim(Pessoa pessoa ) {
        if ( listaVazia() )
            primNodo = ultNodo = new Nodo(pessoa);
        else
            ultNodo = ultNodo.proxNodo = new Nodo(pessoa);
    }


    public Object removeInicio() throws ExcecaoListaVazia {
        if ( listaVazia() ){
            throw new ExcecaoListaVazia( nome );
        }
        Pessoa pessoaRemovido = primNodo.pessoa;
        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        } else {
            primNodo = primNodo.proxNodo;
        }

        return pessoaRemovido;
    }


    public Object removeFim() throws ExcecaoListaVazia
    {
        if ( listaVazia() ){
            throw new ExcecaoListaVazia( nome );
        }

        Pessoa pessoaRemovido = ultNodo.pessoa;

        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        }
        else
        {
            Nodo atual = primNodo;
            while ( atual.proxNodo != ultNodo )
                atual = atual.proxNodo;
            ultNodo = atual;
            atual.proxNodo = null;
        }

        return  pessoaRemovido;
    }

    public void removeAny(int index) throws ExcecaoListaVazia
    {
        if ( listaVazia() ){
            throw new ExcecaoListaVazia( nome );
        }
        Nodo atual = primNodo;
        if (index == 0) {
            removeInicio();
            return;
        }
        else if (index == getTamanho() - 1) {
            removeFim();
            return;
        }
        else
        for (int i = 0; i < index - 1; i++) {
            atual = atual.proxNodo;
        }
        atual.proxNodo = atual.proxNodo.proxNodo;
    }


    public boolean listaVazia()
    {
        return primNodo == null;
    }


    public void imprime()
    {
        if ( listaVazia() )
        {
            System.out.printf( "Lista %s vazia\n", nome );
            return;
        }

        System.out.printf( "A %s é: ", nome );
        Nodo atual = primNodo;


        while ( atual != null )
        {
            System.out.printf( "%s ", atual.pessoa.getNome() );
            atual = atual.proxNodo;
        }

        System.out.println( "\n" );
    }

    public void conecta(Lista l){
        ultNodo.proxNodo = l.primNodo;
    }

    public Pessoa getPessoa(int index){
        Nodo atual = primNodo;
        for (int i = 0; i < index; i++) {
            atual = atual.proxNodo;
        }
        return atual.pessoa;
    }

    public int getTamanho(){
        int i = 0;
        Nodo atual = primNodo;
        for (i = 0; atual != null; i++) {
            atual = atual.proxNodo;
        }
            return i;
    }

    public boolean compare(Pessoa comp){
        if ( listaVazia() )
            return false;

        Nodo atual = primNodo;
        while ( atual != null )
        {
            if (atual.pessoa.getNome() == comp.getNome()) {
                return true;
            }
            atual = atual.proxNodo;
        }
        return false;
    }
}

// LinkedList v2 By Mei

public class Lista {
    private Nodo primNodo;
    private Nodo ultNodo;
    private String nome;
    private int size;


    public Lista(){
        this( "LinkedList" );
    }

    public Lista( String listanome ){
        nome = listanome;
        primNodo = ultNodo = null;
        size = 0;
    }

    public String get(int index){
        Nodo current;

        if (index + 1 > size || index < 0) {
            System.out.println("Index fora dos limites");
            return null;
        }

        if (size - index > size/2) {
            current = primNodo;
            for (int i = 0; i < index; i++) {
                current = current.nextNodo;
            }
            return current.pessoa.getNome();
        } else{
            current = ultNodo;
            for (int i = size - 1; i > index; i--) {
                current = current.prevNodo;
            }
            return current.pessoa.getNome();
        }

    }

    public int size(){
        return size;
    }

    public void insertHead(Pessoa pessoa ){
        if ( isEmpty() )
            primNodo = ultNodo = new Nodo(pessoa );
        else
            primNodo = new Nodo(pessoa, primNodo);
        size++;
    }

    public void insertTail(Pessoa pessoa ) {
        if ( isEmpty() )
            primNodo = ultNodo = new Nodo(pessoa);
        else
            ultNodo = ultNodo.nextNodo = new Nodo(ultNodo, pessoa);
        size++;
    }

    public Object removeHead() throws ExcecaoListaVazia {
        if ( isEmpty() ){
            throw new ExcecaoListaVazia( nome );
        }
        Pessoa pessoaRemovido = primNodo.pessoa;
        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        } else {
            primNodo = primNodo.nextNodo;
            primNodo.prevNodo = null;
        }
        size--;
        return pessoaRemovido;
    }

    public Object removeTail() throws ExcecaoListaVazia
    {
        if ( isEmpty() ){
            throw new ExcecaoListaVazia( nome );
        }

        Pessoa pessoaRemovido = ultNodo.pessoa;

        if ( primNodo == ultNodo ) {
            primNodo = ultNodo = null;
        }
        else
        {
            Nodo current = primNodo;
            while ( current.nextNodo != ultNodo )
                current = current.nextNodo;
            ultNodo = current;
            current.nextNodo = null;
        }
        size--;
        return  pessoaRemovido;
    }

    public void remove(int index) throws ExcecaoListaVazia
    {
        if (isEmpty() ){
            throw new ExcecaoListaVazia( nome );
        }
        Nodo current;



        current = primNodo;
        if (index == 0) {
            removeHead();
            return;
        }
        else if (index == size() - 1) {
            removeTail();
            return;
        }
        else{

            if (size - index > size/2) {
                current = primNodo;
                for (int i = 0; i < index - 1; i++) {
                    current = current.nextNodo;
                }
            } else{
                current = ultNodo;
                for (int i = size; i > index; i--) {
                    current = current.prevNodo;
                }
            }
    }

/*
        for (int i = 0; i < index - 1; i++) {
            current = current.nextNodo;
        }*/

        current.nextNodo.nextNodo.prevNodo = current.nextNodo.prevNodo;
        current.nextNodo = current.nextNodo.nextNodo;
        size--;
    }

    public boolean isEmpty()
    {
        return primNodo == null;
    }

    public void print()
    {
        if ( isEmpty() )
        {
            System.out.println("A Lista " + nome +  " está vazia.");
            return;
        }

        System.out.println("\nThe "+ nome +" consists of: ");
        Nodo current = primNodo;


        while ( current != null )
        {
            System.out.printf( "%s ", current.pessoa.getNome() );
            current = current.nextNodo;
        }

        System.out.printf( "\n" );
    }

    public void printReverse()
    {
        if ( isEmpty() )
        {
            System.out.println("A Lista " + nome +  " está vazia.");
            return;
        }

        System.out.println("\nThe "+ nome +" consists of (in reverse): ");
        Nodo current = ultNodo;


        while ( current != null )
        {
            System.out.printf( "%s ", current.pessoa.getNome() );
            current = current.prevNodo;
        }

        System.out.println( "\n" );
    }

    public void connect(Lista l){
        ultNodo.nextNodo = l.primNodo;
        ultNodo.nextNodo.prevNodo = ultNodo;

        Nodo current = primNodo;
        while ( current.nextNodo != null )
            current = current.nextNodo;
        ultNodo = current;

        size += l.size(); 
    }

    public Pessoa getPessoa(int index){
        Nodo current = primNodo;
        for (int i = 0; i < index; i++) {
            current = current.nextNodo;
        }
        return current.pessoa;
    }

    public boolean compareTo(Pessoa comp){
        if ( isEmpty() )
            return false;

        Nodo current = primNodo;
        while ( current != null )
        {
            if (current.pessoa.getNome() == comp.getNome()) {
                return true;
            }
            current = current.nextNodo;
        }
        return false;
    }

    public boolean searchFromString(String target){
        if ( isEmpty() )
            return false;

        Nodo current = primNodo;
        while ( current != null )
        {
            if (current.pessoa.getNome().equals(target)) {
                return true;
            }
            current = current.nextNodo;
        }
        return false;
    }

    public int getIndexOf(String target) throws ExcecaoListaVazia {
        if (isEmpty() ){
            throw new ExcecaoListaVazia( nome );
        }

        Nodo current = primNodo;

        for (int i = 0; i < size - 1; i++) {
            if (current.pessoa.getNome().equals(target)) {
                return i;
            }
            current = current.nextNodo;
        }
        return -1;

    }
}

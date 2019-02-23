public class ExcecaoListaVazia extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public ExcecaoListaVazia(){
        this( "Lista" );
    }

    public ExcecaoListaVazia( String nome )
    {
        super( nome + " está vazia" );
    }

}

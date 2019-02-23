public class ExcecaoListaVazia extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public ExcecaoListaVazia(){
        this( "GenericList" );
    }

    public ExcecaoListaVazia(String name)
    {
        super( name + " is empty" );
    }

}

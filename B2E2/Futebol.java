import java.util.*;

/**
 * Futebol extends Time
 */
public class Futebol extends Time {

    private String escudo;
    private String nome;
    
    Futebol(){
        this("escudo", 0, "sede", null, "nome");
    }
    Futebol(String escudo, int numeroJogadores, String sede, Date dataCriacao, String nome){
        super(numeroJogadores, sede, dataCriacao);
        this.escudo = escudo;
        this.nome = nome;
    }

    @Override
    void imprime(){
        System.out.println(
            "Nome do time: " + nome +
            "\nEscudo: " + escudo +
            "\nNumero de jogadores: " + numerojogadores +
            "\nSede do jogo: " + sede +
            "\nData de criação: " + dataCriacao + "\n"
        );
    }
    
    @Override
    void joga(String timeb){
        Random random = new Random();
        boolean value = random.nextBoolean();
        String Aux;
        if(value)
            Aux = getNome();
        else
            Aux = timeb;
            
        System.out.println(
            "O próximo jogo será jogado por" +
                Aux    + " de Futebol!"
        );
    }   
    /**
     * @param escudo the escudo to set
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the escudo
     */
    public String getEscudo() {
        return escudo;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
}
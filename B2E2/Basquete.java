import java.util.*;

/**
 * Basquete extends Time
 */
public class Basquete extends Time {

    private String regra;
    private String nome;

    Basquete(){
        this("escudo", 0, "sede", null, "nome");
    }
    Basquete(String regra, int numeroJogadores, String sede, Date dataCriacao, String nome){
        super(numeroJogadores, sede, dataCriacao);
        this.regra = regra;
        this.nome = nome;
    }

    @Override
    void imprime(){
        System.out.println(
            "Nome do time: " + nome +
            "\nRegras: " + regra +
            "\nNumero de jogadores: " + numerojogadores +
            "\nSede do jogo: " + sede +
            "\nData de criação: " + dataCriacao + "\n"
        );
    }

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
                Aux    + " de Basquete!"
        ); 
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param regra the regra to set
     */
    public void setRegra(String regra) {
        this.regra = regra;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the regra
     */
    public String getRegra() {
        return regra;
    }
}
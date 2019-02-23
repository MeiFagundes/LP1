import java.util.*;

/**
 * Time
 */
public abstract class Time {

    protected int numerojogadores;
    protected String sede;
    protected Date dataCriacao;

    Time(){
        this(0, "sede", null);
    }

    Time(int numerojogadores, String sede, Date dataCriacao){
        this.numerojogadores = numerojogadores;
        this.sede = sede;
        this.dataCriacao = dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public void setNumerojogadores(int numerojogadores) {
        this.numerojogadores = numerojogadores;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public Date getDataCriacao() {
        return dataCriacao;
    }
    public int getNumerojogadores() {
        return numerojogadores;
    }
    public String getSede() {
        return sede;
    }

    abstract void imprime();
    abstract void joga(String timeb);
}
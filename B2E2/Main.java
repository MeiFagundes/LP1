import java.util.*;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Futebol futebol[] = new Futebol[2];
        futebol[0] = new Futebol("SeaHalks shield", 35, "Seattle", date, "SeaHalks");
        futebol[1] = new Futebol("Chigago shield", 35, "Chicago", date, "Chicago Bulls");
        Basquete basquete[] = new Basquete[2];
        basquete[0] = new Basquete("O jogo não poderá ter mais de 15 jogadores", 15, "Washington", date, "Time tops");
        basquete[1] = new Basquete("O jogo não poderá ter mais de 15 jogadores", 15, "Chicago", date, "Time Chigado tops");
        
        futebol[0].joga(futebol[1].getNome());
        futebol[0].imprime();
        futebol[1].imprime();
        basquete[0].joga(basquete[1].getNome());
        basquete[0].imprime();
        basquete[1].imprime();
    }
}
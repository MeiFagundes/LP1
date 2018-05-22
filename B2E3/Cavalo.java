/**
 * Cavalo
 */
public class Cavalo extends Animal {

    Cavalo(String nome, int idade){
        super(nome, idade);
    }
    Cavalo(){
        this("Cavalo", 0);
    }

    @Override
    void emiteSom() {
        System.out.println("hiihiiihii!");
    }

    void corre(){
        System.out.println("Cavalo correu!");
    }
}
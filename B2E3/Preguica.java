/**
 * Preguica
 */
public class Preguica extends Animal {

    Preguica(String nome, int idade){
        super(nome, idade);
    }
    Preguica(){
        this("Preguica", 0);
    }

    @Override
    void emiteSom() {
        System.out.println("Hmmmmm!");
    }

    void sobe(){
        System.out.println("Preguica subiu em uma árvore!");
    }
}
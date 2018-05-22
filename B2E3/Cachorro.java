/**
 * Cachorro extends Animal
 */
public class Cachorro extends Animal {

    Cachorro(String nome, int idade){
        super(nome, idade);
    }
    Cachorro(){
        this("Cachorro", 0);
    }

    @Override
    void emiteSom() {
        System.out.println("Auauau!");
    }

    void corre(){
        System.out.println("Cachorro correu!");
    }
    
}
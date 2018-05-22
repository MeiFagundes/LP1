/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Animal animal[] = new Animal[3];

        Cavalo cavalo;
        Preguica preguica;
        Cachorro cachorro;

        animal[0] = new Cavalo("Pacotó", 12);
        animal[1] = new Preguica("Soninho", 5);
        animal[2] = new Cachorro("Rex", 7);

        cavalo = (Cavalo) animal[0];
        preguica = (Preguica) animal[1];
        cachorro = (Cachorro) animal[2];

        cavalo.corre();
        animal[0].emiteSom();
        preguica.sobe();
        animal[1].emiteSom();
        cachorro.corre();
        animal[2].emiteSom();
    }
}
import jdk.nashorn.internal.codegen.types.BooleanType;

public class Carro {
    int pos;
    int lane;
    static int cont = 1; 
    int id;
    boolean travessia = false;

    // Construtores

    public Carro(){
        this(-1, -1);
    }

    public Carro(int pos, int lane){
        this.pos = pos;
        this.lane = lane;
        id = cont;
        cont++;
    }

    // Métodos SET

    public void setLane(int lane){
        this.lane = lane;
    }

    public void setPos(int pos){
        this.pos = pos;
    }

    public void setTravessia(boolean travessia){
        this.travessia = travessia;
    }

    // Métodos GET

    public int getLane(){
        return lane;
    }

    public int getPos(){
        return pos;
    }

    public int getCont(){
        return id;
    }

    public boolean getTravessia(){
        return travessia;
    }
}
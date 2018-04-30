public class Movimento{

    public static void go(Carro carro, boolean virarDireita){
        if(carro.getTravessia() == false && virarDireita == true && ((carro.getPos() == 2 && (carro.getLane() == 0 || carro.getLane() == 3)) || (carro.getPos() == 3 && (carro.getLane() == 1 || carro.getLane() == 2)) )){
            goDireita(carro);
        } else 
            goFrente(carro);
    }

    public static void goDireita(Carro carro){
        if(carro.getTravessia() == false){
            if(carro.getLane() == 1)
                carro.setPos(carro.getPos() - 1);
            if(carro.getLane() == 3){
                carro.setPos(carro.getPos() + 1);
                carro.setLane(0);
            }
            else
                carro.setLane(carro.getLane() + 1);
            carro.setTravessia(true);
        } else {
            System.out.println("Comando proibido!");
        }
        
    }

    public static void goFrente(Carro carro){
        if(carro.getTravessia() == false){
            if(carro.getLane() <= 1)
                carro.setLane(carro.getLane() + 2);
            else
                carro.setLane(carro.getLane() - 2);
            carro.setTravessia(true);
        } else {
            carro.setPos(carro.getPos() - 2);
        }
    }
}
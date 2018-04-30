package workbencha;

public enum WhoisRIR {
    VERMELHO(0),
    AMARELO(1),
    VERDE(2);

    private int sinal;

    WhoisRIR(int sinal) {
        this.sinal = sinal;
    }

    /*public void setSinal(int sinal){
        this.sinal = sinal;
    }

    public void nextSinal(){
        sinal = (sinal < 2) ? sinal++ : 0;
    }*/

    public int verSinal(){
        return sinal;
    }
}
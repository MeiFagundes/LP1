public class Time {
    
    private int hora, min, seg;
    
    Time(int hora, int min, int seg){
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }
    Time(){
        this( 0, 0, 0);
    }
    
    void setHora(int hora){
        this.hora = (hora <= 24 && hora >= 0) ? hora : 0;
    }
        
    void setMin(int min){
        this.min = (min <= 60 && min >= 0) ? min : 0;
    }
        
    void setSeg(int seg){
        this.seg = (seg <= 60 && seg >= 0) ? seg : 0;
    }
    
    int getHora(){
        return hora;
    }
    
    int getMin(){
        return min;
    }
    
    int getSeg(){
        return seg;
    }
}

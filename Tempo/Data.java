public class Data {
    
    private int ano, mes, dia;
    private Time time;
    
    Data(int ano, int mes, int dia, int hora, int min, int seg){
        setAno(ano);
        setMes(mes);
        setDia(dia);
        time = new Time(hora, min, seg);
    }
    
    Data(int ano, int mes, int dia){
        this(ano, mes, dia, 0, 0, 0);
    }
    
    Data(){
        this(0, 0, 0, 0, 0, 0);
    }
    
    void setAno(int ano){
        this.ano = ano;
    }
        
    void setMes(int mes){
        this.mes = (mes <= 12 && mes >= 0) ? mes : 0;
    }
        
    void setDia(int dia){
        this.dia = (dia <= 31 && dia >= 0) ? dia : 0;
    }
    
    void setHora(int hora){
        setHora(hora);
    }
        
    void setMin(int min){
        setMin(min);
    }
        
    void setSeg(int seg){
        setSeg(seg);
    }
    
    int getAno(){
        return ano;
    }
    
    int getMes(){
        return mes;
    }
    
    int getDia(){
        return dia;
    }
    int getHora(){
        return time.getHora();
    }
    
    int getMin(){
        return time.getMin();
    }
    
    int getSeg(){
        return time.getSeg();
    }
}

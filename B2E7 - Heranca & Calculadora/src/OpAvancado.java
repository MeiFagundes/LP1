
public class OpAvancado extends OpBasico{
    
    private double resultado;

    // Set/Get Resultado
    public double getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    //Operações com INT
    public double potencia(int x, int y){
        return Math.pow(x, y);
    }
    public double fatorial(int x){
        double result = 1;
        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }
        return result;
    }
    public double distancia(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2) );
    }  
    
    // Operações com FLOAT
    public double potencia(double x, double y){
        return Math.pow(x, y);
    }
    public double fatorial(double x){
        double result = 1;
        for (int factor = 2; factor <= x; factor++) {
            result *= factor;
        }
        return result;
    }
    public double distancia(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
    }  
}

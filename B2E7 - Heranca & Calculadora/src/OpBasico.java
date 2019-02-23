
public class OpBasico {
    private double resultado;

    // Set/Get Resultado
    public double getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    // Operações com INT
    public int soma(int x, int y){
        return x+y;
    }
    public int subtracao(int x, int y){
        return x-y;
    }
    public double divisao(int x, int y){
        return x/y;
    }
    
    // Operações com FLOAT
    public double soma(double x, double y){
        return x+y;
    }
    public double subtracao(double x, double y){
        return x-y;
    }
    public double divisao(double x, double y){
        return x/y;
    }

}

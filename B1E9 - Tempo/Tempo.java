import java.util.*;

public class Tempo {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Data[] data = new Data[1];
        
        
        for(int i = 0; i < data.length; i++){
            data[i] = new Data(
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt(),
                in.nextInt()        
            );
        }
        
        for(int i = 0; i < data.length; i++){
            System.out.println(
                "\ndata[" + i + "]" +
                "\nAno: " + data[i].getAno() +
                "\nMes: " + data[i].getMes() +
                "\nDia: " + data[i].getDia() +
                "\nHora: " + data[i].getHora() +
                "\nMin: " + data[i].getMin() +
                "\nSeg: " + data[i].getSeg()
            );
        }
    }
    
}

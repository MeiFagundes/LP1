
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva x1: ");
        int x1 = sc.nextInt();
        System.out.println("Escreva y1: ");
        int y1 = sc.nextInt();
        System.out.println("Escreva x2: ");
        int x2 = sc.nextInt();
        System.out.println("Escreva y2: ");
        int y2 = sc.nextInt();
        System.out.println("Escreva x3: ");
        int x3 = sc.nextInt();
        System.out.println("Escreva y3: ");
        int y3 = sc.nextInt();
        System.out.println("Escreva x4: ");
        int x4 = sc.nextInt();
        System.out.println("Escreva y4: ");
        int y4 = sc.nextInt();
        
        System.out.println(ret.area(x1, y1, x2, y2, x3, y3, x4, y4));
    }
    
}
